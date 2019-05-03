package com.cardianlblue.petpal

class SitterRepository() {

    private val sitters = listOf(
        Sitter("Eric", 3.8F, 3.8F, 240),
        Sitter("Allen", 3.8F, 4.8F, 230),
        Sitter("Mary", 3.8F, 0.8F, 220),
        Sitter("White",3.8F, 3.8F, 210),
        Sitter("Momo", 3.8F, 2.8F, 140)
    )

    fun getSitters(): List<Sitter> {
        return sitters
    }
}