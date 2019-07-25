
package br.com.digitalhouse.abcpokemon.model;

import com.google.gson.annotations.Expose;

@SuppressWarnings("unused")
public class Type {

    @Expose
    private String name;
    @Expose
    private Long slot;
    @Expose
    private Type type;
    @Expose
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSlot() {
        return slot;
    }

    public void setSlot(Long slot) {
        this.slot = slot;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
