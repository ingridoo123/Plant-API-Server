package example.com.routes

import example.com.repository.PlantRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.searchPlants() {

    val heroRepository: PlantRepository by inject()

    get("/api/plants/search") {
        val name = call.request.queryParameters["name"]

        val apiResponse = heroRepository.searchPlants(name)

        call.respond(
            message = apiResponse,
            status = HttpStatusCode.OK
        )


    }
}