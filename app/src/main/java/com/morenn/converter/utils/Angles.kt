package com.morenn.converter.utils

val anglesList = listOf(
    UnitType.DEGREE,
    UnitType.RADIAN
)

fun convertAngles(primaryValue: Double, primaryUnit: UnitType?, secondaryUnit: UnitType?): Double {
    if (primaryUnit != null && secondaryUnit != null) {
        val coefficient: Double = when {
            primaryUnit == UnitType.DEGREE && secondaryUnit == UnitType.DEGREE -> 1.0
            primaryUnit == UnitType.DEGREE && secondaryUnit == UnitType.RADIAN -> Math.PI / 180

            primaryUnit == UnitType.RADIAN && secondaryUnit == UnitType.DEGREE -> 180 / Math.PI
            primaryUnit == UnitType.RADIAN && secondaryUnit == UnitType.RADIAN -> 1.0
            else -> 0.0
        }

        return primaryValue * coefficient
    }

    return 0.0
}