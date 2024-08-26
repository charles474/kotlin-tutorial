fun main() {
    val value = double(2);
    println(value)

    // Destructuring of multi-value return
    val (p1, p2) = twoValues()
    println("$p1 $p2")

    println()

    val (t1, t2, t3) = returnThree()
    println("$t1 $t2 $t3")
}

// Functions expressions which returns a value. Only use when your function does not perform any other addition calculation (see example below)
fun double(n: Int): Int = n * 2

fun double2(n: Int): Int {
    print(n);
    return n * 2
}

// Functions that return multiple values
// 1) Using a Pair
fun twoValues(): Pair<String, Int> {
    return "Kotlin" to 20
}

//fun twoValues(): Pair<String, Int> = "Kotlin" to 20

//fun twoValues(): Pair<String, Int> = Pair("Kotlin", 20)

// Returns Triple values
// 2) Using a Triple
fun returnThree(): Triple<String, Int, Char> {
    return Triple(
        "Kotlin",
        20,
        'K'
    )
}

//fun returnThree(): Triple<String, Int, Char> = Triple(
//    "Kotlin",
//    20,
//    'K'
//)