fun main() {
    val tv1 = SmartTech(
        "Samsung",
        "QLED",
        1000.0
    )

    val tv2 = SmartTech(
        "Samsung",
        "QLED Q660",
        1000.0
    )

    println("== (value comparison) ${tv1 == tv2}") //
    println("=== (memory location) ${tv1 === tv2}")
}

//fun main() {
//    // "tv" and "phone" are the objects whereas SmartTech class is the blueprint
//    val tv = SmartTech("Samsung", "QLED Q9877600876X", 1000.0)
////    tv.brand = "Samsung"
////    tv.model = "QLED Q9877600876X"
////    tv.price = 1000.0
//    println("${tv.brand} ${tv.model} ${tv.price}")
//    tv.turnOn()
//    tv.getDeviceState()
//    tv.turnOff()
//    tv.getDeviceState()
//    println(tv)
//
//    println()
//
//    val phone = SmartTech("Apple", "7 Pro", 1200.0)
////    phone.brand = "Apple"
////    phone.model = "7 Pro"
////    phone.price = 1200.0
//    println("${phone.brand} ${phone.model} ${phone.price}")
//    phone.turnOn()
//    phone.getDeviceState()
//    phone.turnOff()
//    phone.getDeviceState()
//    println(phone)
//
//
//    println()
//
//    val waterSensor = SmartTech("Tapo")
//
//    println()
//
//    val smartDevice = SmartTech()
//}

// Blueprint for how smart devices are created
class SmartTech(
    var brand: String,
    var model: String,
    var price: Double,
    var isSwitchedOn: Boolean = false
){
    // "this" keyword refers to the main constructor
    constructor(): this("", "", 0.0)

    constructor(
        brand: String
    ): this(brand, "", 0.0)

    private fun toFormattedState(state: Boolean): String {
        return when(state) {
            true -> "On"
            else -> "Off"
        }
    }

    fun getDeviceState(){
        println("$brand is ${toFormattedState(isSwitchedOn)}")
    }

    // methods/ functions
    fun turnOn() {
        isSwitchedOn = true
        println("$brand is switching on")
    }

    fun turnOff() {
        isSwitchedOn = false
        println("$brand is switching off")
    }

    override fun toString(): String {
        return "SmartTech(brand=$brand, model=$model, price=$price, isSwitchedOn=$isSwitchedOn)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as SmartTech

        if (brand != other.brand) return false
        if (model != other.model) return false
        if (price != other.price) return false
        if (isSwitchedOn != other.isSwitchedOn) return false

        return true
    }

    override fun hashCode(): Int {
        var result = brand.hashCode()
        result = 31 * result + model.hashCode()
        result = 31 * result + price.hashCode()
        result = 31 * result + isSwitchedOn.hashCode()
        return result
    }
}

//class SmartTech {
//    // properties
//
//    var brand: String = ""
//        get() = field // "field" is a reference to the value of "brand"
//        set(value) {
//            field = value
//        }
//    var model: String = ""
//    var price: Double = 0.0
//}