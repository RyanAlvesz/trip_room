package br.senai.sp.jandira.triproom.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddAPhoto
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Smartphone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.triproom.ui.theme.TripRoomTheme

@Composable
fun SignUp(navigationController: NavHostController) {

    var nameState = remember {
        mutableStateOf("")
    }

    var telephoneState = remember {
        mutableStateOf("")
    }

    var emailState = remember {
        mutableStateOf("")
    }

    var passwordState = remember {
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
                    value = nameState.value,
                    onValueChange = {
                        nameState.value = it
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
                    value = telephoneState.value,
                    onValueChange = {
                        telephoneState.value = it
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
                    value = passwordState.value,
                    onValueChange = {
                        passwordState.value = it
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
                        text = "Over 18?"
                    )
                }

                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp),
                    colors = ButtonDefaults
                        .buttonColors(Color(0xFFCF05F0)),
                    onClick = {
                          navigationController.navigate("home")
                    },
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
                        text = "Login",
                        modifier = Modifier
                            .padding(horizontal = 4.dp)
                            .clickable { navigationController.navigate("login") },
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


//@Preview(showSystemUi = true, showBackground = true)
//@Composable
//fun SignUpPreview() {
//    TripRoomTheme {
//        SignUp(controlNavigation)
//    }
//}