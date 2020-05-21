package ir.ac.kntu.model;

import java.io.Serializable;

public abstract class Entity<ID> implements Serializable {
    private ID id;

    public Entity(ID id) {
        this.id = id;
    }

    public Entity() {
        id = null;
    }

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }
}
