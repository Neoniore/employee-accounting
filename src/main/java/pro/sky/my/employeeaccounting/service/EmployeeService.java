package pro.sky.my.employeeaccounting.service;

import org.springframework.stereotype.Service;
import pro.sky.my.employeeaccounting.Employee;

import java.util.ArrayList;
import java.util.List;

@Service
public interface EmployeeService {
    void addEmloyee(String firstName, String surname);
    void delEmloyee(String firstName, String surname);
    void findEmloyee(String firstName, String surname);
}
