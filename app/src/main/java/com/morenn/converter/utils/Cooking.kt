package com.morenn.converter.utils

import kotlin.math.pow

val cookingList = listOf(
    UnitType.CENTILITER,
    UnitType.CUP,
    UnitType.DECILITER,
    UnitType.LITER,
    UnitType.MILLILITER,
    UnitType.PINCH,
    UnitType.QUART,
    UnitType.TABLESPOON,
    UnitType.TEASPOON
)

fun convertCooking(primaryValue: Double, primaryUnit: UnitType?, secondaryUnit: UnitType?): Double {
    if (primaryUnit != null && secondaryUnit != null) {
        val coefficient: Double = when {
            primaryUnit == UnitType.CENTILITER && secondaryUnit == UnitType.CENTILITER -> 1.0
            primaryUnit == UnitType.CENTILITER && secondaryUnit == UnitType.CUP -> 0.0422675284
            primaryUnit == UnitType.CENTILITER && secondaryUnit == UnitType.DECILITER -> 1.0
            primaryUnit == UnitType.CENTILITER && secondaryUnit == UnitType.LITER -> 0.01
            primaryUnit == UnitType.CENTILITER && secondaryUnit == UnitType.MILLILITER -> 10.0
            primaryUnit == UnitType.CENTILITER && secondaryUnit == UnitType.PINCH -> 500.0
            primaryUnit == UnitType.CENTILITER && secondaryUnit == UnitType.QUART -> 0.0125
            primaryUnit == UnitType.CENTILITER && secondaryUnit == UnitType.TABLESPOON -> 0.66666666666667
            primaryUnit == UnitType.CENTILITER && secondaryUnit == UnitType.TEASPOON -> 2.0

            primaryUnit == UnitType.CUP && secondaryUnit == UnitType.CENTILITER -> 25.0
            primaryUnit == UnitType.CUP && secondaryUnit == UnitType.CUP -> 1.0
            primaryUnit == UnitType.CUP && secondaryUnit == UnitType.DECILITER -> 2.5
            primaryUnit == UnitType.CUP && secondaryUnit == UnitType.LITER -> 0.250
            primaryUnit == UnitType.CUP && secondaryUnit == UnitType.MILLILITER -> 250.0
            primaryUnit == UnitType.CUP && secondaryUnit == UnitType.PINCH -> 1.25 * 10.0.pow(4)
            primaryUnit == UnitType.CUP && secondaryUnit == UnitType.QUART -> 1.0
            primaryUnit == UnitType.CUP && secondaryUnit == UnitType.TABLESPOON -> 16.666666666667
            primaryUnit == UnitType.CUP && secondaryUnit == UnitType.TEASPOON -> 50.0

            primaryUnit == UnitType.DECILITER && secondaryUnit == UnitType.CENTILITER -> 10.0
            primaryUnit == UnitType.DECILITER && secondaryUnit == UnitType.CUP -> 0.4
            primaryUnit == UnitType.DECILITER && secondaryUnit == UnitType.DECILITER -> 1.0
            primaryUnit == UnitType.DECILITER && secondaryUnit == UnitType.LITER -> 0.1
            primaryUnit == UnitType.DECILITER && secondaryUnit == UnitType.MILLILITER -> 100.0
            primaryUnit == UnitType.DECILITER && secondaryUnit == UnitType.PINCH -> 5000.0
            primaryUnit == UnitType.DECILITER && secondaryUnit == UnitType.QUART -> 0.125
            primaryUnit == UnitType.DECILITER && secondaryUnit == UnitType.TABLESPOON -> 6.6666666666667
            primaryUnit == UnitType.DECILITER && secondaryUnit == UnitType.TEASPOON -> 20.0

            primaryUnit == UnitType.LITER && secondaryUnit == UnitType.CENTILITER -> 100.0
            primaryUnit == UnitType.LITER && secondaryUnit == UnitType.CUP -> 4.0
            primaryUnit == UnitType.LITER && secondaryUnit == UnitType.DECILITER -> 10.0
            primaryUnit == UnitType.LITER && secondaryUnit == UnitType.LITER -> 1.0
            primaryUnit == UnitType.LITER && secondaryUnit == UnitType.MILLILITER -> 1000.0
            primaryUnit == UnitType.LITER && secondaryUnit == UnitType.PINCH -> 5.0 * 10.0.pow(4)
            primaryUnit == UnitType.LITER && secondaryUnit == UnitType.QUART -> 1.25
            primaryUnit == UnitType.LITER && secondaryUnit == UnitType.TABLESPOON -> 66.666666666667
            primaryUnit == UnitType.LITER && secondaryUnit == UnitType.TEASPOON -> 200.0

            primaryUnit == UnitType.MILLILITER && secondaryUnit == UnitType.CENTILITER -> 0.1
            primaryUnit == UnitType.MILLILITER && secondaryUnit == UnitType.CUP -> 0.004
            primaryUnit == UnitType.MILLILITER && secondaryUnit == UnitType.DECILITER -> 0.01
            primaryUnit == UnitType.MILLILITER && secondaryUnit == UnitType.LITER -> 0.001
            primaryUnit == UnitType.MILLILITER && secondaryUnit == UnitType.MILLILITER -> 1.0
            primaryUnit == UnitType.MILLILITER && secondaryUnit == UnitType.PINCH -> 50.0
            primaryUnit == UnitType.MILLILITER && secondaryUnit == UnitType.QUART -> 0.00125
            primaryUnit == UnitType.MILLILITER && secondaryUnit == UnitType.TABLESPOON -> 0.066666666666667
            primaryUnit == UnitType.MILLILITER && secondaryUnit == UnitType.TEASPOON -> 0.2

            primaryUnit == UnitType.PINCH && secondaryUnit == UnitType.CENTILITER -> 1.0
            primaryUnit == UnitType.PINCH && secondaryUnit == UnitType.CUP -> 8.0 * 10.0.pow(-5)
            primaryUnit == UnitType.PINCH && secondaryUnit == UnitType.DECILITER -> 0.0002
            primaryUnit == UnitType.PINCH && secondaryUnit == UnitType.LITER -> 2.0 * 10.0.pow(-5)
            primaryUnit == UnitType.PINCH && secondaryUnit == UnitType.MILLILITER -> 0.02
            primaryUnit == UnitType.PINCH && secondaryUnit == UnitType.PINCH -> 1.0
            primaryUnit == UnitType.PINCH && secondaryUnit == UnitType.QUART -> 2.5 * 10.0.pow(-5)
            primaryUnit == UnitType.PINCH && secondaryUnit == UnitType.TABLESPOON -> 0.0013333333333333
            primaryUnit == UnitType.PINCH && secondaryUnit == UnitType.TEASPOON -> 0.004

            primaryUnit == UnitType.QUART && secondaryUnit == UnitType.CENTILITER -> 80.0
            primaryUnit == UnitType.QUART && secondaryUnit == UnitType.CUP -> 3.2
            primaryUnit == UnitType.QUART && secondaryUnit == UnitType.DECILITER -> 8.0
            primaryUnit == UnitType.QUART && secondaryUnit == UnitType.LITER -> 0.8
            primaryUnit == UnitType.QUART && secondaryUnit == UnitType.MILLILITER -> 800.0
            primaryUnit == UnitType.QUART && secondaryUnit == UnitType.PINCH -> 4.0 * 10.0.pow(4)
            primaryUnit == UnitType.QUART && secondaryUnit == UnitType.QUART -> 1.0
            primaryUnit == UnitType.QUART && secondaryUnit == UnitType.TABLESPOON -> 53.333333333333
            primaryUnit == UnitType.QUART && secondaryUnit == UnitType.TEASPOON -> 160.0

            primaryUnit == UnitType.TABLESPOON && secondaryUnit == UnitType.CENTILITER -> 1.5
            primaryUnit == UnitType.TABLESPOON && secondaryUnit == UnitType.CUP -> 0.06
            primaryUnit == UnitType.TABLESPOON && secondaryUnit == UnitType.DECILITER -> 0.15
            primaryUnit == UnitType.TABLESPOON && secondaryUnit == UnitType.LITER -> 0.015
            primaryUnit == UnitType.TABLESPOON && secondaryUnit == UnitType.MILLILITER -> 15.0
            primaryUnit == UnitType.TABLESPOON && secondaryUnit == UnitType.PINCH -> 750.0
            primaryUnit == UnitType.TABLESPOON && secondaryUnit == UnitType.QUART -> 0.01875
            primaryUnit == UnitType.TABLESPOON && secondaryUnit == UnitType.TABLESPOON -> 1.0
            primaryUnit == UnitType.TABLESPOON && secondaryUnit == UnitType.TEASPOON -> 3.0

            primaryUnit == UnitType.TEASPOON && secondaryUnit == UnitType.CENTILITER -> 0.5
            primaryUnit == UnitType.TEASPOON && secondaryUnit == UnitType.CUP -> 0.02
            primaryUnit == UnitType.TEASPOON && secondaryUnit == UnitType.DECILITER -> 0.05
            primaryUnit == UnitType.TEASPOON && secondaryUnit == UnitType.LITER -> 0.005
            primaryUnit == UnitType.TEASPOON && secondaryUnit == UnitType.MILLILITER -> 5.0
            primaryUnit == UnitType.TEASPOON && secondaryUnit == UnitType.PINCH -> 250.0
            primaryUnit == UnitType.TEASPOON && secondaryUnit == UnitType.QUART -> 0.00625
            primaryUnit == UnitType.TEASPOON && secondaryUnit == UnitType.TABLESPOON -> 0.33333333333333
            primaryUnit == UnitType.TEASPOON && secondaryUnit == UnitType.TEASPOON -> 1.0

            else -> 0.0
        }

        return primaryValue * coefficient
    }

    return 0.0
}