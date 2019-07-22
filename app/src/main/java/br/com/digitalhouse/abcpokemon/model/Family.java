
package br.com.digitalhouse.abcpokemon.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Family {

    @SerializedName("evolution-line")
    private List<String> evolutionLine;
    @Expose
    private Long evolutionStage;
    @Expose
    private Long id;

    public List<String> getEvolutionLine() {
        return evolutionLine;
    }

    public void setEvolutionLine(List<String> evolutionLine) {
        this.evolutionLine = evolutionLine;
    }

    public Long getEvolutionStage() {
        return evolutionStage;
    }

    public void setEvolutionStage(Long evolutionStage) {
        this.evolutionStage = evolutionStage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
