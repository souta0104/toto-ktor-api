package me.soprog.repository

import me.soprog.entity.Todo

interface TodoRepository {
    fun get(): Todo
}
