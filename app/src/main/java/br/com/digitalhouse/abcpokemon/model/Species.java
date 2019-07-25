
package br.com.digitalhouse.abcpokemon.model;


import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.Expose;

@Entity(tableName = "species")
public class Species {

    @PrimaryKey(autoGenerate = true)
    private long key;

    @Expose
    private String name;
    @Expose
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
