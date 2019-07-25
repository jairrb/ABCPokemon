
package br.com.digitalhouse.abcpokemon.model;

import com.google.gson.annotations.Expose;

@SuppressWarnings("unused")
public class Version {

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
