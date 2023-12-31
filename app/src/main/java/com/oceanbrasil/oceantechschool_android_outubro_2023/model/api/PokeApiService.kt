package com.oceanbrasil.oceantechschool_android_outubro_2023.model.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PokeApiService {

    // https://pokeapi.co/api/v2/pokemon?limit=20&offset=0
    // Base: https://pokeapi.co/api/v2/
    // Endpoint (Rota): pokemon?limit=20&offset=0
    @GET("pokemon?limit=10000&offset=0")
    fun listPokemon(): Call<ListPokemonApiResult>

    @GET("pokemon/{number}")
    fun getPokemonByNumber(@Path("number") number: Int): Call<GetPokemonApiResult>
}
