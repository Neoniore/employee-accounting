package pro.sky.my.employeeaccounting.service;

import org.springframework.stereotype.Service;
import pro.sky.my.employeeaccounting.Employee;
import pro.sky.my.employeeaccounting.Exception.EmployeeAlreadyAddedException;
import pro.sky.my.employeeaccounting.Exception.EmployeeNotFoundException;
import pro.sky.my.employeeaccounting.Exception.EmployeeStorageIsFullException;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private final int MAX_POSSIBLE_EMPLOYEES = 10;
    List<Employee> employeeList = new ArrayList<>(List.of(
            new Employee("Александр", "Панченко"),
            new Employee("Ози", "Озберн")
    ));

    public Employee addEmloyee(String firstName, String surname) {
        Employee employee = new Employee(firstName, surname);

        if (employeeList.size() >= MAX_POSSIBLE_EMPLOYEES) {
            throw new EmployeeStorageIsFullException("Превышен лимит количества сотрудников в фирме");
        } else if (employeeList.contains(employee)) {
            throw new EmployeeAlreadyAddedException(String.format("Сотрудник %s уже есть в книге учета сотрудников!", employee));
        } else {
            employeeList.add(employee);
            return employee;
        }
    }

    public Employee removeEmloyee(String firstName, String surname) {
        Employee employee = new Employee(firstName, surname);
            if (employeeList.remove((Employee) employee)) {
                return employee;
            } else {
                throw new EmployeeNotFoundException(String.format("Сотрудник %s не найден!", employee));
            }
    }

    public Employee findEmloyee(String firstName, String surname) {
        Employee employee = new Employee(firstName, surname);
        if (!employeeList.contains(employee)) {
            throw new EmployeeNotFoundException(String.format("Сотрудник %s не найден!", employee));
        } else {
            return employee;
        }
    }
}
