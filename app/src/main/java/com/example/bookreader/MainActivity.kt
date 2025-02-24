package com.example.bookreader

import android.adservices.topics.Topic
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bookreader.model.Book
import com.example.bookreader.ui.theme.BookReaderTheme
import com.example.bookreader.data.DataSource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BookReaderTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .statusBarsPadding(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppGrid(
                        modifier = Modifier.padding(
                            start = dimensionResource(R.dimen.padding_small),
                            top = dimensionResource(R.dimen.padding_small),
                            end = dimensionResource(R.dimen.padding_small),
                        )
                    )
                }
                }
            }
        }
    }


//@Composable
//fun AppGrid(modifier: Modifier = Modifier) {
//    LazyVerticalGrid(
//        columns = GridCells.Fixed(2),
//        verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_small)),
//        horizontalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_small)),
//        modifier = modifier
//    ) {
//        items(DataSource.book) { book ->
//            AppCard(book)
//        }
//    }
//}




@Composable
fun AppCard(book: Book, modifier: Modifier = Modifier){
    Card {
        Row {
            Box {
                Image(
                    painter = painterResource(id = book.imageRes),
                    contentDescription = null,
                    modifier = modifier
                        .size(width = 68.dp, height = 68.dp)
                        .aspectRatio(1f),
                    contentScale = ContentScale.Crop
                )
            }
            Column {
                Text(
                    text = stringResource(id = book.name),
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(
                        start = dimensionResource(R.dimen.padding_medium),
                        top = dimensionResource(R.dimen.padding_medium),
                        end = dimensionResource(R.dimen.padding_medium),
                        bottom = dimensionResource(R.dimen.padding_small)

                    )
                )
                Row(verticalAlignment = Alignment.CenterVertically) {

                    Text(
                        text = "Hello",
                        style = MaterialTheme.typography.labelMedium,
                        modifier = Modifier.padding(start = dimensionResource(R.dimen.padding_small))
                    )


                }
            }
        }


    }
}

@Composable
fun BookReview(name: String, modifier: Modifier = Modifier) {
    Card {
        Row {
            Box {
//                Image(
//                    painter = painterResource(),
//                    contentDescription = null,
//                    modifier = modifier
//                        .size(width = 68.dp, height = 68.dp)
//                        .aspectRatio(1f),
//                    contentScale = ContentScale.Crop
//                )
            }
            Column {
                Text(
                    text = "Book Review",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(
                        start = dimensionResource(R.dimen.padding_medium),
                        top = dimensionResource(R.dimen.padding_medium),
                        end = dimensionResource(R.dimen.padding_medium),
                        bottom = dimensionResource(R.dimen.padding_small)

                    )
                )
                Row(verticalAlignment = Alignment.CenterVertically) {

                    Text(
                        text = "Hello",
                        style = MaterialTheme.typography.labelMedium,
                        modifier = Modifier.padding(start = dimensionResource(R.dimen.padding_small))
                    )


                }
            }
        }


    }

}
@Composable
fun AppGrid(modifier: Modifier = Modifier) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_small)),
        horizontalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_small)),
        modifier = modifier
    ) {
        items(DataSource.books){book ->
            AppCard(book)

        }
    }
}


//@Preview(showBackground = true)
//@Composable
//fun BookLandingPreview() {
//    BookReaderTheme {
//        BookReview("Android")
//    }
//}

@Preview(showBackground = true)
@Composable
fun TopicPreview() {
    BookReaderTheme {
        val book = Book(R.string.newBook, R.string.reviews, R.drawable.book1)
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AppCard(book = book)
        }
    }
}




//@Composable
//fun AppGrid(modifier: Modifier = Modifier) {
//    LazyVerticalGrid(
//        columns = GridCells.Fixed(2),
//        verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_small)),
//        horizontalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_small)),
//        modifier = modifier
//    ) { }
//}