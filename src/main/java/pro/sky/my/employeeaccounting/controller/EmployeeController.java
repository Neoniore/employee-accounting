package pro.sky.my.employeeaccounting.controller;

import org.springframework.web.bind.annotation.*;
import pro.sky.my.employeeaccounting.model.Employee;
import pro.sky.my.employeeaccounting.service.EmployeeServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    EmployeeServiceImpl employeeService;

    EmployeeController(EmployeeServiceImpl employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public String showHello() {
        return ("Welcome to <strike>hell</strike> the employee book!");
    }

    @GetMapping("/add")
    public Employee addEmployee(@RequestParam String firstName, @RequestParam String lastName) {
        return employeeService.addEmloyee(firstName, lastName);
    }

    @GetMapping("/remove")
    public Employee removeEmployee(@RequestParam String firstName, @RequestParam String lastName) {
        return employeeService.removeEmloyee(firstName, lastName);
    }

    @GetMapping("/find")
    public Employee findEmployee(@RequestParam String firstName, @RequestParam String lastName) {
        return employeeService.findEmloyee(firstName, lastName);
    }

    @GetMapping("/list")
    public List<Employee> returnListOfEmployee(){
        return employeeService.getEmployeeList();
    }
}
