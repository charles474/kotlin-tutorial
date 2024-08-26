fun main() {
    val names = listOf(
        "Kotlin",
        "C++",
        "Java",
        "JavaScript",
    )

    // Must be destructured in order
    /*
        val (kotlin, cPlusPlus, java, javascript) = names

        println("$kotlin, $cPlusPlus, $java, $javascript")
     */


    // Same but with java omitted. USe the underscore i.e. "_"to omit a value
    val (kotlin, cPlusPlus, _, javascript) = names

    println("$kotlin, $cPlusPlus, $javascript")

    // The usual old way
    /*
        val kotlin = names[0]
        val cPluPlus = names[1]
        val java = names[2]
        val javascript = names[3]
     */
}