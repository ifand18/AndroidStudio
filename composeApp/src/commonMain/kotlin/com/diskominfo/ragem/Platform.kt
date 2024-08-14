package com.diskominfo.ragem

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform