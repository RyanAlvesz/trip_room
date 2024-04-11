package br.senai.sp.jandira.triproom.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.triproom.R
import br.senai.sp.jandira.triproom.ui.theme.TripRoomTheme

@Composable
fun Home(navigationController: NavHostController) {

    var searchState = remember {
        mutableStateOf("")
    }

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
                            contentDescription = "Foto de Perfil",
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
                            contentDescription = "To aqui",
                            tint = Color(0xFFFFFFFF),
                            modifier = Modifier
                                .size(18.dp)
                        )
                        Text(
                            text = "You're in Paris",
                            color = Color(0xFFFFFFFF)
                        )
                    }
                    Text(
                        text = "My Trips",
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
                text = "Categories",
                modifier = Modifier
                    .padding(bottom = 12.dp),
                color = Color(0xff565454)
            )

            LazyRow() {
                items(6) {
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
                                    painter = painterResource(id = R.drawable.mountain),
                                    contentDescription = "Montanha",
                                    contentScale = ContentScale.Fit
                                )
                            }
                            Text(
                                text = "Mountain",
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
                        contentDescription = "Pesquisar",
                        tint = Color(0xffB7B7B7)
                    )
                }
            },
            placeholder = {
                Text(text = "Search your destiny")
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
                text = "Past Trips",
                modifier = Modifier
                    .padding(bottom = 12.dp),
                color = Color(0xff565454)
            )

            LazyColumn() {
                items(6) {
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
                                .padding(top = 6.dp, start = 6.dp, end = 6.dp, bottom = 10.dp)
                                .fillMaxSize(),
                            verticalArrangement = Arrangement.SpaceBetween
                        ) {
                            Card (
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(120.dp),
                                shape = RoundedCornerShape(8.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.london),
                                    contentDescription = "Londres",
                                    contentScale = ContentScale.Crop
                                )
                            }
                            Text(
                                text = "London, 2019",
                                fontSize = 14.sp,
                                color = Color(0xffcf06f0)
                            )
                            Text(
                                text = "London is the capital and largest city of  the United Kingdom, with a population of just under 9 million.",
                                fontSize = 10.sp,
                                lineHeight = 12.sp,
                                color = Color(0xffb7b7b7)
                            )
                            Text(
                                text = "18 Feb - 21 Feb",
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

//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun HomePreview() {
//    TripRoomTheme {
//        Home(controlNavigation)
//    }
//}