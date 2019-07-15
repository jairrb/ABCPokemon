package br.com.digitalhouse.abcpokemon.data.database.dao;




import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import br.com.digitalhouse.abcpokemon.model.Pokemon;
import io.reactivex.Flowable;

@Dao
public interface PokemonDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Pokemon pokemon);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(List<Pokemon> pokemons);

    @Update
    void update(Pokemon pokemon);

    @Delete
    void delete(Pokemon pokemon);

    @Query("SELECT * FROM pokemons")
    List<Pokemon> getAll();

    @Query("SELECT * FROM pokemons")
    Flowable<List<Pokemon>> getAllRxJava();

    @Query("SELECT * FROM pokemons WHERE id = :id")
    Pokemon getById(long id);

    @Query("SELECT * FROM pokemons WHERE name = :nome")
    Pokemon getByName(String nome);

}
