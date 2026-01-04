fun main() {
    val temp = 10.0
    fun celsiusToFareneheit(celsius: Double): Double {
        return 9.0 / 5.0 * celsius + 32
    }
    fun kelvinToCelsiu(kelvin: Double): Double {
        return kelvin - 273.15 
    }
        fun fahrenheitToKelvin(fahrenheit: Double): Double {
            return 5.0 / 9.0 * (fahrenheit - 32) + 273.15
        }
    
    printFinalTemperature(temp,"Fahrenheit", "Kelvin", ::FahrenheitToKelvin)
    //{newTemp -> (newTemp) }
}


fun printFinalTemperature(
    initialMeasurement: Double, 
    initialUnit: String, 
    finalUnit: String, 
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}

// Celsius to Fahrenheit: ° F = 9/5 (° C) + 32
// Kelvin to Celsius: ° C = K - 273.15
// Fahrenheit to Kelvin: K = 5/9 (° F - 32) + 273.15

// Note that the String.format("%.2f", /* measurement */ ) method is used to convert a number into a String type with 2 decimal places.

// Complete the main() function so that it calls the printFinalTemperature() 
// function and prints the following lines. You need to pass arguments for the 
// temperature and conversion formula. Hint: you may want to use Double values to avoid 
// Integer truncation during division operations.

// 27.0 degrees Celsius is 80.60 degrees Fahrenheit.
// 350.0 degrees Kelvin is 76.85 degrees Celsius.
// 10.0 degrees Fahrenheit is 260.93 degrees Kelvin.
