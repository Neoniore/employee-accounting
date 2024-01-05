package pro.sky.my.employeeaccounting;

import java.util.Objects;

public class Employee {

    private final String firstName;
    private final String surname;

    public Employee(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }


    public String getName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }


    @Override
    public String toString() {
        return String.format("Имя: %s, Фамилия: %s", firstName, surname);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        Employee employee = (Employee) o;
        return this.firstName.equals(employee.firstName) && this.surname.equals(employee.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, surname);
    }
}
