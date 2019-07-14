package br.com.digitalhouse.abcpokemon.database.dao;



import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

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
