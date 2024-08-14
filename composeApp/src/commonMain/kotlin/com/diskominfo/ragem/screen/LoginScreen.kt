package com.diskominfo.ragem.screen

import androidragem.composeapp.generated.resources.Res
import androidragem.composeapp.generated.resources.logo_ragem
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.diskominfo.ragem.Screen
import com.diskominfo.ragem.components.BelumPunyaAkun
import com.diskominfo.ragem.components.CButton
import com.diskominfo.ragem.components.CTextField
import com.diskominfo.ragem.components.LupaPassword
import com.diskominfo.ragem.components.PasswordTextFieldExample
import org.jetbrains.compose.resources.painterResource

@Composable
fun LoginScreen(
    onNavigate: (Screen) -> Unit
) {

    Surface(
        color = Color(0xFFFFFFFF)
    ){

        Box(modifier = Modifier.fillMaxSize()){
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 20.dp)
            ){

////          Logo
                Image(painter = painterResource(Res.drawable.logo_ragem), contentDescription = null,
                    modifier = Modifier
                        .padding(top = 54.dp)
                        .size(150.dp)
                        .align(Alignment.Start)
                )

                Text(text = "Selamat datang di Ragem",
                    style = TextStyle(
                        fontSize = 28.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight(500),
                        color = Color.Gray
                    ),

                    modifier = Modifier
                        .padding(bottom = 24.dp)
                        .align(Alignment.Start)
                )

//                Text Field
                CTextField(hint = "cth. bambang@gmail.com", value = "")

                PasswordTextFieldExample(hint = "Masukkan Password")

                LupaPassword(onSignupTap = {
                    onNavigate(Screen.LupaPassword)
                })

                CButton(text = "Masuk")

                BelumPunyaAkun(onSignUpTap = {
                    onNavigate(Screen.SignUp)
                })

            }

        }


    }
}