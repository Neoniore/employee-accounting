package pro.sky.my.employeeaccounting.Exception;

public class EmployeeAlreadyAddedException extends RuntimeException {
    public EmployeeAlreadyAddedException() {
        super("Уже есть такой сотрудник");
    }
}
