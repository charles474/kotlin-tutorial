fun main() {
    // Variables with the var keyword are mutable. They can be reassigned.
    var brandVar = "Kotlin"
    brandVar = "Kotlin Changed"

    /*
        Variables with the val keyword are immutable. They cannot be reassigned.
        For usage, use "val" as immutability is always preferred. Use "var" only when the variable required reassignment.
     */
    val brandVal = "Kotlin"
    // brandVal = "Kotlin Code"
}