package me.soprog.entity

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDateTime

data class Todo(
    @JsonProperty("id")
    val id: Long,
    @JsonProperty("content")
    val content: String,
    @JsonProperty("created_at")
    val createdAt: LocalDateTime,
    @JsonProperty("status")
    val status: Status,
) {
    sealed class Status {
        object Waiting : Status()
        data class Completed(
            @JsonProperty("completed_at")
            val completedAt: LocalDateTime,
        ) : Status()
    }
}
