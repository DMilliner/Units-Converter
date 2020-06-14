package com.morenn.converter.utils

import com.morenn.converter.R

enum class UnitsType(val unitGroupNameId: Int, val unitImageId: Int = 0, val unitsList: List<UnitType> = listOf()) {
//    ACCELERATION(unitGroupNameId= R.string.acceleration, unitsList = accelerationsList),
    ANGLE(unitGroupNameId= R.string.angle, unitsList = anglesList),
    AREA(unitGroupNameId= R.string.area, unitsList= areasList),
    BYTES(unitGroupNameId= R.string.bytes, unitsList = bytesList),
    COOKING(unitGroupNameId= R.string.cooking, unitsList = cookingList),
    DISTANCE(unitGroupNameId= R.string.distance, unitsList = distancesList),
    FUEL_CONSUMPTION(unitGroupNameId= R.string.fuelConsumption, unitsList = fuelList),
    MASS(unitGroupNameId= R.string.mass, unitsList = massList),
    NUMERAL_SYSTEM(unitGroupNameId= R.string.numeralSystem, unitsList = numbersList),
//    PERCENTAGE(unitGroupNameId= R.string.percentage, unitsList = percentagesList),
    SI_PREFIXES(unitGroupNameId= R.string.siPrefixes, unitsList = prefixesList),
//    SPEED(unitGroupNameId= R.string.speed, unitsList = speedsList),
    TEMPERATURE(unitGroupNameId= R.string.temperature, unitsList = temperaturesList),
    TIME(unitGroupNameId= R.string.time, unitsList = timesList)
//    VOLUME(unitGroupNameId= R.string.volume, unitsList = volumesList)
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
    BIT(
        unitSymbolId= "Bit",
        unitNameId= R.string.bit),
    BYTE(
        unitSymbolId= "Byte",
        unitNameId= R.string._byte),

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
    YARD(
        unitSymbolId= "yard",
        unitNameId= R.string.yard),

//    Fuel Consumption
    MILES_PER_GALLON_UK(
        unitSymbolId= "mpg \uD83C\uDDEC\uD83C\uDDE7",
        unitNameId= R.string.gallons_per_mile),
    MILES_PER_GALLON_US(
        unitSymbolId= "mpg \uD83C\uDDFA\uD83C\uDDF8",
        unitNameId= R.string.miles_per_gallon),
    KILOMETERS_PER_LITER(
        unitSymbolId= "km/L",
        unitNameId= R.string.kilometers_per_liter),
    LITERS_PER_100_KILOMETERS(
        unitSymbolId= "L/100km",
        unitNameId= R.string.liters_per_kilometer),

//    Mass
    GRAM(
        unitSymbolId= "g",
        unitNameId= R.string.gram),
    KILOGRAM(
        unitSymbolId= "kg",
        unitNameId= R.string.kilogram),
    MEGATON(
        unitSymbolId= "Mt",
        unitNameId= R.string.megaton),
    OUNCE(
        unitSymbolId= "oz",
        unitNameId= R.string.ounce),
    POUND(
        unitSymbolId= "lb",
        unitNameId= R.string.pound),
    QUINTAL(
        unitSymbolId= "Qt",
        unitNameId= R.string.quintal),
    STONE(
        unitSymbolId= "st",
        unitNameId= R.string.stone),
    TON(
        unitSymbolId= "t",
        unitNameId= R.string.ton),

//    Numeral System
//    BASE_2(
//        unitSymbolId= "Base\u2082",
//        unitNameId= R.string.binary),
//    BASE_8(
//        unitSymbolId= "Base\u2088",
//        unitNameId= R.string.octal),
    BASE_10(
        unitSymbolId= "Base\u2081\u2080",
        unitNameId= R.string.decimal),
//    BASE_16(
//        unitSymbolId= "Base\u2081\u2086",
//        unitNameId= R.string.hexadecimal),
    ROMAN(
        unitSymbolId= "Roman",
        unitNameId= R.string.roman),

//    Percentages

//    SI Prefixes
    ATTO(
        unitSymbolId= "Atto",
        unitNameId= R.string.atto),
    CENTI(
        unitSymbolId= "Centi",
        unitNameId= R.string.centi),
    DECA(
        unitSymbolId= "Deca",
        unitNameId= R.string.deca),
    DECI(
        unitSymbolId= "Deci",
        unitNameId= R.string.deci),
    EXA(
        unitSymbolId= "Exa",
        unitNameId= R.string.exa),
    FEMTO(
        unitSymbolId= "Femto",
        unitNameId= R.string.femto),
    GIGA(
        unitSymbolId= "Giga",
        unitNameId= R.string.giga),
    HECTO(
        unitSymbolId= "Hecto",
        unitNameId= R.string.hecto),
    KILO(
        unitSymbolId= "Kilo",
        unitNameId= R.string.kilo),
    MEGA(
        unitSymbolId= "Mega",
        unitNameId= R.string.mega),
    MILLI(
        unitSymbolId= "Milli",
        unitNameId= R.string.milli),
    MICRO(
        unitSymbolId= "Micro",
        unitNameId= R.string.milli),
    NANO(
        unitSymbolId= "Nano",
        unitNameId= R.string.nano),
    PETA(
        unitSymbolId= "Peta",
        unitNameId= R.string.peta),
    PICO(
        unitSymbolId= "Pico",
        unitNameId= R.string.pico),
    TERA(
        unitSymbolId= "Tera",
        unitNameId= R.string.tera),
    YOCTO(
        unitSymbolId= "Yocto",
        unitNameId= R.string.yocto),
    YOTTA(
        unitSymbolId= "Yotta",
        unitNameId= R.string.yotta),
    ZEPTO(
        unitSymbolId= "Zepto",
        unitNameId= R.string.zepto),
    ZETTA(
        unitSymbolId= "Zetta",
        unitNameId= R.string.zetta),

//    Speed

//    Temperature
    CELSIUS(
        unitSymbolId= "˚C",
        unitNameId= R.string.celsius),
    FAHRENHEIT(
        unitSymbolId= "˚F",
        unitNameId= R.string.fahrenheit),
    KELVIN(
        unitSymbolId= "K",
        unitNameId= R.string.kelvin),

//    Time
    SECOND(
        unitSymbolId= "s",
        unitNameId= R.string.seconds),
    MINUTE(
        unitSymbolId= "m",
        unitNameId= R.string.minute),
    HOUR(
        unitSymbolId= "h",
        unitNameId= R.string.hour),
    DAY(
        unitSymbolId= "day",
        unitNameId= R.string.day),
    WEEK(
        unitSymbolId= "week",
        unitNameId= R.string.week),
    MONTH(
        unitSymbolId= "month",
        unitNameId= R.string.month),
    YEAR(
        unitSymbolId= "month",
        unitNameId= R.string.year),

//    Volume

}