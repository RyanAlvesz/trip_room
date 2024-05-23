package br.senai.sp.jandira.triproom.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.triproom.R

@Composable
fun Login(navigationController: NavHostController) {

    var emailState = remember {
        mutableStateOf("")
    }

    var passwordState = remember {
        mutableStateOf("")
    }

    var signupState = remember {
        mutableStateOf("")
    }

    var msgErroState = remember {
        mutableStateOf("")
    }

    var errorMessage = stringResource(id = R.string.error_login_message)

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
                    text = stringResource(id = R.string.login),
                    fontSize = 52.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color(0xffcf06f0)
                )
                Text(
                    text = stringResource(id = R.string.login_message),
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
                            contentDescription = stringResource(id = R.string.email_message),
                            tint = Color(0xffcf06f0),
                            modifier = Modifier
                                .size(30.dp)
                        )
                    },
                    label = {
                        Text(text = stringResource(id = R.string.email_message))
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
                            contentDescription = stringResource(id = R.string.locker_icon),
                            tint = Color(0xffcf06f0),
                            modifier = Modifier
                                .size(30.dp)
                        )
                    },
                    label = {
                        Text(text = stringResource(id = R.string.password_message))
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

                Row (
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Text(
                        text = msgErroState.value,
                        color = Color(0xffcf06f0),
                        fontWeight = FontWeight.Medium
                    )
                }

                Button(
                    onClick = {
                          if (emailState.value == "ryan@gmail.com" && passwordState.value == "1234") {
                              msgErroState.value = ""
                              navigationController.navigate("home")
                          } else {
                              msgErroState.value = errorMessage
                          }
                    },
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
                            text = stringResource(id = R.string.sign_in).uppercase(),
                            modifier = Modifier
                                .padding(end = 8.dp),
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp
                        )
                        Icon(
                            imageVector = Icons.Filled.ArrowForward,
                            contentDescription = stringResource(id = R.string.forward_arrow_icon),
                            tint = MaterialTheme.colorScheme.background
                        )
                    }
                }
                Row {
                    Text(
                        text = stringResource(id = R.string.account_message),
                        color = Color(0xffa09c9c),
                        fontSize = 14.sp
                    )
                    Text(
                        text = stringResource(id = R.string.sign_up),
                        modifier = Modifier
                            .padding(horizontal = 4.dp)
                            .clickable { navigationController.navigate("signup") },
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

//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun LoginPreview() {
//    TripRoomTheme {
//        Login(controlNavigation)
//    }
//}