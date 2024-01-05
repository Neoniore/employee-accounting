package pro.sky.my.employeeaccounting.service;

import pro.sky.my.employeeaccounting.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    List<Employee> employeeList = new ArrayList<>();
    int maxPossibleEmployees;

    EmployeeServiceImpl(int maxPossibleEmployees) {
        this.maxPossibleEmployees = maxPossibleEmployees;
    }

    @Override
    public void addEmloyee(String firstName, String surname) {

    }

    @Override
    public void delEmloyee(String firstName, String surname) {

    }

    @Override
    public void findEmloyee(String firstName, String surname) {

    }
}
