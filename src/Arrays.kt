fun main() {
    // This is a valid array
    // val names  = arrayOf("Kotlin", "Java", 2)

    // To make sure we have an array of a singular data type, see example below for type us.
    val names  = arrayOf<String>("Kotlin", "Java") // Once this array is defined, it CAN NO LONGER be resized.

    names.forEach { println(it) } // "it" is provided by default

    // OR

    names.forEach { name -> println(name) }

    println(names.contentToString())


    // Searching for a value in an array using the "IN" keyword
    if ("Kotlin" in names) {
        println("Found")
    } else {
        println("Not found")
    }
}