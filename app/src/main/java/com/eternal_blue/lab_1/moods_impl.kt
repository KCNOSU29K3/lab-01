package com.eternal_blue.lab_1

class Happy(date:String): Mood(date) {
    override fun current_mood(): String {
        return "Happy!"
    }
}

class Sad(date: String): Mood(date) {
    override fun current_mood(): String {
        return "Sad :<"
    }
}