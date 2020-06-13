package com.morenn.converter.utils

val fuelList = listOf(
    UnitType.MILES_PER_GALLON_UK,
    UnitType.MILES_PER_GALLON_US,
    UnitType.KILOMETERS_PER_LITER,
    UnitType.LITERS_PER_100_KILOMETERS
)

fun convertFuelConsumptions(primaryValue: Double, primaryUnit: UnitType?, secondaryUnit: UnitType?): Double {
    if (primaryUnit != null && secondaryUnit != null) {
        val coefficient: Double = when {
            primaryUnit == UnitType.MILES_PER_GALLON_UK && secondaryUnit == UnitType.MILES_PER_GALLON_UK -> 1.0
            primaryUnit == UnitType.MILES_PER_GALLON_UK && secondaryUnit == UnitType.MILES_PER_GALLON_US -> 0.83267418464614
            primaryUnit == UnitType.MILES_PER_GALLON_UK && secondaryUnit == UnitType.KILOMETERS_PER_LITER -> 0.35400619
            primaryUnit == UnitType.MILES_PER_GALLON_UK && secondaryUnit == UnitType.LITERS_PER_100_KILOMETERS -> 282.48093627967

            primaryUnit == UnitType.MILES_PER_GALLON_US && secondaryUnit == UnitType.MILES_PER_GALLON_UK -> 1.2009499254801
            primaryUnit == UnitType.MILES_PER_GALLON_US && secondaryUnit == UnitType.MILES_PER_GALLON_US -> 1.0
            primaryUnit == UnitType.MILES_PER_GALLON_US && secondaryUnit == UnitType.KILOMETERS_PER_LITER -> 0.4251437075
            primaryUnit == UnitType.MILES_PER_GALLON_US && secondaryUnit == UnitType.LITERS_PER_100_KILOMETERS -> 235.21458329475

            primaryUnit == UnitType.KILOMETERS_PER_LITER && secondaryUnit == UnitType.MILES_PER_GALLON_UK -> 2.8248093627967
            primaryUnit == UnitType.KILOMETERS_PER_LITER && secondaryUnit == UnitType.MILES_PER_GALLON_US -> 2.3521458329476
            primaryUnit == UnitType.KILOMETERS_PER_LITER && secondaryUnit == UnitType.KILOMETERS_PER_LITER -> 1.0
            primaryUnit == UnitType.KILOMETERS_PER_LITER && secondaryUnit == UnitType.LITERS_PER_100_KILOMETERS -> 100.0

            primaryUnit == UnitType.LITERS_PER_100_KILOMETERS && secondaryUnit == UnitType.MILES_PER_GALLON_UK -> 282.48093627967
            primaryUnit == UnitType.LITERS_PER_100_KILOMETERS && secondaryUnit == UnitType.MILES_PER_GALLON_US -> 235.21458329475
            primaryUnit == UnitType.LITERS_PER_100_KILOMETERS && secondaryUnit == UnitType.KILOMETERS_PER_LITER -> 100.0
            primaryUnit == UnitType.LITERS_PER_100_KILOMETERS && secondaryUnit == UnitType.LITERS_PER_100_KILOMETERS -> 1.0

            else -> 0.0
        }

        return primaryValue * coefficient
    }

    return 0.0
}