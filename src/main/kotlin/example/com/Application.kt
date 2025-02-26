package example.com

import example.com.plugins.*
import io.ktor.server.application.*       

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

@Suppress("unused")
fun Application.module() {
    configureKoin()
    configureRouting()
    configureSerialization()
    configureMonitoring()
    configureDefaultHeaders()
    configureStatusPages()
}
