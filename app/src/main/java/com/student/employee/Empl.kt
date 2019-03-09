package com.student.employee

class Empl(val id: String, val name: String = " ", val city: String = " ") {

    val allData: String
        get() = "ID: $id\nName: $name\nCity: $city"



}