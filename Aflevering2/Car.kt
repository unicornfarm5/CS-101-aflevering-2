package com.example.myapplication.CS101.Aflevering2

import android.health.connect.datatypes.ExercisePerformanceGoal.SpeedGoal

open class Car(
    val speed: Int,
    var regularPrice: Double,
    val color: String
) {
    open fun getSalePrice(): Double {
        return 0.00
    }
}

class Truck(
    Speed: Int,
    regularPrice: Double,
    color: String,
    var weight: Int = 0
): Car(Speed, regularPrice, color) {

    //laver en variabel salePrice med en setter
    //variables skal bruges til return i getSalePrice
    var salePrice: Double = regularPrice
        set(value) {
            field = if(weight> 2000) {
                value*0.9 //10% rabatos
        } else {
            value*0.8 //20% rabatos
            }
    }

    override fun getSalePrice(): Double {
        return salePrice //ny-udregnet rabat pris udfra vægt
    }


class Ford(
    Speed: Int,
    regularPrice: Double,
    color: String,
    var year: Int = 0, //startværdi der ændres når der oprettes en ford
    val manufacturerDiscount: Double?= null // kan være tom og starter med at være tom
): Car(Speed, regularPrice, color) {

    var salePrice: Double = regularPrice

    override fun getSalePrice(): Double {
        //ide fra chatGPT: / Hvis manufacturerDiscount er sat (ikke null), så anvend rabatten
        return if (manufacturerDiscount != null) {
            regularPrice-manufacturerDiscount //returnerer normalpris - rabat
        } else {
            regularPrice //er der ingen rabat er prisen blot normal-pris
        }
    }

}}