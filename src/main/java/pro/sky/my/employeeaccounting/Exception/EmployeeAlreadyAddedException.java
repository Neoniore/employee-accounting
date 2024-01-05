package pro.sky.my.employeeaccounting.Exception;

public class EmployeeAlreadyAddedException extends RuntimeException {
    EmployeeAlreadyAddedException() {
        super("Уже есть такой сотрудник");
    }
}
