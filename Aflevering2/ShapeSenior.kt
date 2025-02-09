package com.example.myapplication.CS101.Aflevering2

// Abstract parent class Shape
abstract class Shape(
    val color: String,
    val isTransparent: Boolean
) {
    // Abstract methods to be implemented by subclasses
    abstract fun calculatePerimeter(): Double
    abstract fun calculateArea(): Double
}

// Circle class inheriting from Shape
class Circle(
    color: String,
    isTransparent: Boolean,
    private val radius: Double
) : Shape(color, isTransparent) {

    // Override calculatePerimeter for Circle
    override fun calculatePerimeter(): Double {
        return 2 * Math.PI * radius
    }

    // Override calculateArea for Circle
    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }
}

// Triangle class inheriting from Shape
class Triangle(
    color: String,
    isTransparent: Boolean,
    private val sideA: Double,
    private val sideB: Double,
    private val sideC: Double
) : Shape(color, isTransparent) {

    // Override calculatePerimeter for Triangle
    override fun calculatePerimeter(): Double {
        return sideA + sideB + sideC
    }

    // Override calculateArea for Triangle using Heron's formula
    override fun calculateArea(): Double {
        val s = (sideA + sideB + sideC) / 2
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC))
    }
}
