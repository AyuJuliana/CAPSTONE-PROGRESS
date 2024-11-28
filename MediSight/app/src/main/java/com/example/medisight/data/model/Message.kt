package com.example.medisight.data.model

data class Message(
    val id: String = System.currentTimeMillis().toString(),
    val text: String,
    val type: MessageType,
    val timestamp: Long = System.currentTimeMillis()
)