package com.morenn.converter.utils

import kotlin.math.pow

val massList = listOf<UnitType>(
    UnitType.GRAM,
    UnitType.KILOGRAM,
    UnitType.MEGATON,
    UnitType.OUNCE,
    UnitType.POUND,
    UnitType.QUINTAL,
    UnitType.STONE,
    UnitType.TON
)

fun convertMass(primaryValue: Double, primaryUnit: UnitType?, secondaryUnit: UnitType?): Double {
    if (primaryUnit != null && secondaryUnit != null) {
        val coefficient: Double = when {
            primaryUnit == UnitType.GRAM && secondaryUnit == UnitType.GRAM -> 1.0
            primaryUnit == UnitType.GRAM && secondaryUnit == UnitType.KILOGRAM -> 0.001
            primaryUnit == UnitType.GRAM && secondaryUnit == UnitType.MEGATON -> 1.0 * 10.0.pow(-12)
            primaryUnit == UnitType.GRAM && secondaryUnit == UnitType.OUNCE -> 0.03527396194958
            primaryUnit == UnitType.GRAM && secondaryUnit == UnitType.POUND -> 0.0022046226218488
            primaryUnit == UnitType.GRAM && secondaryUnit == UnitType.QUINTAL -> 1.0 * 10.0.pow(-5)
            primaryUnit == UnitType.GRAM && secondaryUnit == UnitType.STONE -> 0.00015747304441777
            primaryUnit == UnitType.GRAM && secondaryUnit == UnitType.TON -> 1.0 * 10.0.pow(-6)

            primaryUnit == UnitType.KILOGRAM && secondaryUnit == UnitType.GRAM -> 1000.0
            primaryUnit == UnitType.KILOGRAM && secondaryUnit == UnitType.KILOGRAM -> 1.0
            primaryUnit == UnitType.KILOGRAM && secondaryUnit == UnitType.MEGATON -> 1.0 * 10.0.pow(-9)
            primaryUnit == UnitType.KILOGRAM && secondaryUnit == UnitType.OUNCE -> 35.27396194958
            primaryUnit == UnitType.KILOGRAM && secondaryUnit == UnitType.POUND -> 2.2046226218488
            primaryUnit == UnitType.KILOGRAM && secondaryUnit == UnitType.QUINTAL -> 0.01
            primaryUnit == UnitType.KILOGRAM && secondaryUnit == UnitType.STONE -> 0.15747304441777
            primaryUnit == UnitType.KILOGRAM && secondaryUnit == UnitType.TON -> 0.001

            primaryUnit == UnitType.MEGATON && secondaryUnit == UnitType.GRAM -> 1.0 * 10.0.pow(12)
            primaryUnit == UnitType.MEGATON && secondaryUnit == UnitType.KILOGRAM -> 1.0 * 10.0.pow(9)
            primaryUnit == UnitType.MEGATON && secondaryUnit == UnitType.MEGATON -> 1.0
            primaryUnit == UnitType.MEGATON && secondaryUnit == UnitType.OUNCE -> 3.527396 * 10.0.pow(10)
            primaryUnit == UnitType.MEGATON && secondaryUnit == UnitType.POUND -> 2.204623 * 10.0.pow(9)
            primaryUnit == UnitType.MEGATON && secondaryUnit == UnitType.QUINTAL -> 1.0 * 10.0.pow(7)
            primaryUnit == UnitType.MEGATON && secondaryUnit == UnitType.STONE -> 1.0
            primaryUnit == UnitType.MEGATON && secondaryUnit == UnitType.TON -> 1.0 * 10.0.pow(6)

            primaryUnit == UnitType.OUNCE && secondaryUnit == UnitType.GRAM -> 28.349523125
            primaryUnit == UnitType.OUNCE && secondaryUnit == UnitType.KILOGRAM -> 0.028349523125
            primaryUnit == UnitType.OUNCE && secondaryUnit == UnitType.MEGATON -> 2.8349523125 * 10.0.pow(-11)
            primaryUnit == UnitType.OUNCE && secondaryUnit == UnitType.OUNCE -> 1.0
            primaryUnit == UnitType.OUNCE && secondaryUnit == UnitType.POUND -> 0.0625
            primaryUnit == UnitType.OUNCE && secondaryUnit == UnitType.QUINTAL -> 0.00028349523125
            primaryUnit == UnitType.OUNCE && secondaryUnit == UnitType.STONE -> 0.0044642857142857
            primaryUnit == UnitType.OUNCE && secondaryUnit == UnitType.TON -> 2.8349523125 * 10.0.pow(-5)

            primaryUnit == UnitType.POUND && secondaryUnit == UnitType.GRAM -> 453.59237
            primaryUnit == UnitType.POUND && secondaryUnit == UnitType.KILOGRAM -> 0.45359237
            primaryUnit == UnitType.POUND && secondaryUnit == UnitType.MEGATON -> 4.5359237 * 10.0.pow(-10)
            primaryUnit == UnitType.POUND && secondaryUnit == UnitType.OUNCE -> 16.0
            primaryUnit == UnitType.POUND && secondaryUnit == UnitType.POUND -> 1.0
            primaryUnit == UnitType.POUND && secondaryUnit == UnitType.QUINTAL -> 0.0045359237
            primaryUnit == UnitType.POUND && secondaryUnit == UnitType.STONE -> 0.071428571428571
            primaryUnit == UnitType.POUND && secondaryUnit == UnitType.TON -> 0.00045359237

            primaryUnit == UnitType.QUINTAL && secondaryUnit == UnitType.GRAM -> 1.0 * 10.0.pow(5)
            primaryUnit == UnitType.QUINTAL && secondaryUnit == UnitType.KILOGRAM -> 100.0
            primaryUnit == UnitType.QUINTAL && secondaryUnit == UnitType.MEGATON -> 1.0 * 10.0.pow(-7)
            primaryUnit == UnitType.QUINTAL && secondaryUnit == UnitType.OUNCE -> 3527.396194958
            primaryUnit == UnitType.QUINTAL && secondaryUnit == UnitType.POUND -> 220.46226218488
            primaryUnit == UnitType.QUINTAL && secondaryUnit == UnitType.QUINTAL -> 1.0
            primaryUnit == UnitType.QUINTAL && secondaryUnit == UnitType.STONE -> 15.747304441777
            primaryUnit == UnitType.QUINTAL && secondaryUnit == UnitType.TON -> 0.1

            primaryUnit == UnitType.STONE && secondaryUnit == UnitType.GRAM -> 6350.29318
            primaryUnit == UnitType.STONE && secondaryUnit == UnitType.KILOGRAM -> 6.35029318
            primaryUnit == UnitType.STONE && secondaryUnit == UnitType.MEGATON -> 6.35029318 * 10.0.pow(-9)
            primaryUnit == UnitType.STONE && secondaryUnit == UnitType.OUNCE -> 224.0
            primaryUnit == UnitType.STONE && secondaryUnit == UnitType.POUND -> 14.0
            primaryUnit == UnitType.STONE && secondaryUnit == UnitType.QUINTAL -> 0.0635029318
            primaryUnit == UnitType.STONE && secondaryUnit == UnitType.STONE -> 1.0
            primaryUnit == UnitType.STONE && secondaryUnit == UnitType.TON -> 0.00635029318

            primaryUnit == UnitType.TON && secondaryUnit == UnitType.GRAM -> 1.0 * 10.0.pow(6)
            primaryUnit == UnitType.TON && secondaryUnit == UnitType.KILOGRAM -> 1000.0
            primaryUnit == UnitType.TON && secondaryUnit == UnitType.MEGATON -> 1.0 * 10.0.pow(-6)
            primaryUnit == UnitType.TON && secondaryUnit == UnitType.OUNCE -> 3.527396 * 10.0.pow(4)
            primaryUnit == UnitType.TON && secondaryUnit == UnitType.POUND -> 2204.6226218488
            primaryUnit == UnitType.TON && secondaryUnit == UnitType.QUINTAL -> 10.0
            primaryUnit == UnitType.TON && secondaryUnit == UnitType.STONE -> 157.47304441777
            primaryUnit == UnitType.TON && secondaryUnit == UnitType.TON -> 1.0

            else -> 0.0
        }

        return primaryValue * coefficient
    }

    return 0.0
}