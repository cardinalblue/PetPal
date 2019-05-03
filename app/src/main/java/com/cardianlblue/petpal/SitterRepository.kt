package com.cardianlblue.petpal

class SitterRepository() {

    private val sitters = listOf(
        Sitter("Tom Smith", R.drawable.sitter_1, 2.5F, "$8/hr", 3.8F, 240,"Upper East Side, New York", "They call me the \"Dog Father\", I speak fluent dog language!", "“Sparky loved hanging out with Tom!” They had an amazing day at Central Park chasing squirrels.”"),
        Sitter("Kate Conner", R.drawable.sitter_2, 3.3F, "$8/hr",3.1F, 130, "Upper West Side, New York ", "I can teach your dog many tricks, such as hand shake and play dead!"),
        Sitter("Sarah Brown", R.drawable.sitter_3, 1.3F, "$8/hr",4.6F, 136, "Union Square, New York", "I was born to take care of dogs! They are my best friends :)"),
        Sitter("Lauren Bush",R.drawable.sitter_4, 4.3F, "$8/hr",2.1F, 240, "Brooklyn, New York", "Puppies love me"),
        Sitter("Bobby Lark", R.drawable.sitter_1, 2.5F, "$8/hr",3.8F, 54, "Union Square, New York", "I will make sure your dog is well fed!")
    )

    fun getSitters(): List<Sitter> {
        return sitters
    }
}