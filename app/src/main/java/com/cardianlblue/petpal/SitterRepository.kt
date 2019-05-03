package com.cardianlblue.petpal

class SitterRepository() {

    private val sitters = listOf(
        Sitter("Eric", 3.8F, "3.8", 240),
        Sitter("Allen", 3.8F, "4.8", 230),
        Sitter("Mary", 3.8F, "1.8", 220),
        Sitter("White",3.8F, "3.8", 210),
        Sitter("Momo", 3.8F, "2.8", 140)
    )

    fun getSitters(): List<Sitter> {
        return sitters
    }
}