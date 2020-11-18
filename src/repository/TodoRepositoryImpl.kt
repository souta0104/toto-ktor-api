package me.soprog.repository

import me.soprog.entity.Todo
import java.time.LocalDateTime

class TodoRepositoryImpl : TodoRepository {

    override fun get(): Todo {
        return Todo(
            id = 0,
            content = "oreore",
            createdAt = LocalDateTime.now(),
            status = Todo.Status.Completed(
                LocalDateTime.now().plusDays(1),
            )
        )
    }
}
