package com.mahmoud.tajaarandroid.presentation.util

import com.mahmoud.tajaarandroid.presentation.home.components.CategoryData


//TODO() this is a dummy data, this will be fetched from a web server.
val categories = listOf(
    CategoryData(
        type = "Resort",
        location = "Tajura, Tripoli",
        address = "Old school, street 7 april",
        price = 2455.33
    ),
    CategoryData(
        type = "Resort",
        location = "Alkwateb1 resort bir alalim.",
        address = "Old school, street 7 april",
        price = 2455.33
    ),
    CategoryData(
        type = "Resort",
        location = "Alkwateb2 resort bir alalim.",
        address = "Old school, street 7 april",
        price = 2455.33
    ),
    CategoryData(
        type = "Resort",
        location = "Alkwateb3 resort bir alalim.",
        address = "Old school, street 7 april",
        price = 2455.33
    ),
    CategoryData(
        type = "Resort",
        location = "Alkwateb4 resort bir alalim.",
        address = "Old school, street 7 april",
        price = 2455.33
    ),
    CategoryData(
        type = "Resort",
        location = "Tajura, Tripoli",
        address = "Old school, street 7 april",
        price = 2455.33
    ),
    CategoryData(
        type = "Resort",
        location = "Tajura, Tripoli",
        address = "Old school, street 7 april",
        price = 2455.33
    )
)

val chunkedCategories = categories.chunked(2)