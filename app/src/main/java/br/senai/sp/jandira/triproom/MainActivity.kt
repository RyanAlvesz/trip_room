package br.senai.sp.jandira.triproom

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddAPhoto
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Smartphone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.triproom.ui.theme.TripRoomTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TripRoomTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Home()
                }
            }
        }
    }
}

@Composable
fun Login() {

    var emailState = remember {
        mutableStateOf("")
    }

    var senhaState = remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            Card(
                modifier = Modifier
                    .height(40.dp)
                    .width(120.dp),
                shape = RoundedCornerShape(
                    topStart = 0.dp,
                    topEnd = 0.dp,
                    bottomEnd = 0.dp,
                    bottomStart = 12.dp
                ),
                colors = CardDefaults.cardColors(
                    Color(0xffcf06f0)
                )
            ) {}
        }
        Column(
            modifier = Modifier
                .height(600.dp),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            ) {
                Text(
                    text = "Login",
                    fontSize = 52.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color(0xffcf06f0)
                )
                Text(
                    text = "Please sign in to continue",
                    color = Color(0xffa09c9c),
                    fontSize = 18.sp
                )
            }
            Column(
                modifier = Modifier
                    .height(300.dp)
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp),
                horizontalAlignment = Alignment.End,
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                OutlinedTextField(
                    value = emailState.value,
                    onValueChange = {
                        emailState.value = it
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Email,
                            contentDescription = "Email",
                            tint = Color(0xffcf06f0),
                            modifier = Modifier
                                .size(30.dp)
                        )
                    },
                    label = {
                        Text(text = "E-mail")
                    },
                    modifier = Modifier
                        .fillMaxWidth(),
                    colors = OutlinedTextFieldDefaults
                        .colors(
                            focusedBorderColor = Color(0xFFCF06F0),
                            unfocusedBorderColor = Color(0xFFcf06f0),
                            focusedLabelColor = MaterialTheme.colorScheme.secondary,
                        ),
                    shape = RoundedCornerShape(18.dp)
                )
                OutlinedTextField(
                    value = senhaState.value,
                    onValueChange = {
                        senhaState.value = it
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Lock,
                            contentDescription = "Cadeado",
                            tint = Color(0xffcf06f0),
                            modifier = Modifier
                                .size(30.dp)
                        )
                    },
                    label = {
                        Text(text = "Password")
                    },
                    modifier = Modifier
                        .fillMaxWidth(),
                    colors = OutlinedTextFieldDefaults
                        .colors(
                            focusedBorderColor = Color(0xFFCF06F0),
                            unfocusedBorderColor = Color(0xFFcf06f0),
                            focusedLabelColor = MaterialTheme.colorScheme.secondary,
                        ),
                    shape = RoundedCornerShape(18.dp)
                )
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(
                        Color(0xffcf06f0)
                    ),
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier
                        .size(width = 140.dp, height = 50.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "SIGN IN",
                            modifier = Modifier
                                .padding(end = 8.dp),
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp
                        )
                        Icon(
                            imageVector = Icons.Filled.ArrowForward,
                            contentDescription = "Seta para frente",
                            tint = MaterialTheme.colorScheme.background
                        )
                    }
                }
                Row {
                    Text(
                        text = "Don't have an account?",
                        color = Color(0xffa09c9c),
                        fontSize = 14.sp
                    )
                    Text(
                        text = "Sign up",
                        modifier = Modifier
                            .padding(horizontal = 4.dp),
                        color = Color(0xffcf07f0),
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 14.sp
                    )
                }
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Start
        ) {
            Card(
                modifier = Modifier
                    .height(40.dp)
                    .width(120.dp),
                shape = RoundedCornerShape(
                    topStart = 0.dp,
                    topEnd = 12.dp,
                    bottomEnd = 0.dp,
                    bottomStart = 0.dp
                ),
                colors = CardDefaults.cardColors(
                    Color(0xffcf06f0)
                )
            ) {}
        }
    }

}

