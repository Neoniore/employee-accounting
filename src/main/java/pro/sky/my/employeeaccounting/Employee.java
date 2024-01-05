package pro.sky.my.employeeaccounting;

import java.util.Objects;

public class Employee {

    private final String firstName;
    private final String surname;

    //конструктор
    public Employee(String firstName, String surname) {

        this.firstName = firstName;
        this.surname = surname;
    }

    //геттеры для всех полей класса
    public String getName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }


    //методы для валидации ввода
    public static void validationDepartmentInput(int department) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Номера департаментов могут быть от 1 до 5");
        }
    }

    public static void validationSalaryInput(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Зарплата не может быть меньше нуля");
        }
    }

    //Метод валидации индексации ЗП
    public static void validationSalaryIndexInput(double percent) {
        if (percent <= 0) {
            throw new IllegalArgumentException("Процент повышения ЗП не может равняться нулю или быть меньше нуля");
        }
    }

    //переопределение методов
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
