package pro.sky.my.employeeaccounting.Exception;

public class EmployeeStorageIsFullException extends RuntimeException {
    public EmployeeStorageIsFullException(String s) {
        super(s);
    }
}
