package com.diskominfo.ragem.screen

import androidragem.composeapp.generated.resources.Res
import androidragem.composeapp.generated.resources.logo_ragem
import androidragem.composeapp.generated.resources.logo_serang
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
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
import com.diskominfo.ragem.components.CButton
import com.diskominfo.ragem.components.CTextField
import com.diskominfo.ragem.components.SudahPunyaAkun
import org.jetbrains.compose.resources.painterResource

@Composable
fun SignUp(
    onNavigate: (Screen) -> Unit
) {
    Surface(
        color = Color.White
    ) {

        Box(modifier = Modifier.fillMaxSize()) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 24.dp)

            ) {

                Spacer(modifier = Modifier.height(40.dp))

//          Logo
                Image(painter = painterResource(Res.drawable.logo_ragem), contentDescription = null,
                    modifier = Modifier
                        .padding(top = 54.dp)
                        .size(150.dp)
                        .align(Alignment.Start)
                )

                Text(
                    text = "Selamat datang di Ragem",
                    style = TextStyle(
                        fontSize = 28.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight(500),
                        color = Color.Gray
                    ),
                    modifier = Modifier
                        .padding(bottom = 24.dp)
                )

//                Text Field
                CTextField(hint = "Nama Lengkap", value = "")

                CTextField(hint = "Masukkan Email", value = "")

                CTextField(hint = "Masukkan Username", value = "")

                CTextField(hint = "Password", value = "")

                Spacer(modifier = Modifier.height(24.dp))

                CButton(text = "Daftar", onClick = {
                    onNavigate(Screen.Login)
                })

                SudahPunyaAkun(onSignUpTap = {
                    onNavigate(Screen.Login)
                })

            }

        }


    }
}