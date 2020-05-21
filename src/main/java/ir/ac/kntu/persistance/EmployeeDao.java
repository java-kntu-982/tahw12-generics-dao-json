package ir.ac.kntu.persistance;

import ir.ac.kntu.model.Employee;

import java.io.File;

public abstract class EmployeeDao implements Repository<Long, Employee> {
    protected final File file;

    public EmployeeDao(File file) {
        this.file = file;
    }

}
