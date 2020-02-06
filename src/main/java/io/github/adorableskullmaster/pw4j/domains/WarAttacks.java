package io.github.adorableskullmaster.pw4j.domains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.github.adorableskullmaster.pw4j.domains.subdomains.WarAttacksContainer;

import java.util.List;
import java.util.Objects;

public class WarAttacks extends Entity {
    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("war_attacks")
    @Expose
    private List<WarAttacksContainer> warAttacksContainers = null;

    public Boolean getSuccess() {
        return success;
    }

    public List<WarAttacksContainer> getWarAttacksContainers() {
        return warAttacksContainers;
    }

    @Override
    public String toString() {
        return "WarAttacks{" +
                "success=" + success +
                ", warAttacksContainers=" + warAttacksContainers +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WarAttacks that = (WarAttacks) o;
        return Objects.equals(success, that.success) &&
                Objects.equals(warAttacksContainers, that.warAttacksContainers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, warAttacksContainers);
    }

}