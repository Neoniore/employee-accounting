package pro.sky.my.employeeaccounting.Exception;

public class EmployeeNotFoundException extends RuntimeException {
    EmployeeNotFoundException() {
        super("Cотрудник не найден");
    }
}
