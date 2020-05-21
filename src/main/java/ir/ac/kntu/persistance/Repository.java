package ir.ac.kntu.persistance;

import ir.ac.kntu.model.Entity;

public interface Repository<ID, T extends Entity<ID>> {
    void save(T t);

    void delete(T t);

    void deleteById(ID id);

    void update(T t);

    void find(T t);

    void findByID(ID id);

    void findAll();
}
