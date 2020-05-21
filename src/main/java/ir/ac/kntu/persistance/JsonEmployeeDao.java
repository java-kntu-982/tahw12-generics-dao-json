package ir.ac.kntu.persistance;

import ir.ac.kntu.model.Employee;

import java.io.File;

public class JsonEmployeeDao extends EmployeeDao {
    public JsonEmployeeDao(File file) {
        super(file);
    }

    @Override
    public void save(Employee employee) {
        // TODO:
    }

    @Override
    public void delete(Employee employee) {
        // TODO:
    }

    @Override
    public void deleteById(Long aLong) {
        // TODO:
    }

    @Override
    public void update(Employee employee) {
        // TODO:
    }

    @Override
    public void find(Employee employee) {
        // TODO:
    }

    @Override
    public void findByID(Long aLong) {
        // TODO:
    }

    @Override
    public void findAll() {
        // TODO:
    }
}
