fun main() {
//    val name1 = "Sally"
//    val name2 = "Dave"
//    val name3 = "Sally"

//    println(name1 == name3)
//    println(name1.equals(name3))


//    val name1 = "Sally"
//    val name2 = "Dave"
//    val name3 = String("Sally".toCharArray())

    // "==" and ".equals" are comparing values
//    println("== ${name1 == name3}")
//    println(".equals ${name1.equals(name3)}")


    // "===" is comparing memory address/ location
//    println("=== ${name1 === name3}")


    val name1 = "Sally"
    val name2 = "Dave"
    val name3 = "Sally"

    println("== ${name1 == name3}")
    println(".equals ${name1.equals(name3)}")
    println("=== ${name1 === name3}")
}