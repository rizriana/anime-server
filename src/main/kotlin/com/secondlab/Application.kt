package com.secondlab

import io.ktor.server.application.*
import com.secondlab.plugins.*

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    configurationKoin()
    configureSerialization()
    configureMonitoring()
    configureRouting()
    configurationDefaultHeader()
    configureStatusPages()
}
