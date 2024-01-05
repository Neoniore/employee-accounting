package pro.sky.my.employeeaccounting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.my.employeeaccounting.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    EmployeeService employeeService;

    @GetMapping
    public String showHello() {
        return ("Welcome to <strike>hell</strike> the employee book!");
    }


}
