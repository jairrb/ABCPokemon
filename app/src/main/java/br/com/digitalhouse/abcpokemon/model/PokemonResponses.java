
package br.com.digitalhouse.abcpokemon.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class PokemonResponses {

    @Expose
    private List<Ability> abilities;
    @SerializedName("base_experience")
    private Long baseExperience;
    @Expose
    private List<Form> forms;
    @SerializedName("game_indices")
    private List<GameIndex> gameIndices;
    @Expose
    private Long height;
    @SerializedName("held_items")
    private List<Object> heldItems;
    @Expose
    private Long id;
    @SerializedName("is_default")
    private Boolean isDefault;
    @SerializedName("location_area_encounters")
    private String locationAreaEncounters;
    @Expose
    private List<Move> moves;
    @Expose
    private String name;
    @Expose
    private Long order;
    @Expose
    private Species species;
    @Expose
    private Sprites sprites;
    @Expose
    private List<Stat> stats;
    @Expose
    private List<Type> types;
    @Expose
    private Long weight;

    public List<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
    }

    public Long getBaseExperience() {
        return baseExperience;
    }

    public void setBaseExperience(Long baseExperience) {
        this.baseExperience = baseExperience;
    }

    public List<Form> getForms() {
        return forms;
    }

    public void setForms(List<Form> forms) {
        this.forms = forms;
    }

    public List<GameIndex> getGameIndices() {
        return gameIndices;
    }

    public void setGameIndices(List<GameIndex> gameIndices) {
        this.gameIndices = gameIndices;
    }

    public Long getHeight() {
        return height;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public List<Object> getHeldItems() {
        return heldItems;
    }

    public void setHeldItems(List<Object> heldItems) {
        this.heldItems = heldItems;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public String getLocationAreaEncounters() {
        return locationAreaEncounters;
    }

    public void setLocationAreaEncounters(String locationAreaEncounters) {
        this.locationAreaEncounters = locationAreaEncounters;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getOrder() {
        return order;
    }

    public void setOrder(Long order) {
        this.order = order;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public Sprites getSprites() {
        return sprites;
    }

    public void setSprites(Sprites sprites) {
        this.sprites = sprites;
    }

    public List<Stat> getStats() {
        return stats;
    }

    public void setStats(List<Stat> stats) {
        this.stats = stats;
    }

    public List<Type> getTypes() {
        return types;
    }

    public void setTypes(List<Type> types) {
        this.types = types;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

}
