package com.example.myapplication.CS101.Aflevering2

class Employee  (
    var firstName: String,
    var lastName: String
) {
    var salary: Double = 0.00 //startværdi på 0
        set(value) {
            field = if (value < 0) 0.00
            else value
        } //hvis man forsøger at ændre salary til under 0, bliver den istedet 0.00

}

