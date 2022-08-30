package com.secondlab.plugins

import com.secondlab.routes.getAllHeroes
import com.secondlab.routes.root
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {

    routing {
        root()
        getAllHeroes()
    }
}
