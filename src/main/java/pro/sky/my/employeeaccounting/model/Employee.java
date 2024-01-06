package pro.sky.my.employeeaccounting.model;

import java.util.Objects;

public class Employee {

    private final String firstName;
    private final String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    @Override
    public String toString() {
        return String.format("Имя: %s, Фамилия: %s", firstName, lastName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        Employee employee = (Employee) o;
        return this.firstName.equals(employee.firstName) && this.lastName.equals(employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
