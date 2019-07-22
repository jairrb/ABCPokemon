package br.com.digitalhouse.abcpokemon.data.network;

import android.database.Observable;

import br.com.digitalhouse.abcpokemon.model.PokemonResponses;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface API {

    @GET("/pokemon/{number}")
    Observable<PokemonResponses> getPokemons(@Query("number")int number);
}
