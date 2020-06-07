package com.morenn.converter.utils

val bytesList = listOf(
    UnitType.BIT,
    UnitType.BYTE
)

fun convertBytes(primaryValue: Double, primaryUnit: UnitType?, secondaryUnit: UnitType?): Double {
    if (primaryUnit != null && secondaryUnit != null) {
        val coefficient: Double = when {
            primaryUnit == UnitType.BIT && secondaryUnit == UnitType.BIT -> 1.0
            primaryUnit == UnitType.DEGREE && secondaryUnit == UnitType.BYTE -> 0.125

            primaryUnit == UnitType.BYTE && secondaryUnit == UnitType.BIT -> 8.0
            primaryUnit == UnitType.BYTE && secondaryUnit == UnitType.BYTE -> 1.0
            else -> 0.0
        }

        return primaryValue * coefficient
    }

    return 0.0
}