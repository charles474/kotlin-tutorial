fun main() {
    val n1 = 10
    val n2 = 20

    // val result = n1 > n2 ? ":)" : ":(" // Java like
    val result = if (n1 > n2) ":)" else ":("

    // Else if example
    val result2 =
        if (n1 > n2) ":)"
        else if (n1 < n2) "hooray"
        else if (n1 >= n2 && n1 <= n2) "hold up"
        else ":("

    println(result)
    println(result2)
}