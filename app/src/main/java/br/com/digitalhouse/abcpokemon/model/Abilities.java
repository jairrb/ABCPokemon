
package br.com.digitalhouse.abcpokemon.model;

import java.util.List;
import com.google.gson.annotations.Expose;


public class Abilities {

    @Expose
    private List<String> hidden;
    @Expose
    private List<String> normal;

    public List<String> getHidden() {
        return hidden;
    }

    public void setHidden(List<String> hidden) {
        this.hidden = hidden;
    }

    public List<String> getNormal() {
        return normal;
    }

    public void setNormal(List<String> normal) {
        this.normal = normal;
    }

}
