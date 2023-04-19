package user.controllerAdvice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import user.exception.UserException;
import user.model.ErrorMessage;

import java.time.LocalDateTime;
import java.util.Date;

@ControllerAdvice
public class exceptionHandler {

    @ExceptionHandler(UserException.class)
    public ResponseEntity<ErrorMessage> userException(UserException userException, WebRequest webRequest){
        ErrorMessage errorMessage = new ErrorMessage();
        HttpStatus status = userException.getStatus();
        errorMessage.setStatusCode(status);
        errorMessage.setTimestamp(LocalDateTime.now());
        errorMessage.setMessage(userException.getMessage());
        errorMessage.setDescription("Operation failed");
        return ResponseEntity.status(status).body(errorMessage);
    }
}
