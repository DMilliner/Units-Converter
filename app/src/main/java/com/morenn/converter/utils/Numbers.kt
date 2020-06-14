package com.morenn.converter.utils

import com.morenn.converter.utils.RomanNumber.fromRoman
import com.morenn.converter.utils.RomanNumber.preCheckToRoman
import java.lang.Exception
import java.util.TreeMap

val numbersList = listOf(
    UnitType.BASE_10,
    UnitType.ROMAN
)

fun convertNumbers(primaryValue: String, primaryUnit: UnitType?, secondaryUnit: UnitType?): String {
    if (primaryUnit != null && secondaryUnit != null) {
        return when {
            primaryUnit == UnitType.BASE_10 && secondaryUnit == UnitType.BASE_10 -> primaryValue
            primaryUnit == UnitType.BASE_10 && secondaryUnit == UnitType.ROMAN -> preCheckToRoman(primaryValue)

            primaryUnit == UnitType.ROMAN && secondaryUnit == UnitType.BASE_10 -> fromRoman(primaryValue).toString()
            primaryUnit == UnitType.ROMAN && secondaryUnit == UnitType.ROMAN -> primaryValue

            else -> ""
        }
    }

    return ""
}

object RomanNumber {
    private val base10Map: TreeMap<Int, String> = TreeMap<Int, String>()
    private val romanMap: TreeMap<String, Int> = TreeMap<String, Int>()

    fun preCheckToRoman(_number: String): String {
        val castNumber: Int = try {
            _number.toInt()
        } catch (e: Exception) {
            0
        }
        return toRoman(castNumber) ?: ""
    }

    private fun toRoman(number: Int): String? {
        val l: Int = base10Map.floorKey(number) ?: 0
        return if (number == l) {
            base10Map[number]
        } else  {
            base10Map[l].toString() + toRoman(number - l)
        }
    }

    fun fromRoman(romanNumber: String): Int {
        var decimal = 0
        var lastNumber = 0
        val romanNumeral = romanNumber.toUpperCase()

        for (x in romanNumeral.length - 1 downTo 0) {
            val roman = romanMap[romanNumeral[x].toString()] ?: 0
            decimal = processDecimal(roman, lastNumber, decimal)
            lastNumber = roman
        }

        return decimal
    }

    private fun processDecimal(decimal: Int, lastNumber: Int, lastDecimal: Int): Int {
        return if (lastNumber > decimal) {
            lastDecimal - decimal
        } else {
            lastDecimal + decimal
        }
    }

    init {
        base10Map[1000] = "M"
        base10Map[900] = "CM"
        base10Map[500] = "D"
        base10Map[400] = "CD"
        base10Map[100] = "C"
        base10Map[90] = "XC"
        base10Map[50] = "L"
        base10Map[40] = "XL"
        base10Map[10] = "X"
        base10Map[9] = "IX"
        base10Map[5] = "V"
        base10Map[4] = "IV"
        base10Map[1] = "I"

        romanMap["M"] = 1000
        romanMap["CM"] = 900
        romanMap["D"] = 500
        romanMap["CD"] = 400
        romanMap["C"] = 100
        romanMap["XC"] = 90
        romanMap["L"] = 50
        romanMap["XL"] = 40
        romanMap["X"] = 10
        romanMap["IX"] = 9
        romanMap["V"] = 5
        romanMap["IV"] = 4
        romanMap["I"] = 1
    }
}