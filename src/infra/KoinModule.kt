package me.soprog.infra

import me.soprog.repository.TodoRepository
import me.soprog.repository.TodoRepositoryImpl
import me.soprog.todo.TodoController
import org.koin.dsl.module

val presentersModule = module {
    single { TodoController(get()) }
}

val repositoriesModule = module {
    single<TodoRepository> { TodoRepositoryImpl() }
}
