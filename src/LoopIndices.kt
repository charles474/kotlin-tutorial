fun main() {
    val names = listOf("Kotlin", "Java", "JavaScript", "C++")

    for (index in names.indices) {
        // println(index)
        println("$index - ${names[index]}")
    }

    println()
    println("reverse")

    for (index in names.indices.reversed()) {
        // println(index)
        println("$index - ${names[index]}")
    }
}