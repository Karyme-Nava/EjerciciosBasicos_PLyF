fun main(){
    val celsiusToFahrenheit = {initialMeasurement: Double -> 9.0/5.0 * initialMeasurement + 32.0}
    printFinalTemperature(27.0, "Celsius", "Fahrenheit", celsiusToFahrenheit)
    val kelvinToCelsius = {initialMeasurement: Double -> initialMeasurement - 273.15}
    printFinalTemperature(350.0, "Kelvin", "Celsius", kelvinToCelsius)
    val fahrenheitToKelvin = {initialMeasurement: Double -> 5.0/9.0 * (initialMeasurement - 32.0) + 273.15}
    printFinalTemperature(10.0, "Fahrenheit", "Kelvin", fahrenheitToKelvin)
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
){
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement))
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}