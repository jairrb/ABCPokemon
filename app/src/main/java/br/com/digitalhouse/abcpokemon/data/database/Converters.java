package br.com.digitalhouse.abcpokemon.data.database;


import android.arch.persistence.room.TypeConverter;



import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

import br.com.digitalhouse.abcpokemon.model.PokemonResponses;

public class Converters {


/*
    @TypeConverter
    public List<PokemonResponses> fromPokeList(String value) {
        Type listType = (Type) new TypeToken<List<PokemonResponses>>() {
        }.getType();
        return new Gson().fromJson(value, listType);
    }

    @TypeConverter
    public String fromPokeList(List<PokemonResponses> list) {
        Gson gson = new Gson();
        return gson.toJson(list);
    }

    @TypeConverter
    public Object fromObject(String value) {
        Type listType = (Type) new TypeToken<Object>() {
        }.getType();
        return new Gson().fromJson(value, listType);
    }

    @TypeConverter
    public String fromObject(Object list) {
        Gson gson = new Gson();
        return gson.toJson(list);
    }

    @TypeConverter
    public PokemonResponses fromPoke(String value) {
        Type listType = (Type) new TypeToken<PokemonResponses>() {
        }.getType();
        return new Gson().fromJson(value, listType);
    }

    @TypeConverter
    public String fromPoke(PokemonResponses list) {
        Gson gson = new Gson();
        return gson.toJson(list);
    }
*/



}
