package xyz.teamgravity.routes

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import xyz.teamgravity.data.model.FootballerModel

private const val BASE_URL = "http://192.168.1.9:8080"
private val footballers = listOf(
    FootballerModel("Ronaldo", "Best goal scorer of all time", "$BASE_URL/footballers/ronaldo.jpeg"),
    FootballerModel("Messi", "Legendary and GOAT", "$BASE_URL/footballers/messi.jpg"),
    FootballerModel("Lewandowski", "Critical finisher, 2020 and 2021 Golden ball winner", "$BASE_URL/footballers/lewandowski.jpg"),
    FootballerModel("Robben", "Best winger ever to cut in and score", "$BASE_URL/footballers/robben.jpg"),
    FootballerModel("Ribery", "Best winger to pass and ball control", "$BASE_URL/footballers/ribery.jpg")
)

fun Route.randomFootballer() {
    get(path = "/random_footballer") {
        call.respond(
            status = HttpStatusCode.OK,
            message = footballers.random()
        )
    }
}