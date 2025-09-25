package com.example.lockpass

import retrofit2.Call
import retrofit2.http.GET

interface ApiServiceProduto {
    @GET("lockpass/produto.php")
    fun getProdutos(): Call<List<Produto>>
}