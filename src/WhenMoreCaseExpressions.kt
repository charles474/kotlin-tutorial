fun main() {
    val gender = "F"

    // Used as an expression that returns a value
    val value = when(gender) {
        "F" -> "Female"
        "M" -> "Male"
        else -> "Unknown Gender"
    }
    println(value)

    // Alternative example - if else to when expression
    val value2 = when {
        gender == "F" -> "Female"
        gender == "M" -> "Male"
        else -> "Unknown Gender"
    }
    println(value2)


    val age = 18

    // Alternative example - if else to when expression
    when (age) {
        // This is a range
        in 13..19 -> println("Teenager")
        !in 0..12 -> println("Not A Teenager")
        else -> println("Unknown")
    }
}