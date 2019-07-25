
package br.com.digitalhouse.abcpokemon.model;

import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Sprites {

    @SerializedName("back_default")
    private String backDefault;
    @SerializedName("back_female")
    private Object backFemale;
    @SerializedName("back_shiny")
    private String backShiny;
    @SerializedName("back_shiny_female")
    private Object backShinyFemale;
    @SerializedName("front_default")
    private String frontDefault;
    @SerializedName("front_female")
    private Object frontFemale;
    @SerializedName("front_shiny")
    private String frontShiny;
    @SerializedName("front_shiny_female")
    private Object frontShinyFemale;

    public String getBackDefault() {
        return backDefault;
    }

    public void setBackDefault(String backDefault) {
        this.backDefault = backDefault;
    }

    public Object getBackFemale() {
        return backFemale;
    }

    public void setBackFemale(Object backFemale) {
        this.backFemale = backFemale;
    }

    public String getBackShiny() {
        return backShiny;
    }

    public void setBackShiny(String backShiny) {
        this.backShiny = backShiny;
    }

    public Object getBackShinyFemale() {
        return backShinyFemale;
    }

    public void setBackShinyFemale(Object backShinyFemale) {
        this.backShinyFemale = backShinyFemale;
    }

    public String getFrontDefault() {
        return frontDefault;
    }

    public void setFrontDefault(String frontDefault) {
        this.frontDefault = frontDefault;
    }

    public Object getFrontFemale() {
        return frontFemale;
    }

    public void setFrontFemale(Object frontFemale) {
        this.frontFemale = frontFemale;
    }

    public String getFrontShiny() {
        return frontShiny;
    }

    public void setFrontShiny(String frontShiny) {
        this.frontShiny = frontShiny;
    }

    public Object getFrontShinyFemale() {
        return frontShinyFemale;
    }

    public void setFrontShinyFemale(Object frontShinyFemale) {
        this.frontShinyFemale = frontShinyFemale;
    }

}
