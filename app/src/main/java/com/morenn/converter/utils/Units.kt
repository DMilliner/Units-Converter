package com.morenn.converter.utils

import com.morenn.converter.R
import kotlin.text.Typography.degree


enum class UnitsType(val unitGroupNameId: Int, val unitImageId: Int = 0, val unitsList: List<UnitType> = listOf()) {
    ACCELERATION(unitGroupNameId= R.string.acceleration),
    ANGLE(unitGroupNameId= R.string.angle, unitsList = anglesList),
    AREA(unitGroupNameId= R.string.area, unitsList= areasList),
    BYTES(unitGroupNameId= R.string.bytes, unitsList = bytesList),
    COOKING(unitGroupNameId= R.string.cooking, unitsList = cookingList),
    DISTANCE(unitGroupNameId= R.string.distance, unitsList = distancesList),
    FUEL_CONSUMPTION(unitGroupNameId= R.string.fuelConsumption),
    MASS(unitGroupNameId= R.string.mass),
    NUMERAL_SYSTEM(unitGroupNameId= R.string.numeralSystem),
    PERCENTAGE(unitGroupNameId= R.string.percentage),
    SI_PREFIXES(unitGroupNameId= R.string.siPrefixes),
    SPEED(unitGroupNameId= R.string.speed),
    TEMPERATURE(unitGroupNameId= R.string.temperature),
    TIME(unitGroupNameId= R.string.time),
    VOLUME(unitGroupNameId= R.string.volume)
}

enum class UnitType(val unitSymbolId: String, val unitNameId: Int) {

//    Acceleration

//    Angle
    DEGREE(
        unitSymbolId= "˚",
        unitNameId= R.string.degree),
    RADIAN(
        unitSymbolId= "rad",
        unitNameId= R.string.radian),

//    Areas
    ACRE(
        unitSymbolId= "ac",
        unitNameId= R.string.acre),
    HECTARE(
        unitSymbolId= "ha",
        unitNameId= R.string.hectare),
    SQUARE_CENTIMETER(
        unitSymbolId= "cm\u2072",
        unitNameId= R.string.square_centimeter),
    SQUARE_FOOT(
        unitSymbolId= "ft\u2072",
        unitNameId= R.string.square_foot),
    SQUARE_INCH(
        unitSymbolId= "in\u2072",
        unitNameId= R.string.square_inch),
    SQUARE_KILOMETER(
        unitSymbolId= "km\u2072",
        unitNameId= R.string.square_kilometer),
    SQUARE_METER(
        unitSymbolId= "m\u2072",
        unitNameId= R.string.square_meter),
    SQUARE_MILE(
        unitSymbolId= "mi\u2072",
        unitNameId= R.string.square_mile),
    SQUARE_YARD(
        unitSymbolId= "yd\u2072",
        unitNameId= R.string.square_yard),

//    Bytes
    BASE_2(
        unitSymbolId= "Base\u2082",
        unitNameId= R.string.binary),
    BASE_8(
        unitSymbolId= "Base\u2088",
        unitNameId= R.string.octal),
    BASE_10(
        unitSymbolId= "Base\u2081\u2080",
        unitNameId= R.string.decimal),
    BASE_16(
        unitSymbolId= "Base\u2081\u2086",
        unitNameId= R.string.hexadecimal),

//    Cooking
    CENTILITER(
        unitSymbolId= "cl",
        unitNameId= R.string.centiliter),
    CUP(
        unitSymbolId= "cup",
        unitNameId= R.string.cup),
    DECILITER(
        unitSymbolId= "dl",
        unitNameId= R.string.deciliter),
    LITER(
        unitSymbolId= "l",
        unitNameId= R.string.liter),
    MILLILITER(
        unitSymbolId= "ml",
        unitNameId= R.string.milliliter),
    PINCH(
        unitSymbolId= "pinch",
        unitNameId= R.string.pinch),
    QUART(
        unitSymbolId= "quart",
        unitNameId= R.string.quart),
    TABLESPOON(
        unitSymbolId= "tblsp",
        unitNameId= R.string.tablespoon),
    TEASPOON(
        unitSymbolId= "tsp",
        unitNameId= R.string.teaspoon),

//    Distance
    CENTIMETER(
        unitSymbolId= "cm",
        unitNameId= R.string.centimeter),
    FOOT(
        unitSymbolId= "ft",
        unitNameId= R.string.foot),
    INCH(
        unitSymbolId= "in",
        unitNameId= R.string.inch),
    KILOMETER(
        unitSymbolId= "km",
        unitNameId= R.string.kilometer),
    LIGHT_YEARS(
        unitSymbolId= "light years",
        unitNameId= R.string.light_years),
    METER(
        unitSymbolId= "m",
        unitNameId= R.string.meter),
    MILLIMETER(
        unitSymbolId= "mm",
        unitNameId= R.string.millimeter),
    NANOMETER(
        unitSymbolId= "nm",
        unitNameId= R.string.nanometer),
    PICOMETER(
        unitSymbolId= "pm",
        unitNameId= R.string.picometer),
    YARD(
        unitSymbolId= "yard",
        unitNameId= R.string.yard),

//    Fuel Consumption
//    Mass
//    Numeral System
//    Percentages
//    SI Prefixes
//    Speed
//    Temperature
//    Time
//    Volume
}