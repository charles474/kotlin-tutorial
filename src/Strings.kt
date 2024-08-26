fun main() {
    val name = "Kotlin"
    println(name)
    println(name.length)
    println(name.uppercase())
    println(name.lowercase())
    println(name[0])
    println(name[3])
    println(name.isEmpty())


    val age = 20

    val message = "Name: $name, Age: $age"
    println(message)

    /*
        Multiline strings
     */
    val email = """
        Hello %s
          How
        Are you?
    """.trimIndent()
    println(email.format(name))
}