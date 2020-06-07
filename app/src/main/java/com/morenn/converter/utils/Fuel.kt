package com.morenn.converter.utils

val fuelList = listOf(
    UnitType.GALLONS_PER_MILE,
    UnitType.MILES_PER_GALLON,
    UnitType.KILOMETERS_PER_LITER,
    UnitType.LITERS_PER_KILOMETER
)

fun convertFuelConsumptions(primaryValue: Double, primaryUnit: UnitType?, secondaryUnit: UnitType?): Double {
    return 0.0
}