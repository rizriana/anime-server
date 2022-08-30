package com.secondlab.plugins

import com.secondlab.routes.getAllHeroes
import com.secondlab.routes.root
import com.secondlab.routes.searchHeroes
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*

fun Application.configureRouting() {

    routing {
        root()
        getAllHeroes()
        searchHeroes()

        static("/images") {
            resources("images")
        }
    }
}
