
package br.com.digitalhouse.abcpokemon.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class VersionGroupDetail {

    @SerializedName("level_learned_at")
    private Long levelLearnedAt;
    @SerializedName("move_learn_method")
    private MoveLearnMethod moveLearnMethod;
    @SerializedName("version_group")
    private VersionGroup versionGroup;

    public Long getLevelLearnedAt() {
        return levelLearnedAt;
    }

    public void setLevelLearnedAt(Long levelLearnedAt) {
        this.levelLearnedAt = levelLearnedAt;
    }

    public MoveLearnMethod getMoveLearnMethod() {
        return moveLearnMethod;
    }

    public void setMoveLearnMethod(MoveLearnMethod moveLearnMethod) {
        this.moveLearnMethod = moveLearnMethod;
    }

    public VersionGroup getVersionGroup() {
        return versionGroup;
    }

    public void setVersionGroup(VersionGroup versionGroup) {
        this.versionGroup = versionGroup;
    }

}
