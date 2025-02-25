package example.com.plugins

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.plugins.statuspages.*
import io.ktor.server.response.*
import javax.naming.AuthenticationException


fun Application.configureStatusPages() {
    install(StatusPages) {
        status(HttpStatusCode.NotFound) { statusCode: HttpStatusCode ->
            call.respondText("Page not Found.", status = statusCode)
        }
        exception<AuthenticationException> { call, authenticationException ->
            call.respond(
                message = "We caught an exception!",
                status = HttpStatusCode.OK
            )

        }
    }


}