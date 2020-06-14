package com.morenn.converter.utils

import kotlin.math.pow

val prefixesList = listOf(
    UnitType.YOTTA,
    UnitType.ZETTA,
    UnitType.EXA,
    UnitType.PETA,
    UnitType.TERA,
    UnitType.GIGA,
    UnitType.MEGA,
    UnitType.KILO,
    UnitType.HECTO,
    UnitType.DECA,
    UnitType.DECI,
    UnitType.CENTI,
    UnitType.MILLI,
    UnitType.MICRO,
    UnitType.NANO,
    UnitType.PICO,
    UnitType.FEMTO,
    UnitType.ATTO,
    UnitType.ZEPTO,
    UnitType.YOCTO
)

fun convertPrefixes(
    primaryValue: Double,
    primaryUnit: UnitType?,
    secondaryUnit: UnitType?
): Double {
    if (primaryUnit != null && secondaryUnit != null) {
        val coefficient: Double = when {

            primaryUnit == UnitType.YOTTA && secondaryUnit == UnitType.YOTTA -> 1.0
            primaryUnit == UnitType.YOTTA && secondaryUnit == UnitType.ZETTA -> 1000.0
            primaryUnit == UnitType.YOTTA && secondaryUnit == UnitType.EXA -> 1.0 * 10.0.pow(6)
            primaryUnit == UnitType.YOTTA && secondaryUnit == UnitType.PETA -> 1.0 * 10.0.pow(9)
            primaryUnit == UnitType.YOTTA && secondaryUnit == UnitType.TERA -> 1.0 * 10.0.pow(12)
            primaryUnit == UnitType.YOTTA && secondaryUnit == UnitType.GIGA -> 1.0 * 10.0.pow(15)
            primaryUnit == UnitType.YOTTA && secondaryUnit == UnitType.MEGA -> 1.0 * 10.0.pow(18)
            primaryUnit == UnitType.YOTTA && secondaryUnit == UnitType.KILO -> 1.0 * 10.0.pow(21)
            primaryUnit == UnitType.YOTTA && secondaryUnit == UnitType.HECTO -> 1.0 * 10.0.pow(22)
            primaryUnit == UnitType.YOTTA && secondaryUnit == UnitType.DECA -> 1.0 * 10.0.pow(23)
            primaryUnit == UnitType.YOTTA && secondaryUnit == UnitType.DECI -> 1.0 * 10.0.pow(25)
            primaryUnit == UnitType.YOTTA && secondaryUnit == UnitType.CENTI -> 1.0 * 10.0.pow(26)
            primaryUnit == UnitType.YOTTA && secondaryUnit == UnitType.MILLI -> 1.0 * 10.0.pow(27)
            primaryUnit == UnitType.YOTTA && secondaryUnit == UnitType.MICRO -> 1.0 * 10.0.pow(30)
            primaryUnit == UnitType.YOTTA && secondaryUnit == UnitType.NANO -> 1.0 * 10.0.pow(33)
            primaryUnit == UnitType.YOTTA && secondaryUnit == UnitType.PICO -> 1.0 * 10.0.pow(36)
            primaryUnit == UnitType.YOTTA && secondaryUnit == UnitType.FEMTO -> 1.0 * 10.0.pow(39)
            primaryUnit == UnitType.YOTTA && secondaryUnit == UnitType.ATTO -> 1.0 * 10.0.pow(42)
            primaryUnit == UnitType.YOTTA && secondaryUnit == UnitType.ZEPTO -> 1.0 * 10.0.pow(45)
            primaryUnit == UnitType.YOTTA && secondaryUnit == UnitType.YOCTO -> 1.0 * 10.0.pow(48)

            primaryUnit == UnitType.ZETTA && secondaryUnit == UnitType.YOTTA -> 0.001
            primaryUnit == UnitType.ZETTA && secondaryUnit == UnitType.ZETTA -> 1.0
            primaryUnit == UnitType.ZETTA && secondaryUnit == UnitType.EXA -> 1000.0
            primaryUnit == UnitType.ZETTA && secondaryUnit == UnitType.PETA -> 1.0 * 10.0.pow(6)
            primaryUnit == UnitType.ZETTA && secondaryUnit == UnitType.TERA -> 1.0 * 10.0.pow(9)
            primaryUnit == UnitType.ZETTA && secondaryUnit == UnitType.GIGA -> 1.0 * 10.0.pow(12)
            primaryUnit == UnitType.ZETTA && secondaryUnit == UnitType.MEGA -> 1.0 * 10.0.pow(15)
            primaryUnit == UnitType.ZETTA && secondaryUnit == UnitType.KILO -> 1.0 * 10.0.pow(18)
            primaryUnit == UnitType.ZETTA && secondaryUnit == UnitType.HECTO -> 1.0 * 10.0.pow(19)
            primaryUnit == UnitType.ZETTA && secondaryUnit == UnitType.DECA -> 1.0 * 10.0.pow(20)
            primaryUnit == UnitType.ZETTA && secondaryUnit == UnitType.DECI -> 1.0 * 10.0.pow(22)
            primaryUnit == UnitType.ZETTA && secondaryUnit == UnitType.CENTI -> 1.0 * 10.0.pow(23)
            primaryUnit == UnitType.ZETTA && secondaryUnit == UnitType.MILLI -> 1.0 * 10.0.pow(24)
            primaryUnit == UnitType.ZETTA && secondaryUnit == UnitType.MICRO -> 1.0 * 10.0.pow(27)
            primaryUnit == UnitType.ZETTA && secondaryUnit == UnitType.NANO -> 1.0 * 10.0.pow(30)
            primaryUnit == UnitType.ZETTA && secondaryUnit == UnitType.PICO -> 1.0 * 10.0.pow(33)
            primaryUnit == UnitType.ZETTA && secondaryUnit == UnitType.FEMTO -> 1.0 * 10.0.pow(36)
            primaryUnit == UnitType.ZETTA && secondaryUnit == UnitType.ATTO -> 1.0 * 10.0.pow(39)
            primaryUnit == UnitType.ZETTA && secondaryUnit == UnitType.ZEPTO -> 1.0 * 10.0.pow(42)
            primaryUnit == UnitType.ZETTA && secondaryUnit == UnitType.YOCTO -> 1.0 * 10.0.pow(45)

            primaryUnit == UnitType.EXA && secondaryUnit == UnitType.YOTTA -> 1.0 * 10.0.pow(-6)
            primaryUnit == UnitType.EXA && secondaryUnit == UnitType.ZETTA -> 0.001
            primaryUnit == UnitType.EXA && secondaryUnit == UnitType.EXA -> 1.0
            primaryUnit == UnitType.EXA && secondaryUnit == UnitType.PETA -> 1000.0
            primaryUnit == UnitType.EXA && secondaryUnit == UnitType.TERA -> 1.0 * 10.0.pow(6)
            primaryUnit == UnitType.EXA && secondaryUnit == UnitType.GIGA -> 1.0 * 10.0.pow(9)
            primaryUnit == UnitType.EXA && secondaryUnit == UnitType.MEGA -> 1.0 * 10.0.pow(12)
            primaryUnit == UnitType.EXA && secondaryUnit == UnitType.KILO -> 1.0 * 10.0.pow(15)
            primaryUnit == UnitType.EXA && secondaryUnit == UnitType.HECTO -> 1.0 * 10.0.pow(16)
            primaryUnit == UnitType.EXA && secondaryUnit == UnitType.DECA -> 1.0 * 10.0.pow(17)
            primaryUnit == UnitType.EXA && secondaryUnit == UnitType.DECI -> 1.0 * 10.0.pow(19)
            primaryUnit == UnitType.EXA && secondaryUnit == UnitType.CENTI -> 1.0 * 10.0.pow(20)
            primaryUnit == UnitType.EXA && secondaryUnit == UnitType.MILLI -> 1.0 * 10.0.pow(21)
            primaryUnit == UnitType.EXA && secondaryUnit == UnitType.MICRO -> 1.0 * 10.0.pow(24)
            primaryUnit == UnitType.EXA && secondaryUnit == UnitType.NANO -> 1.0 * 10.0.pow(27)
            primaryUnit == UnitType.EXA && secondaryUnit == UnitType.PICO -> 1.0 * 10.0.pow(30)
            primaryUnit == UnitType.EXA && secondaryUnit == UnitType.FEMTO -> 1.0 * 10.0.pow(33)
            primaryUnit == UnitType.EXA && secondaryUnit == UnitType.ATTO -> 1.0 * 10.0.pow(36)
            primaryUnit == UnitType.EXA && secondaryUnit == UnitType.ZEPTO -> 1.0 * 10.0.pow(39)
            primaryUnit == UnitType.EXA && secondaryUnit == UnitType.YOCTO -> 1.0 * 10.0.pow(42)

            primaryUnit == UnitType.PETA && secondaryUnit == UnitType.YOTTA -> 1.0 * 10.0.pow(-9)
            primaryUnit == UnitType.PETA && secondaryUnit == UnitType.ZETTA -> 1.0 * 10.0.pow(-6)
            primaryUnit == UnitType.PETA && secondaryUnit == UnitType.EXA -> 0.001
            primaryUnit == UnitType.PETA && secondaryUnit == UnitType.PETA -> 1.0
            primaryUnit == UnitType.PETA && secondaryUnit == UnitType.TERA -> 1000.0
            primaryUnit == UnitType.PETA && secondaryUnit == UnitType.GIGA -> 1.0 * 10.0.pow(6)
            primaryUnit == UnitType.PETA && secondaryUnit == UnitType.MEGA -> 1.0 * 10.0.pow(9)
            primaryUnit == UnitType.PETA && secondaryUnit == UnitType.KILO -> 1.0 * 10.0.pow(12)
            primaryUnit == UnitType.PETA && secondaryUnit == UnitType.HECTO -> 1.0 * 10.0.pow(13)
            primaryUnit == UnitType.PETA && secondaryUnit == UnitType.DECA -> 1.0 * 10.0.pow(14)
            primaryUnit == UnitType.PETA && secondaryUnit == UnitType.DECI -> 1.0 * 10.0.pow(16)
            primaryUnit == UnitType.PETA && secondaryUnit == UnitType.CENTI -> 1.0 * 10.0.pow( 17)
            primaryUnit == UnitType.PETA && secondaryUnit == UnitType.MILLI -> 1.0 * 10.0.pow(18)
            primaryUnit == UnitType.PETA && secondaryUnit == UnitType.MICRO -> 1.0 * 10.0.pow(21)
            primaryUnit == UnitType.PETA && secondaryUnit == UnitType.NANO -> 1.0 * 10.0.pow(24)
            primaryUnit == UnitType.PETA && secondaryUnit == UnitType.PICO -> 1.0 * 10.0.pow(27)
            primaryUnit == UnitType.PETA && secondaryUnit == UnitType.FEMTO -> 1.0 * 10.0.pow(30)
            primaryUnit == UnitType.PETA && secondaryUnit == UnitType.ATTO -> 1.0 * 10.0.pow(33)
            primaryUnit == UnitType.PETA && secondaryUnit == UnitType.ZEPTO -> 1.0 * 10.0.pow(36)
            primaryUnit == UnitType.PETA && secondaryUnit == UnitType.YOCTO -> 1.0 * 10.0.pow(39)

            primaryUnit == UnitType.TERA && secondaryUnit == UnitType.YOTTA -> 1.0 * 10.0.pow(-12)
            primaryUnit == UnitType.TERA && secondaryUnit == UnitType.ZETTA -> 1.0 * 10.0.pow(-9)
            primaryUnit == UnitType.TERA && secondaryUnit == UnitType.EXA -> 1.0 * 10.0.pow(-6)
            primaryUnit == UnitType.TERA && secondaryUnit == UnitType.PETA -> 0.001
            primaryUnit == UnitType.TERA && secondaryUnit == UnitType.TERA -> 1.0
            primaryUnit == UnitType.TERA && secondaryUnit == UnitType.GIGA -> 1000.0
            primaryUnit == UnitType.TERA && secondaryUnit == UnitType.MEGA -> 1.0 * 10.0.pow(6)
            primaryUnit == UnitType.TERA && secondaryUnit == UnitType.KILO -> 1.0 * 10.0.pow(9)
            primaryUnit == UnitType.TERA && secondaryUnit == UnitType.HECTO -> 1.0 * 10.0.pow(10)
            primaryUnit == UnitType.TERA && secondaryUnit == UnitType.DECA -> 1.0 * 10.0.pow(11)
            primaryUnit == UnitType.TERA && secondaryUnit == UnitType.DECI -> 1.0 * 10.0.pow(13)
            primaryUnit == UnitType.TERA && secondaryUnit == UnitType.CENTI -> 1.0 * 10.0.pow(14)
            primaryUnit == UnitType.TERA && secondaryUnit == UnitType.MILLI -> 1.0 * 10.0.pow(15)
            primaryUnit == UnitType.TERA && secondaryUnit == UnitType.MICRO -> 1.0 * 10.0.pow(18)
            primaryUnit == UnitType.TERA && secondaryUnit == UnitType.NANO -> 1.0 * 10.0.pow(21)
            primaryUnit == UnitType.TERA && secondaryUnit == UnitType.PICO -> 1.0 * 10.0.pow(24)
            primaryUnit == UnitType.TERA && secondaryUnit == UnitType.FEMTO -> 1.0 * 10.0.pow(27)
            primaryUnit == UnitType.TERA && secondaryUnit == UnitType.ATTO -> 1.0 * 10.0.pow(30)
            primaryUnit == UnitType.TERA && secondaryUnit == UnitType.ZEPTO -> 1.0 * 10.0.pow(33)
            primaryUnit == UnitType.TERA && secondaryUnit == UnitType.YOCTO -> 1.0 * 10.0.pow(36)

            primaryUnit == UnitType.GIGA && secondaryUnit == UnitType.YOTTA -> 1.0 * 10.0.pow(-15)
            primaryUnit == UnitType.GIGA && secondaryUnit == UnitType.ZETTA -> 1.0 * 10.0.pow(-12)
            primaryUnit == UnitType.GIGA && secondaryUnit == UnitType.EXA -> 1.0 * 10.0.pow(-9)
            primaryUnit == UnitType.GIGA && secondaryUnit == UnitType.PETA -> 1.0 * 10.0.pow(-6)
            primaryUnit == UnitType.GIGA && secondaryUnit == UnitType.TERA -> 0.001
            primaryUnit == UnitType.GIGA && secondaryUnit == UnitType.GIGA -> 1.0
            primaryUnit == UnitType.GIGA && secondaryUnit == UnitType.MEGA -> 1000.0
            primaryUnit == UnitType.GIGA && secondaryUnit == UnitType.KILO -> 1.0 * 10.0.pow(6)
            primaryUnit == UnitType.GIGA && secondaryUnit == UnitType.HECTO -> 1.0 * 10.0.pow(7)
            primaryUnit == UnitType.GIGA && secondaryUnit == UnitType.DECA -> 1.0 * 10.0.pow(8)
            primaryUnit == UnitType.GIGA && secondaryUnit == UnitType.DECI -> 1.0 * 10.0.pow(10)
            primaryUnit == UnitType.GIGA && secondaryUnit == UnitType.CENTI -> 1.0 * 10.0.pow(11)
            primaryUnit == UnitType.GIGA && secondaryUnit == UnitType.MILLI -> 1.0 * 10.0.pow(12)
            primaryUnit == UnitType.GIGA && secondaryUnit == UnitType.MICRO -> 1.0 * 10.0.pow(15)
            primaryUnit == UnitType.GIGA && secondaryUnit == UnitType.NANO -> 1.0 * 10.0.pow(18)
            primaryUnit == UnitType.GIGA && secondaryUnit == UnitType.PICO -> 1.0 * 10.0.pow(21)
            primaryUnit == UnitType.GIGA && secondaryUnit == UnitType.FEMTO -> 1.0 * 10.0.pow(24)
            primaryUnit == UnitType.GIGA && secondaryUnit == UnitType.ATTO -> 1.0 * 10.0.pow(27)
            primaryUnit == UnitType.GIGA && secondaryUnit == UnitType.ZEPTO -> 1.0 * 10.0.pow(30)
            primaryUnit == UnitType.GIGA && secondaryUnit == UnitType.YOCTO -> 1.0 * 10.0.pow(33)

            primaryUnit == UnitType.MEGA && secondaryUnit == UnitType.YOTTA -> 1.0 * 10.0.pow(-18)
            primaryUnit == UnitType.MEGA && secondaryUnit == UnitType.ZETTA -> 1.0 * 10.0.pow(-15)
            primaryUnit == UnitType.MEGA && secondaryUnit == UnitType.EXA -> 1.0 * 10.0.pow(-12)
            primaryUnit == UnitType.MEGA && secondaryUnit == UnitType.PETA -> 1.0 * 10.0.pow(-9)
            primaryUnit == UnitType.MEGA && secondaryUnit == UnitType.TERA -> 1.0 * 10.0.pow(-6)
            primaryUnit == UnitType.MEGA && secondaryUnit == UnitType.GIGA -> 0.001
            primaryUnit == UnitType.MEGA && secondaryUnit == UnitType.MEGA -> 1.0
            primaryUnit == UnitType.MEGA && secondaryUnit == UnitType.KILO -> 1000.0
            primaryUnit == UnitType.MEGA && secondaryUnit == UnitType.HECTO -> 1.0 * 10.0.pow(4)
            primaryUnit == UnitType.MEGA && secondaryUnit == UnitType.DECA -> 1.0 * 10.0.pow(5)
            primaryUnit == UnitType.MEGA && secondaryUnit == UnitType.DECI -> 1.0 * 10.0.pow(7)
            primaryUnit == UnitType.MEGA && secondaryUnit == UnitType.CENTI -> 1.0 * 10.0.pow(8)
            primaryUnit == UnitType.MEGA && secondaryUnit == UnitType.MILLI -> 1.0 * 10.0.pow(9)
            primaryUnit == UnitType.MEGA && secondaryUnit == UnitType.MICRO -> 1.0 * 10.0.pow(12)
            primaryUnit == UnitType.MEGA && secondaryUnit == UnitType.NANO -> 1.0 * 10.0.pow(15)
            primaryUnit == UnitType.MEGA && secondaryUnit == UnitType.PICO -> 1.0 * 10.0.pow(18)
            primaryUnit == UnitType.MEGA && secondaryUnit == UnitType.FEMTO -> 1.0 * 10.0.pow(21)
            primaryUnit == UnitType.MEGA && secondaryUnit == UnitType.ATTO -> 1.0 * 10.0.pow(24)
            primaryUnit == UnitType.MEGA && secondaryUnit == UnitType.ZEPTO -> 1.0 * 10.0.pow(27)
            primaryUnit == UnitType.MEGA && secondaryUnit == UnitType.YOCTO -> 1.0 * 10.0.pow(30)

            primaryUnit == UnitType.KILO && secondaryUnit == UnitType.YOTTA -> 1.0 * 10.0.pow(-21)
            primaryUnit == UnitType.KILO && secondaryUnit == UnitType.ZETTA -> 1.0 * 10.0.pow(-18)
            primaryUnit == UnitType.KILO && secondaryUnit == UnitType.EXA -> 1.0 * 10.0.pow(-15)
            primaryUnit == UnitType.KILO && secondaryUnit == UnitType.PETA -> 1.0 * 10.0.pow(-12)
            primaryUnit == UnitType.KILO && secondaryUnit == UnitType.TERA -> 1.0 * 10.0.pow(-9)
            primaryUnit == UnitType.KILO && secondaryUnit == UnitType.GIGA -> 1.0 * 10.0.pow(-6)
            primaryUnit == UnitType.KILO && secondaryUnit == UnitType.MEGA -> 0.001
            primaryUnit == UnitType.KILO && secondaryUnit == UnitType.KILO -> 1.0
            primaryUnit == UnitType.KILO && secondaryUnit == UnitType.HECTO -> 10.0
            primaryUnit == UnitType.KILO && secondaryUnit == UnitType.DECA -> 100.0
            primaryUnit == UnitType.KILO && secondaryUnit == UnitType.DECI -> 1.0 * 10.0.pow(4)
            primaryUnit == UnitType.KILO && secondaryUnit == UnitType.CENTI -> 1.0 * 10.0.pow(5)
            primaryUnit == UnitType.KILO && secondaryUnit == UnitType.MILLI -> 1.0 * 10.0.pow(6)
            primaryUnit == UnitType.KILO && secondaryUnit == UnitType.MICRO -> 1.0 * 10.0.pow(9)
            primaryUnit == UnitType.KILO && secondaryUnit == UnitType.NANO -> 1.0 * 10.0.pow(12)
            primaryUnit == UnitType.KILO && secondaryUnit == UnitType.PICO -> 1.0 * 10.0.pow(15)
            primaryUnit == UnitType.KILO && secondaryUnit == UnitType.FEMTO -> 1.0 * 10.0.pow(18)
            primaryUnit == UnitType.KILO && secondaryUnit == UnitType.ATTO -> 1.0 * 10.0.pow(21)
            primaryUnit == UnitType.KILO && secondaryUnit == UnitType.ZEPTO -> 1.0 * 10.0.pow(24)
            primaryUnit == UnitType.KILO && secondaryUnit == UnitType.YOCTO -> 1.0 * 10.0.pow(27)

            primaryUnit == UnitType.HECTO && secondaryUnit == UnitType.YOTTA -> 1.0 * 10.0.pow(-22)
            primaryUnit == UnitType.HECTO && secondaryUnit == UnitType.ZETTA -> 1.0 * 10.0.pow(-19)
            primaryUnit == UnitType.HECTO && secondaryUnit == UnitType.EXA -> 1.0 * 10.0.pow(-16)
            primaryUnit == UnitType.HECTO && secondaryUnit == UnitType.PETA -> 1.0 * 10.0.pow(-13)
            primaryUnit == UnitType.HECTO && secondaryUnit == UnitType.TERA -> 1.0 * 10.0.pow(-10)
            primaryUnit == UnitType.HECTO && secondaryUnit == UnitType.GIGA -> 1.0 * 10.0.pow(-7)
            primaryUnit == UnitType.HECTO && secondaryUnit == UnitType.MEGA -> 0.0001
            primaryUnit == UnitType.HECTO && secondaryUnit == UnitType.KILO -> 0.001
            primaryUnit == UnitType.HECTO && secondaryUnit == UnitType.HECTO -> 1.0
            primaryUnit == UnitType.HECTO && secondaryUnit == UnitType.DECA -> 10.0
            primaryUnit == UnitType.HECTO && secondaryUnit == UnitType.DECI -> 1000.0
            primaryUnit == UnitType.HECTO && secondaryUnit == UnitType.CENTI -> 1.0 * 10.0.pow(4)
            primaryUnit == UnitType.HECTO && secondaryUnit == UnitType.MILLI -> 1.0 * 10.0.pow(5)
            primaryUnit == UnitType.HECTO && secondaryUnit == UnitType.MICRO -> 1.0 * 10.0.pow(8)
            primaryUnit == UnitType.HECTO && secondaryUnit == UnitType.NANO -> 1.0 * 10.0.pow(11)
            primaryUnit == UnitType.HECTO && secondaryUnit == UnitType.PICO -> 1.0 * 10.0.pow(14)
            primaryUnit == UnitType.HECTO && secondaryUnit == UnitType.FEMTO -> 1.0 * 10.0.pow(17)
            primaryUnit == UnitType.HECTO && secondaryUnit == UnitType.ATTO -> 1.0 * 10.0.pow(20)
            primaryUnit == UnitType.HECTO && secondaryUnit == UnitType.ZEPTO -> 1.0 * 10.0.pow(23)
            primaryUnit == UnitType.HECTO && secondaryUnit == UnitType.YOCTO -> 1.0 * 10.0.pow(26)

            primaryUnit == UnitType.DECA && secondaryUnit == UnitType.YOTTA -> 1.0 * 10.0.pow(-23)
            primaryUnit == UnitType.DECA && secondaryUnit == UnitType.ZETTA -> 1.0 * 10.0.pow(-20)
            primaryUnit == UnitType.DECA && secondaryUnit == UnitType.EXA -> 1.0 * 10.0.pow(-17)
            primaryUnit == UnitType.DECA && secondaryUnit == UnitType.PETA -> 1.0 * 10.0.pow(-14)
            primaryUnit == UnitType.DECA && secondaryUnit == UnitType.TERA -> 1.0 * 10.0.pow(-11)
            primaryUnit == UnitType.DECA && secondaryUnit == UnitType.GIGA -> 1.0 * 10.0.pow(-8)
            primaryUnit == UnitType.DECA && secondaryUnit == UnitType.MEGA -> 1.0 * 10.0.pow(-5)
            primaryUnit == UnitType.DECA && secondaryUnit == UnitType.KILO -> 0.01
            primaryUnit == UnitType.DECA && secondaryUnit == UnitType.HECTO -> 0.1
            primaryUnit == UnitType.DECA && secondaryUnit == UnitType.DECA -> 1.0
            primaryUnit == UnitType.DECA && secondaryUnit == UnitType.DECI -> 100.0
            primaryUnit == UnitType.DECA && secondaryUnit == UnitType.CENTI -> 1000.0
            primaryUnit == UnitType.DECA && secondaryUnit == UnitType.MILLI -> 1.0 * 10.0.pow(4)
            primaryUnit == UnitType.DECA && secondaryUnit == UnitType.MICRO -> 1.0 * 10.0.pow(7)
            primaryUnit == UnitType.DECA && secondaryUnit == UnitType.NANO -> 1.0 * 10.0.pow(10)
            primaryUnit == UnitType.DECA && secondaryUnit == UnitType.PICO -> 1.0 * 10.0.pow(13)
            primaryUnit == UnitType.DECA && secondaryUnit == UnitType.FEMTO -> 1.0 * 10.0.pow(16)
            primaryUnit == UnitType.DECA && secondaryUnit == UnitType.ATTO -> 1.0 * 10.0.pow(19)
            primaryUnit == UnitType.DECA && secondaryUnit == UnitType.ZEPTO -> 1.0 * 10.0.pow(22)
            primaryUnit == UnitType.DECA && secondaryUnit == UnitType.YOCTO -> 1.0 * 10.0.pow(25)

            primaryUnit == UnitType.DECI && secondaryUnit == UnitType.YOTTA -> 1.0 * 10.0.pow(-25)
            primaryUnit == UnitType.DECI && secondaryUnit == UnitType.ZETTA -> 1.0 * 10.0.pow(-22)
            primaryUnit == UnitType.DECI && secondaryUnit == UnitType.EXA -> 1.0 * 10.0.pow(-19)
            primaryUnit == UnitType.DECI && secondaryUnit == UnitType.PETA -> 1.0 * 10.0.pow(-16)
            primaryUnit == UnitType.DECI && secondaryUnit == UnitType.TERA -> 1.0 * 10.0.pow(-13)
            primaryUnit == UnitType.DECI && secondaryUnit == UnitType.GIGA -> 1.0 * 10.0.pow(-10)
            primaryUnit == UnitType.DECI && secondaryUnit == UnitType.MEGA -> 1.0 * 10.0.pow(-7)
            primaryUnit == UnitType.DECI && secondaryUnit == UnitType.KILO -> 0.0001
            primaryUnit == UnitType.DECI && secondaryUnit == UnitType.HECTO -> 0.001
            primaryUnit == UnitType.DECI && secondaryUnit == UnitType.DECA -> 0.01
            primaryUnit == UnitType.DECI && secondaryUnit == UnitType.DECI -> 1.0
            primaryUnit == UnitType.DECI && secondaryUnit == UnitType.CENTI -> 10.0
            primaryUnit == UnitType.DECI && secondaryUnit == UnitType.MILLI -> 100.0
            primaryUnit == UnitType.DECI && secondaryUnit == UnitType.MICRO -> 1.0 * 10.0.pow(5)
            primaryUnit == UnitType.DECI && secondaryUnit == UnitType.NANO -> 1.0 * 10.0.pow(8)
            primaryUnit == UnitType.DECI && secondaryUnit == UnitType.PICO -> 1.0 * 10.0.pow(11)
            primaryUnit == UnitType.DECI && secondaryUnit == UnitType.FEMTO -> 1.0 * 10.0.pow(14)
            primaryUnit == UnitType.DECI && secondaryUnit == UnitType.ATTO -> 1.0 * 10.0.pow(17)
            primaryUnit == UnitType.DECI && secondaryUnit == UnitType.ZEPTO -> 1.0 * 10.0.pow(20)
            primaryUnit == UnitType.DECI && secondaryUnit == UnitType.YOCTO -> 1.0 * 10.0.pow(23)

            primaryUnit == UnitType.CENTI && secondaryUnit == UnitType.YOTTA -> 1.0 * 10.0.pow(-26)
            primaryUnit == UnitType.CENTI && secondaryUnit == UnitType.ZETTA -> 1.0 * 10.0.pow(-23)
            primaryUnit == UnitType.CENTI && secondaryUnit == UnitType.EXA -> 1.0 * 10.0.pow(-20)
            primaryUnit == UnitType.CENTI && secondaryUnit == UnitType.PETA -> 1.0 * 10.0.pow(-17)
            primaryUnit == UnitType.CENTI && secondaryUnit == UnitType.TERA -> 1.0 * 10.0.pow(-14)
            primaryUnit == UnitType.CENTI && secondaryUnit == UnitType.GIGA -> 1.0 * 10.0.pow(-11)
            primaryUnit == UnitType.CENTI && secondaryUnit == UnitType.MEGA -> 1.0 * 10.0.pow(-8)
            primaryUnit == UnitType.CENTI && secondaryUnit == UnitType.KILO -> 1.0 * 10.0.pow(-5)
            primaryUnit == UnitType.CENTI && secondaryUnit == UnitType.HECTO -> 0.0001
            primaryUnit == UnitType.CENTI && secondaryUnit == UnitType.DECA -> 0.001
            primaryUnit == UnitType.CENTI && secondaryUnit == UnitType.DECI -> 0.1
            primaryUnit == UnitType.CENTI && secondaryUnit == UnitType.CENTI -> 1.0
            primaryUnit == UnitType.CENTI && secondaryUnit == UnitType.MILLI -> 10.0
            primaryUnit == UnitType.CENTI && secondaryUnit == UnitType.MICRO -> 1.0 * 10.0.pow(4)
            primaryUnit == UnitType.CENTI && secondaryUnit == UnitType.NANO -> 1.0 * 10.0.pow(7)
            primaryUnit == UnitType.CENTI && secondaryUnit == UnitType.PICO -> 1.0 * 10.0.pow(10)
            primaryUnit == UnitType.CENTI && secondaryUnit == UnitType.FEMTO -> 1.0 * 10.0.pow(13)
            primaryUnit == UnitType.CENTI && secondaryUnit == UnitType.ATTO -> 1.0 * 10.0.pow(16)
            primaryUnit == UnitType.CENTI && secondaryUnit == UnitType.ZEPTO -> 1.0 * 10.0.pow(19)
            primaryUnit == UnitType.CENTI && secondaryUnit == UnitType.YOCTO -> 1.0 * 10.0.pow( 22)

            primaryUnit == UnitType.MILLI && secondaryUnit == UnitType.YOTTA -> 1.0 * 10.0.pow(-27)
            primaryUnit == UnitType.MILLI && secondaryUnit == UnitType.ZETTA -> 1.0 * 10.0.pow(-24)
            primaryUnit == UnitType.MILLI && secondaryUnit == UnitType.EXA -> 1.0 * 10.0.pow(-21)
            primaryUnit == UnitType.MILLI && secondaryUnit == UnitType.PETA -> 1.0 * 10.0.pow(-18)
            primaryUnit == UnitType.MILLI && secondaryUnit == UnitType.TERA -> 1.0 * 10.0.pow(-15)
            primaryUnit == UnitType.MILLI && secondaryUnit == UnitType.GIGA -> 1.0 * 10.0.pow(-12)
            primaryUnit == UnitType.MILLI && secondaryUnit == UnitType.MEGA -> 1.0 * 10.0.pow(-9)
            primaryUnit == UnitType.MILLI && secondaryUnit == UnitType.KILO -> 1.0 * 10.0.pow(-6)
            primaryUnit == UnitType.MILLI && secondaryUnit == UnitType.HECTO -> 1.0 * 10.0.pow(-5)
            primaryUnit == UnitType.MILLI && secondaryUnit == UnitType.DECA -> 0.0001
            primaryUnit == UnitType.MILLI && secondaryUnit == UnitType.DECI -> 0.01
            primaryUnit == UnitType.MILLI && secondaryUnit == UnitType.CENTI -> 0.1
            primaryUnit == UnitType.MILLI && secondaryUnit == UnitType.MILLI -> 1.0
            primaryUnit == UnitType.MILLI && secondaryUnit == UnitType.MICRO -> 1000.0
            primaryUnit == UnitType.MILLI && secondaryUnit == UnitType.NANO -> 1.0 * 10.0.pow(6)
            primaryUnit == UnitType.MILLI && secondaryUnit == UnitType.PICO -> 1.0 * 10.0.pow(9)
            primaryUnit == UnitType.MILLI && secondaryUnit == UnitType.FEMTO -> 1.0 * 10.0.pow(12)
            primaryUnit == UnitType.MILLI && secondaryUnit == UnitType.ATTO -> 1.0 * 10.0.pow(15)
            primaryUnit == UnitType.MILLI && secondaryUnit == UnitType.ZEPTO -> 1.0 * 10.0.pow(18)
            primaryUnit == UnitType.MILLI && secondaryUnit == UnitType.YOCTO -> 1.0 * 10.0.pow(21)

            primaryUnit == UnitType.MICRO && secondaryUnit == UnitType.YOTTA -> 1.0 * 10.0.pow(-30)
            primaryUnit == UnitType.MICRO && secondaryUnit == UnitType.ZETTA -> 1.0 * 10.0.pow(-27)
            primaryUnit == UnitType.MICRO && secondaryUnit == UnitType.EXA -> 1.0 * 10.0.pow(-24)
            primaryUnit == UnitType.MICRO && secondaryUnit == UnitType.PETA -> 1.0 * 10.0.pow(-21)
            primaryUnit == UnitType.MICRO && secondaryUnit == UnitType.TERA -> 1.0 * 10.0.pow(-18)
            primaryUnit == UnitType.MICRO && secondaryUnit == UnitType.GIGA -> 1.0 * 10.0.pow(-15)
            primaryUnit == UnitType.MICRO && secondaryUnit == UnitType.MEGA -> 1.0 * 10.0.pow(-12)
            primaryUnit == UnitType.MICRO && secondaryUnit == UnitType.KILO -> 1.0 * 10.0.pow(-9)
            primaryUnit == UnitType.MICRO && secondaryUnit == UnitType.HECTO -> 1.0 * 10.0.pow(-8)
            primaryUnit == UnitType.MICRO && secondaryUnit == UnitType.DECA -> 1.0 * 10.0.pow(-7)
            primaryUnit == UnitType.MICRO && secondaryUnit == UnitType.DECI -> 1.0 * 10.0.pow(-5)
            primaryUnit == UnitType.MICRO && secondaryUnit == UnitType.CENTI -> 1.0 * 10.0.pow(-4)
            primaryUnit == UnitType.MICRO && secondaryUnit == UnitType.MILLI -> 0.001
            primaryUnit == UnitType.MICRO && secondaryUnit == UnitType.MICRO -> 1.0
            primaryUnit == UnitType.MICRO && secondaryUnit == UnitType.NANO -> 1000.0
            primaryUnit == UnitType.MICRO && secondaryUnit == UnitType.PICO -> 1.0 * 10.0.pow(6)
            primaryUnit == UnitType.MICRO && secondaryUnit == UnitType.FEMTO -> 1.0 * 10.0.pow(9)
            primaryUnit == UnitType.MICRO && secondaryUnit == UnitType.ATTO -> 1.0 * 10.0.pow(12)
            primaryUnit == UnitType.MICRO && secondaryUnit == UnitType.ZEPTO -> 1.0 * 10.0.pow(15)
            primaryUnit == UnitType.MICRO && secondaryUnit == UnitType.YOCTO -> 1.0 * 10.0.pow(18)

            primaryUnit == UnitType.NANO && secondaryUnit == UnitType.YOTTA -> 1.0 * 10.0.pow(-33)
            primaryUnit == UnitType.NANO && secondaryUnit == UnitType.ZETTA -> 1.0 * 10.0.pow(-30)
            primaryUnit == UnitType.NANO && secondaryUnit == UnitType.EXA -> 1.0 * 10.0.pow(-27)
            primaryUnit == UnitType.NANO && secondaryUnit == UnitType.PETA -> 1.0 * 10.0.pow(-24)
            primaryUnit == UnitType.NANO && secondaryUnit == UnitType.TERA -> 1.0 * 10.0.pow(-21)
            primaryUnit == UnitType.NANO && secondaryUnit == UnitType.GIGA -> 1.0 * 10.0.pow(-18)
            primaryUnit == UnitType.NANO && secondaryUnit == UnitType.MEGA -> 1.0 * 10.0.pow(-15)
            primaryUnit == UnitType.NANO && secondaryUnit == UnitType.KILO -> 1.0 * 10.0.pow(-12)
            primaryUnit == UnitType.NANO && secondaryUnit == UnitType.HECTO -> 1.0 * 10.0.pow(-11)
            primaryUnit == UnitType.NANO && secondaryUnit == UnitType.DECA -> 1.0 * 10.0.pow(-10)
            primaryUnit == UnitType.NANO && secondaryUnit == UnitType.DECI -> 1.0 * 10.0.pow(-8)
            primaryUnit == UnitType.NANO && secondaryUnit == UnitType.CENTI -> 1.0 * 10.0.pow(-7)
            primaryUnit == UnitType.NANO && secondaryUnit == UnitType.MILLI -> 1.0 * 10.0.pow(-6)
            primaryUnit == UnitType.NANO && secondaryUnit == UnitType.MICRO -> 0.001
            primaryUnit == UnitType.NANO && secondaryUnit == UnitType.NANO -> 1.0
            primaryUnit == UnitType.NANO && secondaryUnit == UnitType.PICO -> 1000.0
            primaryUnit == UnitType.NANO && secondaryUnit == UnitType.FEMTO -> 1.0 * 10.0.pow(6)
            primaryUnit == UnitType.NANO && secondaryUnit == UnitType.ATTO -> 1.0 * 10.0.pow(9)
            primaryUnit == UnitType.NANO && secondaryUnit == UnitType.ZEPTO -> 1.0 * 10.0.pow(12)
            primaryUnit == UnitType.NANO && secondaryUnit == UnitType.YOCTO -> 1.0 * 10.0.pow(15)

            primaryUnit == UnitType.PICO && secondaryUnit == UnitType.YOTTA -> 1.0 * 10.0.pow(-36)
            primaryUnit == UnitType.PICO && secondaryUnit == UnitType.ZETTA -> 1.0 * 10.0.pow(-33)
            primaryUnit == UnitType.PICO && secondaryUnit == UnitType.EXA -> 1.0 * 10.0.pow(-30)
            primaryUnit == UnitType.PICO && secondaryUnit == UnitType.PETA -> 1.0 * 10.0.pow(-27)
            primaryUnit == UnitType.PICO && secondaryUnit == UnitType.TERA -> 1.0 * 10.0.pow(-24)
            primaryUnit == UnitType.PICO && secondaryUnit == UnitType.GIGA -> 1.0 * 10.0.pow(-21)
            primaryUnit == UnitType.PICO && secondaryUnit == UnitType.MEGA -> 1.0 * 10.0.pow(-18)
            primaryUnit == UnitType.PICO && secondaryUnit == UnitType.KILO -> 1.0 * 10.0.pow(-15)
            primaryUnit == UnitType.PICO && secondaryUnit == UnitType.HECTO -> 1.0 * 10.0.pow(-14)
            primaryUnit == UnitType.PICO && secondaryUnit == UnitType.DECA -> 1.0 * 10.0.pow(-13)
            primaryUnit == UnitType.PICO && secondaryUnit == UnitType.DECI -> 1.0 * 10.0.pow(-11)
            primaryUnit == UnitType.PICO && secondaryUnit == UnitType.CENTI -> 1.0 * 10.0.pow(-10)
            primaryUnit == UnitType.PICO && secondaryUnit == UnitType.MILLI -> 1.0 * 10.0.pow(-9)
            primaryUnit == UnitType.PICO && secondaryUnit == UnitType.MICRO -> 1.0 * 10.0.pow(-6)
            primaryUnit == UnitType.PICO && secondaryUnit == UnitType.NANO -> 0.001
            primaryUnit == UnitType.PICO && secondaryUnit == UnitType.PICO -> 1.0
            primaryUnit == UnitType.PICO && secondaryUnit == UnitType.FEMTO ->1000.0
            primaryUnit == UnitType.PICO && secondaryUnit == UnitType.ATTO -> 1.0 * 10.0.pow(6)
            primaryUnit == UnitType.PICO && secondaryUnit == UnitType.ZEPTO -> 1.0 * 10.0.pow(9)
            primaryUnit == UnitType.PICO && secondaryUnit == UnitType.YOCTO -> 1.0 * 10.0.pow(12)

            primaryUnit == UnitType.FEMTO && secondaryUnit == UnitType.YOTTA -> 1.0 * 10.0.pow(-39)
            primaryUnit == UnitType.FEMTO && secondaryUnit == UnitType.ZETTA -> 1.0 * 10.0.pow(-36)
            primaryUnit == UnitType.FEMTO && secondaryUnit == UnitType.EXA -> 1.0 * 10.0.pow(-33)
            primaryUnit == UnitType.FEMTO && secondaryUnit == UnitType.PETA -> 1.0 * 10.0.pow(-30)
            primaryUnit == UnitType.FEMTO && secondaryUnit == UnitType.TERA -> 1.0 * 10.0.pow(-27)
            primaryUnit == UnitType.FEMTO && secondaryUnit == UnitType.GIGA -> 1.0 * 10.0.pow(-24)
            primaryUnit == UnitType.FEMTO && secondaryUnit == UnitType.MEGA -> 1.0 * 10.0.pow(-21)
            primaryUnit == UnitType.FEMTO && secondaryUnit == UnitType.KILO -> 1.0 * 10.0.pow(-18)
            primaryUnit == UnitType.FEMTO && secondaryUnit == UnitType.HECTO -> 1.0 * 10.0.pow(-17)
            primaryUnit == UnitType.FEMTO && secondaryUnit == UnitType.DECA -> 1.0 * 10.0.pow(-16)
            primaryUnit == UnitType.FEMTO && secondaryUnit == UnitType.DECI -> 1.0 * 10.0.pow(-14)
            primaryUnit == UnitType.FEMTO && secondaryUnit == UnitType.CENTI -> 1.0 * 10.0.pow(-13)
            primaryUnit == UnitType.FEMTO && secondaryUnit == UnitType.MILLI -> 1.0 * 10.0.pow(-12)
            primaryUnit == UnitType.FEMTO && secondaryUnit == UnitType.MICRO -> 1.0 * 10.0.pow(-9)
            primaryUnit == UnitType.FEMTO && secondaryUnit == UnitType.NANO -> 1.0 * 10.0.pow(-6)
            primaryUnit == UnitType.FEMTO && secondaryUnit == UnitType.PICO -> 0.001
            primaryUnit == UnitType.FEMTO && secondaryUnit == UnitType.FEMTO -> 1.0
            primaryUnit == UnitType.FEMTO && secondaryUnit == UnitType.ATTO -> 1000.0
            primaryUnit == UnitType.FEMTO && secondaryUnit == UnitType.ZEPTO -> 1.0 * 10.0.pow(6)
            primaryUnit == UnitType.FEMTO && secondaryUnit == UnitType.YOCTO -> 1.0 * 10.0.pow(9)

            primaryUnit == UnitType.ATTO && secondaryUnit == UnitType.YOTTA -> 1.0 * 10.0.pow(-42)
            primaryUnit == UnitType.ATTO && secondaryUnit == UnitType.ZETTA -> 1.0 * 10.0.pow(-39)
            primaryUnit == UnitType.ATTO && secondaryUnit == UnitType.EXA -> 1.0 * 10.0.pow(-36)
            primaryUnit == UnitType.ATTO && secondaryUnit == UnitType.PETA -> 1.0 * 10.0.pow(-33)
            primaryUnit == UnitType.ATTO && secondaryUnit == UnitType.TERA -> 1.0 * 10.0.pow(-30)
            primaryUnit == UnitType.ATTO && secondaryUnit == UnitType.GIGA -> 1.0 * 10.0.pow(-27)
            primaryUnit == UnitType.ATTO && secondaryUnit == UnitType.MEGA -> 1.0 * 10.0.pow(-24)
            primaryUnit == UnitType.ATTO && secondaryUnit == UnitType.KILO -> 1.0 * 10.0.pow(-21)
            primaryUnit == UnitType.ATTO && secondaryUnit == UnitType.HECTO -> 1.0 * 10.0.pow(-20)
            primaryUnit == UnitType.ATTO && secondaryUnit == UnitType.DECA -> 1.0 * 10.0.pow(-19)
            primaryUnit == UnitType.ATTO && secondaryUnit == UnitType.DECI -> 1.0 * 10.0.pow(-17)
            primaryUnit == UnitType.ATTO && secondaryUnit == UnitType.CENTI -> 1.0 * 10.0.pow(-16)
            primaryUnit == UnitType.ATTO && secondaryUnit == UnitType.MILLI -> 1.0 * 10.0.pow(-15)
            primaryUnit == UnitType.ATTO && secondaryUnit == UnitType.MICRO -> 1.0 * 10.0.pow(-12)
            primaryUnit == UnitType.ATTO && secondaryUnit == UnitType.NANO -> 1.0 * 10.0.pow(-9)
            primaryUnit == UnitType.ATTO && secondaryUnit == UnitType.PICO -> 1.0 * 10.0.pow(-6)
            primaryUnit == UnitType.ATTO && secondaryUnit == UnitType.FEMTO -> 0.001
            primaryUnit == UnitType.ATTO && secondaryUnit == UnitType.ATTO -> 1.0
            primaryUnit == UnitType.ATTO && secondaryUnit == UnitType.ZEPTO -> 1000.0
            primaryUnit == UnitType.ATTO && secondaryUnit == UnitType.YOCTO -> 1.0 * 10.0.pow(6)

            primaryUnit == UnitType.ZEPTO && secondaryUnit == UnitType.YOTTA -> 1.0 * 10.0.pow(-45)
            primaryUnit == UnitType.ZEPTO && secondaryUnit == UnitType.ZETTA -> 1.0 * 10.0.pow(-42)
            primaryUnit == UnitType.ZEPTO && secondaryUnit == UnitType.EXA -> 1.0 * 10.0.pow(-39)
            primaryUnit == UnitType.ZEPTO && secondaryUnit == UnitType.PETA -> 1.0 * 10.0.pow(-36)
            primaryUnit == UnitType.ZEPTO && secondaryUnit == UnitType.TERA -> 1.0 * 10.0.pow(-33)
            primaryUnit == UnitType.ZEPTO && secondaryUnit == UnitType.GIGA -> 1.0 * 10.0.pow(-30)
            primaryUnit == UnitType.ZEPTO && secondaryUnit == UnitType.MEGA -> 1.0 * 10.0.pow(-27)
            primaryUnit == UnitType.ZEPTO && secondaryUnit == UnitType.KILO -> 1.0 * 10.0.pow(-24)
            primaryUnit == UnitType.ZEPTO && secondaryUnit == UnitType.HECTO -> 1.0 * 10.0.pow(-23)
            primaryUnit == UnitType.ZEPTO && secondaryUnit == UnitType.DECA -> 1.0 * 10.0.pow(-22)
            primaryUnit == UnitType.ZEPTO && secondaryUnit == UnitType.DECI -> 1.0 * 10.0.pow(-20)
            primaryUnit == UnitType.ZEPTO && secondaryUnit == UnitType.CENTI -> 1.0 * 10.0.pow(-19)
            primaryUnit == UnitType.ZEPTO && secondaryUnit == UnitType.MILLI -> 1.0 * 10.0.pow(-18)
            primaryUnit == UnitType.ZEPTO && secondaryUnit == UnitType.MICRO -> 1.0 * 10.0.pow(-15)
            primaryUnit == UnitType.ZEPTO && secondaryUnit == UnitType.NANO -> 1.0 * 10.0.pow(-12)
            primaryUnit == UnitType.ZEPTO && secondaryUnit == UnitType.PICO -> 1.0 * 10.0.pow(-9)
            primaryUnit == UnitType.ZEPTO && secondaryUnit == UnitType.FEMTO -> 1.0 * 10.0.pow(-6)
            primaryUnit == UnitType.ZEPTO && secondaryUnit == UnitType.ATTO -> 0.001
            primaryUnit == UnitType.ZEPTO && secondaryUnit == UnitType.ZEPTO -> 1.0
            primaryUnit == UnitType.ZEPTO && secondaryUnit == UnitType.YOCTO -> 1000.0

            primaryUnit == UnitType.YOCTO && secondaryUnit == UnitType.YOTTA -> 1.0 * 10.0.pow(-48)
            primaryUnit == UnitType.YOCTO && secondaryUnit == UnitType.ZETTA -> 1.0 * 10.0.pow(-45)
            primaryUnit == UnitType.YOCTO && secondaryUnit == UnitType.EXA -> 1.0 * 10.0.pow(-42)
            primaryUnit == UnitType.YOCTO && secondaryUnit == UnitType.PETA -> 1.0 * 10.0.pow(-39)
            primaryUnit == UnitType.YOCTO && secondaryUnit == UnitType.TERA -> 1.0 * 10.0.pow(-36)
            primaryUnit == UnitType.YOCTO && secondaryUnit == UnitType.GIGA -> 1.0 * 10.0.pow(-33)
            primaryUnit == UnitType.YOCTO && secondaryUnit == UnitType.MEGA -> 1.0 * 10.0.pow(-30)
            primaryUnit == UnitType.YOCTO && secondaryUnit == UnitType.KILO -> 1.0 * 10.0.pow(-27)
            primaryUnit == UnitType.YOCTO && secondaryUnit == UnitType.HECTO -> 1.0 * 10.0.pow(-26)
            primaryUnit == UnitType.YOCTO && secondaryUnit == UnitType.DECA -> 1.0 * 10.0.pow(-25)
            primaryUnit == UnitType.YOCTO && secondaryUnit == UnitType.DECI -> 1.0 * 10.0.pow(-23)
            primaryUnit == UnitType.YOCTO && secondaryUnit == UnitType.CENTI -> 1.0 * 10.0.pow(-22)
            primaryUnit == UnitType.YOCTO && secondaryUnit == UnitType.MILLI -> 1.0 * 10.0.pow(-21)
            primaryUnit == UnitType.YOCTO && secondaryUnit == UnitType.MICRO -> 1.0 * 10.0.pow(-18)
            primaryUnit == UnitType.YOCTO && secondaryUnit == UnitType.NANO -> 1.0 * 10.0.pow(-15)
            primaryUnit == UnitType.YOCTO && secondaryUnit == UnitType.PICO -> 1.0 * 10.0.pow(-12)
            primaryUnit == UnitType.YOCTO && secondaryUnit == UnitType.FEMTO -> 1.0 * 10.0.pow(-9)
            primaryUnit == UnitType.YOCTO && secondaryUnit == UnitType.ATTO -> 1.0 * 10.0.pow(-6)
            primaryUnit == UnitType.YOCTO && secondaryUnit == UnitType.ZEPTO -> 0.001
            primaryUnit == UnitType.YOCTO && secondaryUnit == UnitType.YOCTO -> 1.0

            else -> 0.0
        }

        return primaryValue * coefficient
    }

    return 0.0
}