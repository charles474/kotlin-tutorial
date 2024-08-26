fun main() {
    var name = "Kotlin"
    /*
        Kotlin doesn't allow the reassignment if a non-null variable to null. It won't allow it.
     */
    // name = null
    println(name.uppercase())

    /*
        Notice the "?" after the data type declaration.
        This is basically saying the branch variable can have a string value or a null value.
     */
    var name2: String? = "Kotlin"
    name2 = null
    println(name2)


    /*
        Notice the "?" before accessing the method operation that can be performed on a string.
        This is similar to the JavaScript optional chaining where it performs a nullish check
        on "name3" before invoking the .uppercase() function.
     */
    var name3: String? = null
    println(name3?.uppercase())
}