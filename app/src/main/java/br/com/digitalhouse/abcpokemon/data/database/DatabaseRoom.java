package br.com.digitalhouse.abcpokemon.data.database;


import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;
import android.content.Context;



import br.com.digitalhouse.abcpokemon.data.database.dao.PokemonDAO;
import me.sargunvohra.lib.pokekotlin.model.Pokemon;

@Database(entities = {Pokemon.class}, version = 1, exportSchema = false)
@TypeConverters(Converters.class)
public abstract class DatabaseRoom extends RoomDatabase {
    private static volatile DatabaseRoom INSTANCE;

    public abstract PokemonDAO pokemonDAO();

    public static DatabaseRoom getDatabase(Context context) {
        if (INSTANCE == null) {
            synchronized (DatabaseRoom.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context, DatabaseRoom.class, "poke_db")
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }
        return INSTANCE;
    }


}
