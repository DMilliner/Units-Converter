package com.morenn.converter.utils

import com.morenn.converter.R

val prefixesList = listOf(
    UnitType.ATTO,
    UnitType.CENTI,
    UnitType.DECA,
    UnitType.DECI,
    UnitType.EXA,
    UnitType.FEMTO,
    UnitType.GIGA,
    UnitType.HECTO,
    UnitType.KILO,
    UnitType.MEGA,
    UnitType.MILLI,
    UnitType.NANO,
    UnitType.PETA,
    UnitType.PICO,
    UnitType.TERA,
    UnitType.YOCTO,
    UnitType.YOTTA,
    UnitType.ZEPTO,
    UnitType.ZETTA
)

fun convertPrefixes(primaryValue: Double, primaryUnit: UnitType?, secondaryUnit: UnitType?): Double {
    return 0.0
}