fun main() {
    // Range of 1 to 10
    for (index in 1..10) println(index)

    println()

    // In reverse
    for (index in 10 downTo 1) println(index)

    println()

    // Step up in twos
    for (index in 1..10 step 2) println(index)

    println()

    // Step down in twos
    for (index in 10 downTo  1 step 2 ) println(index)
}