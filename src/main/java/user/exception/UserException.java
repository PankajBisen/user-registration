package user.exception;

import org.springframework.http.HttpStatus;

public class UserException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    private final HttpStatus status;


    public HttpStatus getStatus() {
        return status;
    }

    public UserException(String message, HttpStatus status){
        super(message);
        this.status = status;
    }
}
