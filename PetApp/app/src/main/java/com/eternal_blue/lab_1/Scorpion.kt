package com.eternal_blue.lab_1

class Scorpion(name:String, age:Int): Pet(name, age) {
    override fun speak(): String {
        return "Hiss"
    }
}