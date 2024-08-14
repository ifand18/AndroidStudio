package com.diskominfo.ragem

import LupaPasswordScreen
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import androidragem.composeapp.generated.resources.Res
import androidragem.composeapp.generated.resources.compose_multiplatform
import com.diskominfo.ragem.screen.LoginScreen
import com.diskominfo.ragem.screen.OTPScreen
import com.diskominfo.ragem.screen.SignUp


@Composable
@Preview
fun App() {
    var currentScreen by remember { mutableStateOf<Screen>(Screen.Login) }

    when (currentScreen) {
        is Screen.Login -> LoginScreen(onNavigate = { screen -> currentScreen = screen })
        is Screen.SignUp -> SignUp(onNavigate = { screen -> currentScreen = screen })
        is Screen.LupaPassword -> LupaPasswordScreen(onNavigate = { screen -> currentScreen = screen })
        is Screen.OTP -> OTPScreen(onNavigate = { screen -> currentScreen = screen })
    }
}