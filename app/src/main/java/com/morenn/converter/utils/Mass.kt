package com.morenn.converter.utils

val massList = listOf<UnitType>(
    UnitType.CENTIGRAM,
    UnitType.GRAM,
    UnitType.KILOGRAM,
    UnitType.MEGATON,
    UnitType.MILLIGRAM,
    UnitType.NANOGRAM,
    UnitType.OUNCE,
    UnitType.PICOGRAM,
    UnitType.POUND,
    UnitType.QUINTAL,
    UnitType.STONE,
    UnitType.TON
)

fun convertMass(primaryValue: Double, primaryUnit: UnitType?, secondaryUnit: UnitType?): Double {
    return 0.0
}