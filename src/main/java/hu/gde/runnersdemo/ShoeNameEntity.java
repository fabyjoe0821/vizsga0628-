package hu.gde.runnersdemo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class ShoeNameEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long shoeNameId;
    private String shoeNameName;
    @JsonIgnore
    @OneToMany
    private List<RunnerEntity> runners = new ArrayList<>();

    public List<RunnerEntity> getRunners() {
        return runners;
    }

    public long getShoeNameId() {
        return shoeNameId;
    }

    public void setShoeNameId(long shoeNameId) {
        this.shoeNameId = shoeNameId;
    }

    public String getShoeNameName() {
        return shoeNameName;
    }

    public void setShoeNameName(String shoeNameName) {
        this.shoeNameName = shoeNameName;
    }
}
