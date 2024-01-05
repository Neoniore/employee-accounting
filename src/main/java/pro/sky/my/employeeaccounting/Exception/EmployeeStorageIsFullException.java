package pro.sky.my.employeeaccounting.Exception;

public class EmployeeStorageIsFullException extends RuntimeException {
    EmployeeStorageIsFullException() {
        super("Превышен лимит количества сотрудников в фирме");
    }
}
