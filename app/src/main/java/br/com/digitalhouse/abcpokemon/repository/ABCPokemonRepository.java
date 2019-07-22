package br.com.digitalhouse.abcpokemon.repository;

import android.content.Context;
import android.database.Observable;

import java.util.List;

import br.com.digitalhouse.abcpokemon.data.database.DatabaseRoom;
import br.com.digitalhouse.abcpokemon.data.database.dao.PokemonDAO;
import br.com.digitalhouse.abcpokemon.data.network.RetrofitService;
import br.com.digitalhouse.abcpokemon.model.PokemonResponses;
import io.reactivex.Flowable;

public class ABCPokemonRepository {

   /* public Flowable<List<PokemonResponses>> getLocalResults(Context context) {
        DatabaseRoom room = DatabaseRoom.getDatabase(context);
        PokemonDAO pokemonDAO = room.pokemonDAO();
        return (Flowable<List<PokemonResponses>>) pokemonDAO.getAll();
    }

    // Insere uma lista reults na base de dados
    public void insertItems(Context context, List<PokemonResponses> comics){
        DatabaseRoom databaseComics = DatabaseRoom.getDatabase(context);
        PokemonDAO pokemonDAO = databaseComics.pokemonDAO();
        pokemonDAO.insertAll(comics);
    }

    // Pega os items que virão da api do mercado livre
    public Observable<PokemonResponses> getPokemons(int number) {
        return RetrofitService.getApiService().getPokemons(number);
    }*/
}