@Composable
fun SignUp() {

    var nomeState = remember {
        mutableStateOf("")
    }

    var telefoneState = remember {
        mutableStateOf("")
    }

    var emailState = remember {
        mutableStateOf("")
    }

    var senhaState = remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            Card(
                modifier = Modifier
                    .height(40.dp)
                    .width(120.dp),
                shape = RoundedCornerShape(
                    topStart = 0.dp,
                    topEnd = 0.dp,
                    bottomEnd = 0.dp,
                    bottomStart = 12.dp
                ),
                colors = CardDefaults.cardColors(
                    Color(0xffcf06f0)
                )
            ) {}
        }
        Column(
            modifier = Modifier
                .padding(horizontal = 12.dp, vertical = 24.dp),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(bottom = 24.dp)
            ) {
                Text(
                    text = "Sign Up",
                    fontSize = 38.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color(0xffcf06f0)
                )
                Text(
                    text = "Create a new account",
                    color = Color(0xffa09c9c),
                    fontSize = 18.sp,
                    modifier = Modifier
                        .padding(bottom = 12.dp)
                )
                Box(
                    modifier = Modifier
                        .size(100.dp)
                        .background(Color.Transparent),
                ) {
                    Card(
                        border = BorderStroke(
                            2.dp, Brush.horizontalGradient(
                                listOf(
                                    Color(0xffcf06f0), Color(
                                        0x1ACF06F0
                                    )
                                )
                            )
                        ),
                        shape = RoundedCornerShape(100.dp),
                        colors = CardDefaults.cardColors(
                            Color(0xFFF6F6F6)
                        ),
                        modifier = Modifier
                            .align(Alignment.Center)
                            .fillMaxSize(),
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .fillMaxSize()
                        ) {
                            Icon(
                                imageVector = Icons.Default.Person,
                                contentDescription = "Pessoa",
                                tint = Color(0xffcf06f0),
                                modifier = Modifier
                                    .size(85.dp)
                            )
                        }
                    }
                    Card(
                        colors = CardDefaults.cardColors(
                            Color.Transparent
                        ),
                        modifier = Modifier
                            .align(Alignment.BottomEnd),
                        shape = RoundedCornerShape(0.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.AddAPhoto,
                            contentDescription = "Camera",
                            tint = Color(0xffCB26A7)
                        )
                    }
                }
            }
            Column(
                modifier = Modifier
                    .height(480.dp),
                verticalArrangement = Arrangement.SpaceAround,
            ) {

                OutlinedTextField(
                    value = nomeState.value,
                    onValueChange = {
                        nomeState.value = it
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = "Pessoa",
                            tint = Color(0xffcf06f0),
                            modifier = Modifier
                                .size(30.dp)
                        )
                    },
                    label = {
                        Text(text = "Username")
                    },
                    modifier = Modifier
                        .fillMaxWidth(),
                    colors = OutlinedTextFieldDefaults
                        .colors(
                            focusedBorderColor = Color(0xFFCF06F0),
                            unfocusedBorderColor = Color(0xFFcf06f0),
                            focusedLabelColor = MaterialTheme.colorScheme.secondary,
                        ),
                    shape = RoundedCornerShape(18.dp)
                )

                OutlinedTextField(
                    value = telefoneState.value,
                    onValueChange = {
                        telefoneState.value = it
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Filled.Smartphone,
                            contentDescription = "Phone",
                            tint = Color(0xffcf06f0),
                            modifier = Modifier
                                .size(30.dp)
                        )
                    },
                    label = {
                        Text(text = "Phone")
                    },
                    modifier = Modifier
                        .fillMaxWidth(),
                    colors = OutlinedTextFieldDefaults
                        .colors(
                            focusedBorderColor = Color(0xFFCF06F0),
                            unfocusedBorderColor = Color(0xFFcf06f0),
                            focusedLabelColor = MaterialTheme.colorScheme.secondary,
                        ),
                    shape = RoundedCornerShape(18.dp)
                )

                OutlinedTextField(
                    value = emailState.value,
                    onValueChange = {
                        emailState.value = it
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Email,
                            contentDescription = "Email",
                            tint = Color(0xffcf06f0),
                            modifier = Modifier
                                .size(30.dp)
                        )
                    },
                    label = {
                        Text(text = "E-mail")
                    },
                    modifier = Modifier
                        .fillMaxWidth(),
                    colors = OutlinedTextFieldDefaults
                        .colors(
                            focusedBorderColor = Color(0xFFCF06F0),
                            unfocusedBorderColor = Color(0xFFcf06f0),
                            focusedLabelColor = MaterialTheme.colorScheme.secondary,
                        ),
                    shape = RoundedCornerShape(18.dp)
                )

                OutlinedTextField(
                    value = senhaState.value,
                    onValueChange = {
                        senhaState.value = it
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Lock,
                            contentDescription = "Cadeado",
                            tint = Color(0xffcf06f0),
                            modifier = Modifier
                                .size(30.dp)
                        )
                    },
                    label = {
                        Text(text = "Password")
                    },
                    modifier = Modifier
                        .fillMaxWidth(),
                    colors = OutlinedTextFieldDefaults
                        .colors(
                            focusedBorderColor = Color(0xFFCF06F0),
                            unfocusedBorderColor = Color(0xFFcf06f0),
                            focusedLabelColor = MaterialTheme.colorScheme.secondary,
                        ),
                    shape = RoundedCornerShape(18.dp)
                )

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Checkbox(
                        checked = false,
                        onCheckedChange = {},
                        colors = CheckboxDefaults
                            .colors(
                                checkedColor = Color(0xffCF05F0),
                                uncheckedColor = Color(0xffCF05F0),
                            ),
                    )
                    Text(
                        text = "Over 18?",

                        )
                }

                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp),
                    colors = ButtonDefaults
                        .buttonColors(Color(0xFFCF05F0)),
                    onClick = {},
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Text(
                        text = "CREATE ACCOUNT",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.End,
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "Already have an account?",
                        color = Color(0xffa09c9c),
                        fontSize = 14.sp
                    )
                    Text(
                        text = "Sign in",
                        modifier = Modifier
                            .padding(horizontal = 4.dp),
                        color = Color(0xffcf07f0),
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 14.sp
                    )
                }

            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Start
        ) {
            Card(
                modifier = Modifier
                    .height(40.dp)
                    .width(120.dp),
                shape = RoundedCornerShape(
                    topStart = 0.dp,
                    topEnd = 12.dp,
                    bottomEnd = 0.dp,
                    bottomStart = 0.dp
                ),
                colors = CardDefaults.cardColors(
                    Color(0xffcf06f0)
                )
            ) {}
        }
    }
}

@Composable
fun Home() {

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
                            .height(220.dp)
                            .fillMaxWidth()
                            .padding(bottom = 6.dp),
                        shape = RoundedCornerShape(8.dp),
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = 4.dp
                        )
                    ) {
                        Column (
                            modifier = Modifier
                                .padding(6.dp)
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
//fun LoginPreview() {
//    TripRoomTheme {
//        Login()
//    }
//}

//@Preview(showSystemUi = true, showBackground = true)
//@Composable
//fun SignUpPreview() {
//    TripRoomTheme {
//        SignUp()
//    }
//}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomePreview() {
    TripRoomTheme {
        Home()
    }
}