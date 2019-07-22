
package br.com.digitalhouse.abcpokemon.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.os.Parcel;

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.Expose;

@Entity(tableName = "pokemons")
public class PokemonResponses {

    public PokemonResponses() {

    }
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "idPoke")
    private long idPoke;

    private Abilities abilities;
    private List<String> eggGroups;
    private Family family;
    private Long gen;
    private List<Double> gender;
    private String height;
    private Boolean legendary;
    private Boolean mega;
    private Boolean mythical;
    private String name;
    private String number;
    private String species;
    private String sprite;
    private Boolean starter;
    private List<String> types;
    private Boolean ultraBeast;
    private String weight;




    public long getIdPoke() {
        return idPoke;
    }

    public void setIdPoke(long idPoke) {
        this.idPoke = idPoke;
    }

    public Abilities getAbilities() {
        return abilities;
    }

    public void setAbilities(Abilities abilities) {
        this.abilities = abilities;
    }

    public List<String> getEggGroups() {
        return eggGroups;
    }

    public void setEggGroups(List<String> eggGroups) {
        this.eggGroups = eggGroups;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public Long getGen() {
        return gen;
    }

    public void setGen(Long gen) {
        this.gen = gen;
    }

    public List<Double> getGender() {
        return gender;
    }

    public void setGender(List<Double> gender) {
        this.gender = gender;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public Boolean getLegendary() {
        return legendary;
    }

    public void setLegendary(Boolean legendary) {
        this.legendary = legendary;
    }

    public Boolean getMega() {
        return mega;
    }

    public void setMega(Boolean mega) {
        this.mega = mega;
    }

    public Boolean getMythical() {
        return mythical;
    }

    public void setMythical(Boolean mythical) {
        this.mythical = mythical;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSprite() {
        return sprite;
    }

    public void setSprite(String sprite) {
        this.sprite = sprite;
    }

    public Boolean getStarter() {
        return starter;
    }

    public void setStarter(Boolean starter) {
        this.starter = starter;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public Boolean getUltraBeast() {
        return ultraBeast;
    }

    public void setUltraBeast(Boolean ultraBeast) {
        this.ultraBeast = ultraBeast;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

}
