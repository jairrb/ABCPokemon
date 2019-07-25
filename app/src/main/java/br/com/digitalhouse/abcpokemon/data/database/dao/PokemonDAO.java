package br.com.digitalhouse.abcpokemon.data.database.dao;




import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import br.com.digitalhouse.abcpokemon.model.PokemonResponses;
import io.reactivex.Flowable;

@Dao
public interface PokemonDAO {

  /* @Insert(onConflict = OnConflictStrategy.REPLACE)
   void insert(PokemonResponses pokemonResponses);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(List<PokemonResponses> resultListPoke);

    @Update
    void update(PokemonResponses pokemonResponses);

    @Query("SELECT * FROM species")
    List<PokemonResponses> getAll();

    @Query("SELECT * FROM  species")
    Flowable<List<PokemonResponses>> getAllRxJava();*/




}
