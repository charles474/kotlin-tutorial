/*
    Const keyword is for creating constant variables that will never change. It cannot be defined inside a function.
    This value is KNOWN before code execution i.e. it is not being computed from somewhere else.
 */
const val PI = 3.14

// val pi = getPiValue() // This is allowed
// const val pi = getPiValue() // This is not allowed

fun main() {
    val name = "Kotlin" // read only
    // name = "Code"

    var age = 10 // mutable
    // age = 15
}

fun getPiValue(): Double = 3.14