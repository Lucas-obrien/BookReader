package com.example.bookreader.data

import com.example.bookreader.R
import com.example.bookreader.model.Book

object DataSource {
    val books = listOf(
        Book(R.string.Cricket, R.string.reviews, R.drawable.book1),
        Book(R.string.Soccer, R.string.app_name, R.drawable.book1)
    )
}
