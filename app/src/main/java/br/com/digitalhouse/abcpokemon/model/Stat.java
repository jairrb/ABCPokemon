
package br.com.digitalhouse.abcpokemon.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Stat {

    @SerializedName("base_stat")
    private Long baseStat;
    @Expose
    private Long effort;
    @Expose
    private String name;
    @Expose
    private Stat stat;
    @Expose
    private String url;

    public Long getBaseStat() {
        return baseStat;
    }

    public void setBaseStat(Long baseStat) {
        this.baseStat = baseStat;
    }

    public Long getEffort() {
        return effort;
    }

    public void setEffort(Long effort) {
        this.effort = effort;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Stat getStat() {
        return stat;
    }

    public void setStat(Stat stat) {
        this.stat = stat;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
