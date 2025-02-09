package com.example.myapplication.CS101.Aflevering2


//parent class
open class Computer(
    open val productName: String,
    open var price: Int,
    open var isAvalible: Boolean
) {
    fun restockOrSoldOut() {
        isAvalible = !isAvalible
        println("$productName is now avalible: $isAvalible")
    }

    fun addToChart(product: String) {
        println("$product is added to chart!")
    }

    //for at kunne se ting og sager bedre i println
    override fun toString(): String {
        return "Computer(productName='$productName', price=$price, isAvalible=$isAvalible)"
    }
}

//child class 1
class Laptop(override val productName: String,
             override var price: Int,
             override var isAvalible: Boolean,
             var screenSize: String //additional property
): Computer(productName, price, isAvalible) {
    //additional method.
    fun charingDisplay() {
        println("Aah yes your laltop is charing")
    }
}

//child class 2
class smartPhone(override val productName: String,
                 override var price: Int,
                 override var isAvalible: Boolean,
                 var cameraQly: String //additional property
): Computer(productName, price, isAvalible) {
    //additional method.
    fun makeInputLonger(input: String):String {
        return input.repeat(3)
    }
}

