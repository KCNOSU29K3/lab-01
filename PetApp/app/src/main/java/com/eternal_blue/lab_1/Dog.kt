package com.eternal_blue.lab_1

class Dog(name:String, age:Int): Pet(name, age), Pettable {
    override fun speak(): String {
        return "Woof"
    }

    override fun pet() {
        println("The Dog $name is being pet.")
    }
}