package com.yetsdmr.kotlinsimplepasswordgenerator

class PasswordGenerator {
    private val characters = "abcdefghijklmnopqrstuvwxyzABCDEFGIJKLMNOPQRSTUVWXYZ0123456789!#€%&/()=?"

    fun generatePassword(length : Int, specialWord : String = "") : String {
        val stringBuilder = StringBuilder(length)

        for (x in 0 until length) {
            val random = (characters.indices).random()
            stringBuilder.append(characters[random])
        }
        stringBuilder.insert((0 until length).random(), specialWord)
        return stringBuilder.toString()
    }
}