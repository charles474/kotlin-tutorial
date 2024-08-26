fun main() {
    val n1 = 10
    val n2 = 20

    /*
        The return keyword is not explicitly required in Kotlin when a return value is required.
        Whatever comes last is what is returned and assigned to the value variable from this expression
     */
    val value = if (n1 > n2) {
        ":)"
    } else {
        ":("
    }

    println(value)
}