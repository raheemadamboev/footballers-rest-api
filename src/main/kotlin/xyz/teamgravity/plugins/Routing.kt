package xyz.teamgravity.plugins

import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.content.*
import io.ktor.http.content.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*
import xyz.teamgravity.routes.randomFootballer

fun Application.configureRouting() {
    routing {
        randomFootballer()

        // Static plugin. Try to access `/static/index.html`
        static("/static") {
            resources("static")
        }
    }
}
