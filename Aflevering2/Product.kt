package com.example.myapplication.CS101.Aflevering2

open class Product (
    val name: String,
    var price: Int,
    var quality: Int )//0-5 stars
{
    open fun identifyProductCategory(): String {
        return "I am product"
    }

    //to string metode for sejere println
    override fun toString(): String {
        return "Product(name='$name', price=$price, quality=$quality)"
    }
}

//subclass
class Shoe(
    name: String,
    price: Int,
    quality: Int
): Product(name, price, quality) {
    override fun identifyProductCategory(): String {
        return "I am a shoe!"
    }
}

//subclass igen
class Tshirt (
    name: String,
    price: Int,
    quality: Int
): Product(name, price, quality) {
    override fun identifyProductCategory(): String {
        return "I am a T-shirt!"
    }
}

//subclass igen igen
//subclass igen
class Book (
    name: String,
    price: Int,
    quality: Int
): Product(name, price, quality) {
    override fun identifyProductCategory(): String {
        return "I am a book !"
    }
}
