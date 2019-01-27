package pl.exceptions;

public class JobAlreadyInListException extends RuntimeException {
    public JobAlreadyInListException(String message) {
        super(message);
    }
}
