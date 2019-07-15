package br.com.digitalhouse.abcpokemon.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PokemonResponse {

    @SerializedName("available_filters")


    @Expose
    private List<Object> filters;
    @Expose
    private String query;
    @SerializedName("related_results")
    private List<Object> relatedResults;
    @Expose
    @SerializedName("secondary_results")
    private List<Object> secondaryResults;
    @SerializedName("site_id")
    private String siteId;

    public List<Object> getFilters() {
        return filters;
    }

    public void setFilters(List<Object> filters) {
        this.filters = filters;
    }


    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public List<Object> getRelatedResults() {
        return relatedResults;
    }

    public void setRelatedResults(List<Object> relatedResults) {
        this.relatedResults = relatedResults;
    }

    public List<Object> getSecondaryResults() {
        return secondaryResults;
    }

    public void setSecondaryResults(List<Object> secondaryResults) {
        this.secondaryResults = secondaryResults;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }



}
