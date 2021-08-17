package com.example.searchbymoviesmvvm.model.entities

data class Movie(val nameMovie: String, val descriptionMovie: String,
                 val durationMovie: Int, val rating: Double, val releaseYear: Int )

val movie = mutableListOf<Movie>(
    Movie("бетмен", "фильм про мышь", 2, 7.4, 2004),
    Movie("бетмен", "фильм про мышь",  2,7.4, 2004)
)

