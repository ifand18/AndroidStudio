package com.diskominfo.ragem

sealed class Screen(val route: String) {
    object Login : Screen("login")
    object SignUp : Screen("details")
    object LupaPassword : Screen("lupapassword")
    object OTP : Screen("otp")
}