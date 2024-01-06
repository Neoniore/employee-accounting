package pro.sky.my.employeeaccounting.service;

import pro.sky.my.employeeaccounting.model.Employee;

public interface EmployeeService {
    Employee addEmloyee(String firstName, String lastName);
    Employee removeEmloyee(String firstName, String lastName);
    Employee findEmloyee(String firstName, String lastName);
}
