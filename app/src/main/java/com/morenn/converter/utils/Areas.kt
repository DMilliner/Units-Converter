package com.morenn.converter.utils

import kotlin.math.pow

val areasList = listOf(
    UnitType.ACRE,
    UnitType.HECTARE,
    UnitType.SQUARE_CENTIMETER,
    UnitType.SQUARE_FOOT,
    UnitType.SQUARE_INCH,
    UnitType.SQUARE_KILOMETER,
    UnitType.SQUARE_METER,
    UnitType.SQUARE_MILE,
    UnitType.SQUARE_YARD
)

fun convertAreas(primaryValue: Double, primaryUnit: UnitType?, secondaryUnit: UnitType?): Double {
    if (primaryUnit != null && secondaryUnit != null) {
         val coefficient: Double = when {
             primaryUnit == UnitType.ACRE && secondaryUnit == UnitType.ACRE -> 1.0
             primaryUnit == UnitType.ACRE && secondaryUnit == UnitType.HECTARE -> 0.4046856422
             primaryUnit == UnitType.ACRE && secondaryUnit == UnitType.SQUARE_CENTIMETER -> 40468564.224
             primaryUnit == UnitType.ACRE && secondaryUnit == UnitType.SQUARE_FOOT -> 43560.0
             primaryUnit == UnitType.ACRE && secondaryUnit == UnitType.SQUARE_INCH -> 6272640.0
             primaryUnit == UnitType.ACRE && secondaryUnit == UnitType.SQUARE_KILOMETER -> 0.0040468564
             primaryUnit == UnitType.ACRE && secondaryUnit == UnitType.SQUARE_METER -> 4046.8564224
             primaryUnit == UnitType.ACRE && secondaryUnit == UnitType.SQUARE_MILE -> 0.0015625
             primaryUnit == UnitType.ACRE && secondaryUnit == UnitType.SQUARE_YARD -> 4840.0

             primaryUnit == UnitType.HECTARE && secondaryUnit == UnitType.ACRE -> 2.4710538147
             primaryUnit == UnitType.HECTARE && secondaryUnit == UnitType.HECTARE -> 1.0
             primaryUnit == UnitType.HECTARE && secondaryUnit == UnitType.SQUARE_CENTIMETER -> 100000000.0
             primaryUnit == UnitType.HECTARE && secondaryUnit == UnitType.SQUARE_FOOT -> 107639.1041671
             primaryUnit == UnitType.HECTARE && secondaryUnit == UnitType.SQUARE_INCH -> 15500031.000062
             primaryUnit == UnitType.HECTARE && secondaryUnit == UnitType.SQUARE_KILOMETER -> 0.01
             primaryUnit == UnitType.HECTARE && secondaryUnit == UnitType.SQUARE_METER -> 10000.0
             primaryUnit == UnitType.HECTARE && secondaryUnit == UnitType.SQUARE_MILE -> 0.0038610216
             primaryUnit == UnitType.HECTARE && secondaryUnit == UnitType.SQUARE_YARD -> 11959.900463011

             primaryUnit == UnitType.SQUARE_CENTIMETER && secondaryUnit == UnitType.ACRE -> 2.4710538146716 * 10.0.pow(-8)
             primaryUnit == UnitType.SQUARE_CENTIMETER && secondaryUnit == UnitType.HECTARE -> 1 * 10.0.pow(-8)
             primaryUnit == UnitType.SQUARE_CENTIMETER && secondaryUnit == UnitType.SQUARE_CENTIMETER -> 1.0
             primaryUnit == UnitType.SQUARE_CENTIMETER && secondaryUnit == UnitType.SQUARE_FOOT -> 0.001076391
             primaryUnit == UnitType.SQUARE_CENTIMETER && secondaryUnit == UnitType.SQUARE_INCH -> 0.15500031
             primaryUnit == UnitType.SQUARE_CENTIMETER && secondaryUnit == UnitType.SQUARE_KILOMETER -> 1 * 10.0.pow(-10)
             primaryUnit == UnitType.SQUARE_CENTIMETER && secondaryUnit == UnitType.SQUARE_METER -> 0.0001
             primaryUnit == UnitType.SQUARE_CENTIMETER && secondaryUnit == UnitType.SQUARE_MILE -> 3.8610215854245 * 10.0.pow(-11)
             primaryUnit == UnitType.SQUARE_CENTIMETER && secondaryUnit == UnitType.SQUARE_YARD -> 0.000119599

             primaryUnit == UnitType.SQUARE_FOOT && secondaryUnit == UnitType.ACRE -> 2.29568 * 10.0.pow(-5)
             primaryUnit == UnitType.SQUARE_FOOT && secondaryUnit == UnitType.HECTARE -> 9.290304 * 10.0.pow(-6)
             primaryUnit == UnitType.SQUARE_FOOT && secondaryUnit == UnitType.SQUARE_CENTIMETER -> 929.0304
             primaryUnit == UnitType.SQUARE_FOOT && secondaryUnit == UnitType.SQUARE_FOOT -> 1.0
             primaryUnit == UnitType.SQUARE_FOOT && secondaryUnit == UnitType.SQUARE_INCH -> 144.0
             primaryUnit == UnitType.SQUARE_FOOT && secondaryUnit == UnitType.SQUARE_KILOMETER -> 9.290304 * 10.0.pow(-8)
             primaryUnit == UnitType.SQUARE_FOOT && secondaryUnit == UnitType.SQUARE_METER -> 0.09290304
             primaryUnit == UnitType.SQUARE_FOOT && secondaryUnit == UnitType.SQUARE_MILE -> 3.5870064279155 * 10.0.pow(-8)
             primaryUnit == UnitType.SQUARE_FOOT && secondaryUnit == UnitType.SQUARE_YARD -> 0.1111111111

             primaryUnit == UnitType.SQUARE_INCH && secondaryUnit == UnitType.ACRE -> 1.5942250790736* 10.0.pow(-7)
             primaryUnit == UnitType.SQUARE_INCH && secondaryUnit == UnitType.HECTARE -> 6.4516 * 10.0.pow(-8)
             primaryUnit == UnitType.SQUARE_INCH && secondaryUnit == UnitType.SQUARE_CENTIMETER -> 6.4516
             primaryUnit == UnitType.SQUARE_INCH && secondaryUnit == UnitType.SQUARE_FOOT -> 0.0069444444
             primaryUnit == UnitType.SQUARE_INCH && secondaryUnit == UnitType.SQUARE_INCH -> 1.0
             primaryUnit == UnitType.SQUARE_INCH && secondaryUnit == UnitType.SQUARE_KILOMETER -> 6.4516 * 10.0.pow(-10)
             primaryUnit == UnitType.SQUARE_INCH && secondaryUnit == UnitType.SQUARE_METER -> 0.00064516
             primaryUnit == UnitType.SQUARE_INCH && secondaryUnit == UnitType.SQUARE_MILE -> 2.4909766860524 * 10.0.pow(-10)
             primaryUnit == UnitType.SQUARE_INCH && secondaryUnit == UnitType.SQUARE_YARD -> 0.0007716049

             primaryUnit == UnitType.SQUARE_KILOMETER && secondaryUnit == UnitType.ACRE -> 247.1053814672
             primaryUnit == UnitType.SQUARE_KILOMETER && secondaryUnit == UnitType.HECTARE -> 100.0
             primaryUnit == UnitType.SQUARE_KILOMETER && secondaryUnit == UnitType.SQUARE_CENTIMETER -> 10000000000.0
             primaryUnit == UnitType.SQUARE_KILOMETER && secondaryUnit == UnitType.SQUARE_FOOT -> 10763910.41671
             primaryUnit == UnitType.SQUARE_KILOMETER && secondaryUnit == UnitType.SQUARE_INCH -> 1550003100.0062
             primaryUnit == UnitType.SQUARE_KILOMETER && secondaryUnit == UnitType.SQUARE_KILOMETER -> 1.0
             primaryUnit == UnitType.SQUARE_KILOMETER && secondaryUnit == UnitType.SQUARE_METER -> 1000000.0
             primaryUnit == UnitType.SQUARE_KILOMETER && secondaryUnit == UnitType.SQUARE_MILE -> 0.3861021585
             primaryUnit == UnitType.SQUARE_KILOMETER && secondaryUnit == UnitType.SQUARE_YARD -> 1195990.0463011

             primaryUnit == UnitType.SQUARE_METER && secondaryUnit == UnitType.ACRE -> 0.0002471054
             primaryUnit == UnitType.SQUARE_METER && secondaryUnit == UnitType.HECTARE -> 0.0001
             primaryUnit == UnitType.SQUARE_METER && secondaryUnit == UnitType.SQUARE_CENTIMETER -> 10000.0
             primaryUnit == UnitType.SQUARE_METER && secondaryUnit == UnitType.SQUARE_FOOT -> 10.7639104167
             primaryUnit == UnitType.SQUARE_METER && secondaryUnit == UnitType.SQUARE_INCH -> 1550.0031000062
             primaryUnit == UnitType.SQUARE_METER && secondaryUnit == UnitType.SQUARE_KILOMETER -> 1.0 * 10.0.pow(-6)
             primaryUnit == UnitType.SQUARE_METER && secondaryUnit == UnitType.SQUARE_METER -> 1.0
             primaryUnit == UnitType.SQUARE_METER && secondaryUnit == UnitType.SQUARE_MILE -> 3.8610215854245 * 10.0.pow(-7)
             primaryUnit == UnitType.SQUARE_METER && secondaryUnit == UnitType.SQUARE_YARD -> 1.1959900463

             primaryUnit == UnitType.SQUARE_MILE && secondaryUnit == UnitType.ACRE -> 640.0
             primaryUnit == UnitType.SQUARE_MILE && secondaryUnit == UnitType.HECTARE -> 258.9988110336
             primaryUnit == UnitType.SQUARE_MILE && secondaryUnit == UnitType.SQUARE_CENTIMETER -> 25899881103.36
             primaryUnit == UnitType.SQUARE_MILE && secondaryUnit == UnitType.SQUARE_FOOT -> 27878400.0
             primaryUnit == UnitType.SQUARE_MILE && secondaryUnit == UnitType.SQUARE_INCH -> 4014489600.0
             primaryUnit == UnitType.SQUARE_MILE && secondaryUnit == UnitType.SQUARE_KILOMETER -> 2.5899881103
             primaryUnit == UnitType.SQUARE_MILE && secondaryUnit == UnitType.SQUARE_METER -> 2589988.110336
             primaryUnit == UnitType.SQUARE_MILE && secondaryUnit == UnitType.SQUARE_MILE -> 1.0
             primaryUnit == UnitType.SQUARE_MILE && secondaryUnit == UnitType.SQUARE_YARD -> 0.4046856422

             primaryUnit == UnitType.SQUARE_YARD && secondaryUnit == UnitType.ACRE -> 0.0002066116
             primaryUnit == UnitType.SQUARE_YARD && secondaryUnit == UnitType.HECTARE -> 8.36127 * 10.0.pow(-5)
             primaryUnit == UnitType.SQUARE_YARD && secondaryUnit == UnitType.SQUARE_CENTIMETER -> 8361.2736
             primaryUnit == UnitType.SQUARE_YARD && secondaryUnit == UnitType.SQUARE_FOOT -> 9.0
             primaryUnit == UnitType.SQUARE_YARD && secondaryUnit == UnitType.SQUARE_INCH -> 1296.0
             primaryUnit == UnitType.SQUARE_YARD && secondaryUnit == UnitType.SQUARE_KILOMETER -> 8.3612736 * 10.0.pow(-7)
             primaryUnit == UnitType.SQUARE_YARD && secondaryUnit == UnitType.SQUARE_METER -> 0.83612736
             primaryUnit == UnitType.SQUARE_YARD && secondaryUnit == UnitType.SQUARE_MILE -> 3.228305785124 * 10.0.pow(-7)
             primaryUnit == UnitType.SQUARE_YARD && secondaryUnit == UnitType.SQUARE_YARD -> 1.0

             else -> 0.0
         }

        return primaryValue * coefficient
    }

    return 0.0
}