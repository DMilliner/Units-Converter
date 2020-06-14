package com.morenn.converter.utils

import kotlin.math.pow

val timesList = listOf(
    UnitType.SECOND,
    UnitType.MINUTE,
    UnitType.HOUR,
    UnitType.DAY,
    UnitType.WEEK,
    UnitType.MONTH,
    UnitType.YEAR
)

fun convertTimes(primaryValue: Double, primaryUnit: UnitType?, secondaryUnit: UnitType?): Double {
    if (primaryUnit != null && secondaryUnit != null) {
        val coefficient: Double = when {
            primaryUnit == UnitType.SECOND && secondaryUnit == UnitType.SECOND -> 1.0
            primaryUnit == UnitType.SECOND && secondaryUnit == UnitType.MINUTE -> 0.016666666666667
            primaryUnit == UnitType.SECOND && secondaryUnit == UnitType.HOUR -> 0.00027777777777778
            primaryUnit == UnitType.SECOND && secondaryUnit == UnitType.DAY -> 1.1574074074074 * 10.0.pow(-5)
            primaryUnit == UnitType.SECOND && secondaryUnit == UnitType.WEEK -> 1.6534391534392 * 10.0.pow(-6)
            primaryUnit == UnitType.SECOND && secondaryUnit == UnitType.MONTH -> 3.802715138609 * 10.0.pow(-7)
            primaryUnit == UnitType.SECOND && secondaryUnit == UnitType.YEAR -> 3.1688738506811 * 10.0.pow(-8)

            primaryUnit == UnitType.MINUTE && secondaryUnit == UnitType.SECOND -> 60.0
            primaryUnit == UnitType.MINUTE && secondaryUnit == UnitType.MINUTE -> 1.0
            primaryUnit == UnitType.MINUTE && secondaryUnit == UnitType.HOUR -> 0.016666666666667
            primaryUnit == UnitType.MINUTE && secondaryUnit == UnitType.DAY -> 0.00069444444444444
            primaryUnit == UnitType.MINUTE && secondaryUnit == UnitType.WEEK -> 9.9206349206349 * 10.0.pow(-5)
            primaryUnit == UnitType.MINUTE && secondaryUnit == UnitType.MONTH -> 2.2816290831654 * 10.0.pow(-5)
            primaryUnit == UnitType.MINUTE && secondaryUnit == UnitType.YEAR -> 1.9013243104087 * 10.0.pow(-6)

            primaryUnit == UnitType.HOUR && secondaryUnit == UnitType.SECOND -> 3600.0
            primaryUnit == UnitType.HOUR && secondaryUnit == UnitType.MINUTE -> 60.0
            primaryUnit == UnitType.HOUR && secondaryUnit == UnitType.HOUR -> 1.0
            primaryUnit == UnitType.HOUR && secondaryUnit == UnitType.DAY -> 0.041666666666667
            primaryUnit == UnitType.HOUR && secondaryUnit == UnitType.WEEK -> 0.005952380952381
            primaryUnit == UnitType.HOUR && secondaryUnit == UnitType.MONTH -> 0.0013689774498992
            primaryUnit == UnitType.HOUR && secondaryUnit == UnitType.YEAR -> 0.00011407945862452

            primaryUnit == UnitType.DAY && secondaryUnit == UnitType.SECOND -> 8.64 * 10.0.pow(4)
            primaryUnit == UnitType.DAY && secondaryUnit == UnitType.MINUTE -> 1440.0
            primaryUnit == UnitType.DAY && secondaryUnit == UnitType.HOUR -> 24.0
            primaryUnit == UnitType.DAY && secondaryUnit == UnitType.DAY -> 1.0
            primaryUnit == UnitType.DAY && secondaryUnit == UnitType.WEEK -> 0.14285714285714
            primaryUnit == UnitType.DAY && secondaryUnit == UnitType.MONTH -> 0.032855458797581
            primaryUnit == UnitType.DAY && secondaryUnit == UnitType.YEAR -> 0.0027379070069885

            primaryUnit == UnitType.WEEK && secondaryUnit == UnitType.SECOND -> 6.048 * 10.0.pow(5)
            primaryUnit == UnitType.WEEK && secondaryUnit == UnitType.MINUTE -> 1.008 * 10.0.pow(4)
            primaryUnit == UnitType.WEEK && secondaryUnit == UnitType.HOUR -> 168.0
            primaryUnit == UnitType.WEEK && secondaryUnit == UnitType.DAY -> 7.0
            primaryUnit == UnitType.WEEK && secondaryUnit == UnitType.WEEK -> 1.0
            primaryUnit == UnitType.WEEK && secondaryUnit == UnitType.MONTH -> 0.22998821158307
            primaryUnit == UnitType.WEEK && secondaryUnit == UnitType.YEAR -> 0.01916534904892

            primaryUnit == UnitType.MONTH && secondaryUnit == UnitType.SECOND -> 2.6297 * 10.0.pow(6)
            primaryUnit == UnitType.MONTH && secondaryUnit == UnitType.MINUTE -> 4.382833 * 10.0.pow(4)
            primaryUnit == UnitType.MONTH && secondaryUnit == UnitType.HOUR -> 730.47222222222
            primaryUnit == UnitType.MONTH && secondaryUnit == UnitType.DAY -> 30.436342592593
            primaryUnit == UnitType.MONTH && secondaryUnit == UnitType.WEEK -> 4.3480489417989
            primaryUnit == UnitType.MONTH && secondaryUnit == UnitType.MONTH -> 1.0
            primaryUnit == UnitType.MONTH && secondaryUnit == UnitType.YEAR -> 0.083331875651362

            primaryUnit == UnitType.YEAR && secondaryUnit == UnitType.SECOND -> 3.155695 * 10.0.pow(7)
            primaryUnit == UnitType.YEAR && secondaryUnit == UnitType.MINUTE -> 5.259492 * 10.0.pow(5)
            primaryUnit == UnitType.YEAR && secondaryUnit == UnitType.HOUR -> 8765.82
            primaryUnit == UnitType.YEAR && secondaryUnit == UnitType.DAY -> 365.2425
            primaryUnit == UnitType.YEAR && secondaryUnit == UnitType.WEEK -> 52.1775
            primaryUnit == UnitType.YEAR && secondaryUnit == UnitType.MONTH -> 12.000209909876
            primaryUnit == UnitType.YEAR && secondaryUnit == UnitType.YEAR -> 1.0

            else -> 0.0
        }

        return primaryValue * coefficient
    }

    return 0.0
}