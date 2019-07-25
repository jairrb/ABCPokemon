package br.com.digitalhouse.abcpokemon.data.network;

import android.database.Observable;

import br.com.digitalhouse.abcpokemon.model.PokemonResponses;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface API {

    @GET("/api/v2/pokemon/{id or name}/")
    Observable<PokemonResponses> getPokemons(@Query("number") int id,
                                             @Query("nome") String name);

}
