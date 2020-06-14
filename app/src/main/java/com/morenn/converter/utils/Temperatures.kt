package com.morenn.converter.utils

val temperaturesList = listOf(
    UnitType.CELSIUS,
    UnitType.FAHRENHEIT,
    UnitType.KELVIN
)

fun convertTemperatures(primaryValue: Double, primaryUnit: UnitType?, secondaryUnit: UnitType?): Double {
    if (primaryUnit != null && secondaryUnit != null) {
        return when {
            primaryUnit == UnitType.CELSIUS && secondaryUnit == UnitType.CELSIUS -> primaryValue
            primaryUnit == UnitType.CELSIUS && secondaryUnit == UnitType.FAHRENHEIT -> celsiusToFahrenheit(primaryValue)
            primaryUnit == UnitType.CELSIUS && secondaryUnit == UnitType.KELVIN -> celsiusToKelvin(primaryValue)

            primaryUnit == UnitType.FAHRENHEIT && secondaryUnit == UnitType.CELSIUS -> fahrenheitToCelsius(primaryValue)
            primaryUnit == UnitType.FAHRENHEIT && secondaryUnit == UnitType.FAHRENHEIT -> primaryValue
            primaryUnit == UnitType.FAHRENHEIT && secondaryUnit == UnitType.KELVIN -> fahrenheitToKelvin(primaryValue)

            primaryUnit == UnitType.KELVIN && secondaryUnit == UnitType.CELSIUS -> kelvinToCelsius(primaryValue)
            primaryUnit == UnitType.KELVIN && secondaryUnit == UnitType.FAHRENHEIT -> kelvinToFahrenheit(primaryValue)
            primaryUnit == UnitType.KELVIN && secondaryUnit == UnitType.KELVIN -> primaryValue

            else -> 0.0
        }
    }
    return 0.0
}

private fun celsiusToFahrenheit(primaryValue: Double): Double {
    return (primaryValue * 9/5) + 32
}

private fun celsiusToKelvin(primaryValue: Double): Double {
    return primaryValue + 273.15
}

private fun fahrenheitToCelsius(primaryValue: Double): Double {
    return (primaryValue.minus(32.0)) * (5/9)
}

private fun fahrenheitToKelvin(primaryValue: Double): Double {
    return fahrenheitToCelsius(primaryValue) + 273.15
}

private fun kelvinToCelsius(primaryValue: Double): Double {
    return primaryValue.minus(273.15)
}

private fun kelvinToFahrenheit(primaryValue: Double): Double {
    return primaryValue.minus(273.15) * 9/5 + 32
}