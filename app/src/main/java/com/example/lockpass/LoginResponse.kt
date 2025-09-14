package com.example.lockpass

class LoginResponse {
    data class LoginResponse(
        val usuarioId: Int,
        val usuarioNome: String,
        val usuarioEmail: String,
        val usuarioCpf: String
    )
}