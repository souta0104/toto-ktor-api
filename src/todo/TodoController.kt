package me.soprog.todo

import me.soprog.entity.Todo
import me.soprog.repository.TodoRepository

class TodoController(
    private val todoRepository: TodoRepository,
) {
    fun get(): Todo {
        return todoRepository.get()
    }
}
