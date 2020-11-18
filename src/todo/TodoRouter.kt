package me.soprog.todo

import io.ktor.application.call
import io.ktor.response.respond
import io.ktor.routing.Route
import io.ktor.routing.get
import io.ktor.routing.route
import org.koin.ktor.ext.inject

fun Route.routeTodo() {
    val todoController: TodoController by inject()

    route("/todos") {
        get {
            call.respond(todoController.get())
        }
    }
}