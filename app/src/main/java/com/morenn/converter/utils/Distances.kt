package com.morenn.converter.utils

import kotlin.math.pow

val distancesList = listOf(
    UnitType.CENTIMETER,
    UnitType.FOOT,
    UnitType.INCH,
    UnitType.KILOMETER,
    UnitType.LIGHT_YEARS,
    UnitType.METER,
    UnitType.YARD
)

fun convertDistances(primaryValue: Double, primaryUnit: UnitType?, secondaryUnit: UnitType?): Double {
    if (primaryUnit != null && secondaryUnit != null) {
        val coefficient: Double = when {
            primaryUnit == UnitType.CENTIMETER && secondaryUnit == UnitType.CENTIMETER -> 1.0
            primaryUnit == UnitType.CENTIMETER && secondaryUnit == UnitType.FOOT -> 0.032808398950131
            primaryUnit == UnitType.CENTIMETER && secondaryUnit == UnitType.INCH -> 0.39370078740157
            primaryUnit == UnitType.CENTIMETER && secondaryUnit == UnitType.KILOMETER -> 1.0 * 10.0.pow(-5)
            primaryUnit == UnitType.CENTIMETER && secondaryUnit == UnitType.LIGHT_YEARS -> 1.0570008340246 * 10.0.pow(-18)
            primaryUnit == UnitType.CENTIMETER && secondaryUnit == UnitType.METER -> 6.6666666666667 * 10.0.pow(-6)
            primaryUnit == UnitType.CENTIMETER && secondaryUnit == UnitType.YARD -> 0.010936132983377

            primaryUnit == UnitType.FOOT && secondaryUnit == UnitType.CENTIMETER -> 30.48
            primaryUnit == UnitType.FOOT && secondaryUnit == UnitType.FOOT -> 1.0
            primaryUnit == UnitType.FOOT && secondaryUnit == UnitType.INCH -> 12.0
            primaryUnit == UnitType.FOOT && secondaryUnit == UnitType.KILOMETER -> 0.0003048
            primaryUnit == UnitType.FOOT && secondaryUnit == UnitType.LIGHT_YEARS -> 3.221738542107 * 10.0.pow(-17)
            primaryUnit == UnitType.FOOT && secondaryUnit == UnitType.METER -> 0.3048
            primaryUnit == UnitType.FOOT && secondaryUnit == UnitType.YARD -> 0.33333333333333

            primaryUnit == UnitType.INCH && secondaryUnit == UnitType.CENTIMETER -> 2.54
            primaryUnit == UnitType.INCH && secondaryUnit == UnitType.FOOT -> 0.083333333333333
            primaryUnit == UnitType.INCH && secondaryUnit == UnitType.INCH -> 1.0
            primaryUnit == UnitType.INCH && secondaryUnit == UnitType.KILOMETER -> 2.54 * 10.0.pow(-5)
            primaryUnit == UnitType.INCH && secondaryUnit == UnitType.LIGHT_YEARS -> 2.6847821184225 * 10.0.pow(-18)
            primaryUnit == UnitType.INCH && secondaryUnit == UnitType.METER -> 0.0254
            primaryUnit == UnitType.INCH && secondaryUnit == UnitType.YARD -> 0.027777777777778

            primaryUnit == UnitType.KILOMETER && secondaryUnit == UnitType.CENTIMETER -> 1.0 * 10.0.pow(5)
            primaryUnit == UnitType.KILOMETER && secondaryUnit == UnitType.FOOT -> 3280.8398950131
            primaryUnit == UnitType.KILOMETER && secondaryUnit == UnitType.INCH -> 3.937008 * 10.0.pow(4)
            primaryUnit == UnitType.KILOMETER && secondaryUnit == UnitType.KILOMETER -> 1.0
            primaryUnit == UnitType.KILOMETER && secondaryUnit == UnitType.LIGHT_YEARS -> 1.0570008340246 * 10.0.pow(-13)
            primaryUnit == UnitType.KILOMETER && secondaryUnit == UnitType.METER -> 1000.0
            primaryUnit == UnitType.KILOMETER && secondaryUnit == UnitType.YARD -> 1093.6132983377

            primaryUnit == UnitType.LIGHT_YEARS && secondaryUnit == UnitType.CENTIMETER -> 9.4607304725808 * 10.0.pow(17)
            primaryUnit == UnitType.LIGHT_YEARS && secondaryUnit == UnitType.FOOT -> 3.1039141970409 * 10.0.pow(16)
            primaryUnit == UnitType.LIGHT_YEARS && secondaryUnit == UnitType.INCH -> 3.7246970364491 * 10.0.pow(17)
            primaryUnit == UnitType.LIGHT_YEARS && secondaryUnit == UnitType.KILOMETER -> 9.4607304725808 * 10.0.pow(12)
            primaryUnit == UnitType.LIGHT_YEARS && secondaryUnit == UnitType.LIGHT_YEARS -> 1.0
            primaryUnit == UnitType.LIGHT_YEARS && secondaryUnit == UnitType.METER -> 9.4607304725808 * 10.0.pow(15)
            primaryUnit == UnitType.LIGHT_YEARS && secondaryUnit == UnitType.YARD -> 1.0346380656803 * 10.0.pow(16)

            primaryUnit == UnitType.METER && secondaryUnit == UnitType.CENTIMETER -> 100.0
            primaryUnit == UnitType.METER && secondaryUnit == UnitType.FOOT -> 3.2808398950131
            primaryUnit == UnitType.METER && secondaryUnit == UnitType.INCH -> 39.370078740157
            primaryUnit == UnitType.METER && secondaryUnit == UnitType.KILOMETER -> 0.001
            primaryUnit == UnitType.METER && secondaryUnit == UnitType.LIGHT_YEARS -> 1.0570008340246 * 10.0.pow(-16)
            primaryUnit == UnitType.METER && secondaryUnit == UnitType.METER -> 1.0
            primaryUnit == UnitType.METER && secondaryUnit == UnitType.YARD -> 1.0936132983377

            primaryUnit == UnitType.YARD && secondaryUnit == UnitType.CENTIMETER -> 91.44
            primaryUnit == UnitType.YARD && secondaryUnit == UnitType.FOOT -> 3.0
            primaryUnit == UnitType.YARD && secondaryUnit == UnitType.INCH -> 36.0
            primaryUnit == UnitType.YARD && secondaryUnit == UnitType.KILOMETER -> 0.0009144
            primaryUnit == UnitType.YARD && secondaryUnit == UnitType.LIGHT_YEARS -> 9.6652156263211 * 10.0.pow(-17)
            primaryUnit == UnitType.YARD && secondaryUnit == UnitType.METER -> 0.9144
            primaryUnit == UnitType.YARD && secondaryUnit == UnitType.YARD -> 1.0

            else -> 0.0
        }

        return primaryValue * coefficient
    }

    return 0.0
}