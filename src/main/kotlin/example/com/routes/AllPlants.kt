package example.com.routes

import example.com.models.ApiResponse
import example.com.repository.PlantRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.getAllPlants() {


    val heroRepository: PlantRepository by inject()


    get("/api/plants") {
        try {
            val page = call.request.queryParameters["page"]?.toInt() ?: 1
            require(page in 1..11)

            val apiResponse = heroRepository.getAllPlants(page)

            call.respond(message = apiResponse, status = HttpStatusCode.OK)

        } catch (e: NumberFormatException) {
            call.respond(
                message = ApiResponse(success = false, message = "Only Numbers Allowed."),
                status = HttpStatusCode.BadRequest
            )
        } catch (e: IllegalArgumentException) {
            call.respond(
                message = ApiResponse(success = false, message = "Plants not found"),
                status = HttpStatusCode.NotFound
            )
        }

    }
}
