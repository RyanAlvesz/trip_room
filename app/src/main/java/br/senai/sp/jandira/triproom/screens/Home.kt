package br.senai.sp.jandira.triproom.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.triproom.R
import br.senai.sp.jandira.triproom.repository.CategoryRepository
import br.senai.sp.jandira.triproom.repository.TravelRepository
import br.senai.sp.jandira.triproom.ui.theme.TripRoomTheme
import br.senai.sp.jandira.triproom.utilities.ConvertDates

@Composable
fun Home(navigationController: NavHostController) {

    var searchState = remember {
        mutableStateOf("")
    }

    val travels = TravelRepository().listAllTravels()
    val categories = CategoryRepository().listAllCategories()

    Scaffold (

        floatingActionButton = {
            FloatingActionButton(
                onClick = { /*TODO*/ },
                containerColor = Color(0xffcf06f0),
                contentColor = Color.White,
                shape = CircleShape,
                modifier = Modifier
                    .border(2.dp, Color.White, CircleShape)
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = stringResource(id = R.string.add_button)
                )
            }
        },

        content = {

            Surface(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
            ){

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color(0xfff6f6f6)),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Surface (
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp),
                        shape = RoundedCornerShape(0)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.paris),
                            contentDescription = "Paris",
                            contentScale = ContentScale.Crop,
                        )
                        Column (
                            verticalArrangement = Arrangement.SpaceBetween,
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(top = 12.dp, start = 20.dp, end = 20.dp, bottom = 4.dp)
                        ) {
                            Column (
                                modifier = Modifier
                                    .align(alignment = Alignment.End),
                                horizontalAlignment = Alignment.End
                            ) {
                                Card (
                                    modifier = Modifier
                                        .size(70.dp),
                                    shape = CircleShape,
                                    border = BorderStroke(2.dp, Color.White)
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.profile),
                                        contentDescription = stringResource(id = R.string.profile_picture_description),
                                        contentScale = ContentScale.Crop
                                    )
                                }
                                Text(
                                    text = "Taylor Swift",
                                    color = Color(0xFFFFFFFF),
                                    fontSize = 14.sp,
                                    modifier = Modifier
                                        .padding(top = 2.dp),
                                    style = TextStyle(
                                        shadow = Shadow(Color(0xFF000000), Offset(0f, 3f), 5f)
                                    )
                                )
                            }
                            Column {
                                Row (
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.LocationOn,
                                        contentDescription = stringResource(id = R.string.location_icon),
                                        tint = Color(0xFFFFFFFF),
                                        modifier = Modifier
                                            .size(18.dp)
                                    )
                                    Text(
                                        text = stringResource(id = R.string.you_are_in),
                                        color = Color(0xFFFFFFFF)
                                    )
                                    Text(
                                        text = "Paris",
                                        color = Color(0xFFFFFFFF),
                                        modifier = Modifier
                                            .padding(start = 4.dp)
                                    )
                                }
                                Text(
                                    text = stringResource(id = R.string.my_trips),
                                    color = Color(0xFFFFFFFF),
                                    fontSize = 24.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .offset(y = -6.dp)
                                )
                            }
                        }
                    }

                    Spacer(
                        modifier = Modifier
                            .height(12.dp)
                    )

                    Column (
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 20.dp)
                    ) {

                        Text(
                            text = stringResource(id = R.string.categories),
                            modifier = Modifier
                                .padding(bottom = 12.dp),
                            color = Color(0xff565454)
                        )

                        LazyRow() {
                            items(categories) {
                                Card (
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color(0xffcf06f0),
                                        disabledContainerColor = Color(0x80cf06f0)
                                    ),
                                    modifier = Modifier
                                        .height(70.dp)
                                        .width(120.dp)
                                        .padding(end = 6.dp),
                                    shape = RoundedCornerShape(8.dp),
                                    elevation = CardDefaults.cardElevation(
                                        defaultElevation = 2.dp
                                    )
                                ) {
                                    Column (
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        verticalArrangement = Arrangement.Center,
                                        modifier = Modifier
                                            .fillMaxSize()
                                    ) {
                                        Card (
                                            modifier = Modifier
                                                .size(24.dp),
                                            shape = RoundedCornerShape(0),
                                            colors = CardDefaults.cardColors(
                                                containerColor = Color.Transparent
                                            )
                                        ) {
                                            Image(
                                                painter = if (it.image == null) painterResource(id = R.drawable.noimg) else it.image!!,
                                                contentDescription = it.nome,
                                                contentScale = ContentScale.Fit
                                            )
                                        }
                                        Text(
                                            text = it.nome,
                                            modifier = Modifier
                                                .padding(top = 2.dp),
                                            color = Color.White
                                        )
                                    }
                                }
                            }
                        }

                    }

                    Spacer(
                        modifier = Modifier
                            .height(24.dp)
                    )

                    OutlinedTextField(
                        value = searchState.value,
                        onValueChange = {
                            searchState.value = it
                        },
                        colors = OutlinedTextFieldDefaults.colors(
                            unfocusedBorderColor = Color.Transparent,
                            focusedBorderColor = Color.Transparent,
                            unfocusedPlaceholderColor = Color(0xffb7b7b7),
                            focusedPlaceholderColor = Color(0xffcf06f0),
                            unfocusedContainerColor = Color.White,
                            focusedContainerColor = Color.White,
                            focusedTextColor = Color(0xffcf06f0)
                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 20.dp),
                        trailingIcon = {
                            IconButton(onClick = {}) {
                                Icon(
                                    imageVector = Icons.Default.Search,
                                    contentDescription = stringResource(id = R.string.search_icon),
                                    tint = Color(0xffB7B7B7)
                                )
                            }
                        },
                        placeholder = {
                            Text(text = stringResource(id = R.string.search_destiny))
                        },
                        shape = RoundedCornerShape(12.dp)
                    )

                    Spacer(
                        modifier = Modifier
                            .height(24.dp)
                    )

                    Column (
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 20.dp)
                    ) {

                        Text(
                            text = stringResource(id = R.string.past_trips),
                            modifier = Modifier
                                .padding(bottom = 12.dp),
                            color = Color(0xff565454)
                        )

                        LazyColumn() {

                            items(travels) {
                                Card (
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.White,
                                        disabledContainerColor = Color.White
                                    ),
                                    modifier = Modifier
                                        .height(230.dp)
                                        .fillMaxWidth()
                                        .padding(bottom = 6.dp),
                                    shape = RoundedCornerShape(8.dp),
                                    elevation = CardDefaults.cardElevation(
                                        defaultElevation = 4.dp
                                    )
                                ) {
                                    Column (
                                        modifier = Modifier
                                            .padding(
                                                top = 6.dp,
                                                start = 6.dp,
                                                end = 6.dp,
                                                bottom = 10.dp
                                            )
                                            .fillMaxSize(),
                                        verticalArrangement = Arrangement.SpaceBetween
                                    ) {
                                        Card (
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .height(120.dp),
                                            shape = RoundedCornerShape(8.dp)
                                        ) {
                                            Surface (
                                                modifier = Modifier
                                                    .fillMaxSize()
                                            ) {
                                                Image(
                                                    painter = if (it.image == null) painterResource(id = R.drawable.noimg) else it.image!!,
                                                    contentDescription = it.destination,
                                                    contentScale = ContentScale.Crop
                                                )
                                            }
                                        }
                                        Text(
                                            text = "${it.destination}, ${it.dateArrival.year}",
                                            fontSize = 14.sp,
                                            color = Color(0xffcf06f0)
                                        )
                                        Text(
                                            text = it.description,
                                            fontSize = 10.sp,
                                            lineHeight = 12.sp,
                                            color = Color(0xffb7b7b7)
                                        )
                                        Text(
                                            text = ConvertDates().dateShortener(
                                                dateArrival = it.dateArrival,
                                                dataLeaving = it.dateLeaving
                                            ),
                                            fontSize = 12.sp,
                                            color = Color(0xffcf06f0),
                                            modifier = Modifier
                                                .align(Alignment.End)
                                        )
                                    }
                                }
                            }
                        }

                    }

                }

            }
            
        }

    )

}

//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun HomePreview() {
//    TripRoomTheme {
//        Home(controlNavigation)
//    }
//}