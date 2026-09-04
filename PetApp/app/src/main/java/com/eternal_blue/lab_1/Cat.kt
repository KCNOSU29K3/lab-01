package com.eternal_blue.lab_1

class Cat(name:String, age:Int): Pet(name, age), Pettable {
    override fun speak(): String {
        return "Meow"
    }

    override fun pet() {
        println("The Dog $name is being pet.")
    }
}