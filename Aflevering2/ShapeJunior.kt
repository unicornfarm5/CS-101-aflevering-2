package com.example.myapplication.CS101.Aflevering2


abstract class Shape(val color: String, val isTransparent: Boolean) {
    abstract fun calculatePerimeter(): Double
    abstract fun calculateArea(): Double
}

class Circle(private val radius: Double, color: String, isTransparent: Boolean) : Shape(color, isTransparent) {
    override fun calculatePerimeter(): Double {
        return 2 * Math.PI * radius
    }

    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }
}

class Triangle(private val side1: Double, private val side2: Double, private val side3: Double, color: String, isTransparent: Boolean) : Shape(color, isTransparent) {
    override fun calculatePerimeter(): Double {
        return side1 + side2 + side3
    }

    override fun calculateArea(): Double {
        val s = calculatePerimeter() / 2
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3))
    }
}
