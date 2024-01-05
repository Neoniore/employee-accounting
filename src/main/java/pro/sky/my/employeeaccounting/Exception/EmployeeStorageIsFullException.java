package pro.sky.my.employeeaccounting.Exception;

public class EmployeeStorageIsFullException extends RuntimeException {
    public EmployeeStorageIsFullException() {
        super("Превышен лимит количества сотрудников в фирме");
    }
}
