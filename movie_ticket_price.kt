fun main() {
    val child = 5
    val adult = 28
    val senior = 87
    val invalid = 450
    
    val isMonday = true
    
    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
    println("The movie ticket price for a person aged $invalid is \$${ticketPrice(invalid, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    // Fill in the code.
    if(age <= 12) {
        return 15
    } else if(age >= 13 && age <= 60 ) {
    if(isMonday == true){
        return 25}
    return 30
    } else if(age <= 100) {
        return 20
    } else {
        return -1
    }
}