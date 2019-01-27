package pl.exceptions;

public class SalaryNotInRangeException extends RuntimeException {
    public SalaryNotInRangeException(String message) {
        super(message);
    }
}
