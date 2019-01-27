package pl.exceptions;

public class EmployeeAlreadyInEmployeesListException extends RuntimeException {
    public EmployeeAlreadyInEmployeesListException(String message) {
        super(message);
    }
}
