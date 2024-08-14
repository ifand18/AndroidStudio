package com.diskominfo.ragem.components


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LupaPassword(
    onSignupTap: () -> Unit = {},
) {
    Row(
        modifier = Modifier
            .padding(top=10.dp, bottom = 5.dp)
            .offset(x = (-20).dp)
    ){
        Text(text = "                                                                 Lupa Password?",
            style = TextStyle(
                fontSize = 15.sp,
                fontFamily = FontFamily.SansSerif,
                color = Color.Red,
                fontWeight = FontWeight.Bold
            ),
            modifier = Modifier.clickable {
                onSignupTap()
            }
        )
    }
}