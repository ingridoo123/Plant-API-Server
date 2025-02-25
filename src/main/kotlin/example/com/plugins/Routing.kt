package example.com.plugins

import example.com.routes.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import javax.naming.AuthenticationException

fun Application.configureRouting() {
    routing {
        root()
        getAllPlants()
        searchPlants()

        staticResources(remotePath = "/images", basePackage = "images")
    }
}
