package pro.sky.my.employeeaccounting.model;

import pro.sky.my.employeeaccounting.Exception.EmployeeAlreadyAddedException;
import pro.sky.my.employeeaccounting.Exception.EmployeeNotFoundException;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class EmployeeBook {

    private final int id;
    private final Map<String, Employee> empolyees = new HashMap<>();

    private static int counter;

    public EmployeeBook() {
        counter++;

        this.id = counter;
    }

    public Map<String, Employee> getEmpolyees() {
        return empolyees;
    }

    public Employee addEmployee(Employee employee) {
        if (empolyees.containsKey(employee.toString())) {
            throw new EmployeeAlreadyAddedException(String.format("Сотрудник %s уже есть в книге учета сотрудников!", employee));
        }
        empolyees.put(employee.toString(), employee);
        return employee;
    }

    public Employee findEmloyee(String firstName, String lastName) {
        if (empolyees.containsKey( String.format("Имя: %s, Фамилия: %s", firstName, lastName))) {
            return empolyees.get(String.format("Имя: %s, Фамилия: %s", firstName, lastName));
        }
        throw new EmployeeNotFoundException(String.format("Сотрудник %s %s не найден!", firstName, lastName));
    }

    public Employee removeEmloyee(String firstName, String lastName) {
        Employee removedEmlpoyee = empolyees.remove(String.format("Имя: %s, Фамилия: %s", firstName, lastName));
        if (removedEmlpoyee == null) {
            throw new EmployeeNotFoundException(String.format("Сотрудник %s %s не найден!", firstName, lastName));
        }
        return removedEmlpoyee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeBook that = (EmployeeBook) o;
        return id == that.id && Objects.equals(empolyees, that.empolyees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, empolyees);
    }
}


