package br.com.digitalhouse.abcpokemon.database;


import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import br.com.digitalhouse.abcpokemon.database.dao.PokemonDAO;
import br.com.digitalhouse.abcpokemon.model.Pokemon;

@androidx.room.Database(entities = {Pokemon.class}, version = 1, exportSchema = false)
@TypeConverters(Converters.class)
public abstract class DatabaseRoom extends RoomDatabase {
    private static volatile DatabaseRoom INSTANCE;

    public abstract PokemonDAO pokemonDAO();

    public static DatabaseRoom getDatabase(Context context) {
        if (INSTANCE == null) {
            synchronized (DatabaseRoom.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context, DatabaseRoom.class, "my_db")
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }
        return INSTANCE;
    }


}
