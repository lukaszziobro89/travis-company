package pl.exceptions;

public class NegativeSalaryException extends RuntimeException {
    public NegativeSalaryException(String message) {
        super(message);
    }
}
