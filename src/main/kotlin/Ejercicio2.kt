fun main(){
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person eged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person eged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person eged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int{
    return when{
        age >= 0 && age <= 12 -> 15
        age >= 13 && age <= 60 && !isMonday -> 30
        age >= 13 && age <= 60 && isMonday -> 25
        age >= 61 && age <= 100 -> 20
        else -> -1
    }
}