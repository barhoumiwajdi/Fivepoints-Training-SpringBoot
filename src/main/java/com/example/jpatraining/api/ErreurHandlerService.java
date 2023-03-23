package com.example.jpatraining.api;


import com.example.jpatraining.Exception.ApplicationErreur;
import com.example.jpatraining.Exception.CustomerNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ErreurHandlerService extends ResponseEntityExceptionHandler {
           @ExceptionHandler(CustomerNotFoundException.class)
    public ResponseEntity<ApplicationErreur> handleCustomerNotFoundException(CustomerNotFoundException exception , WebRequest  webrequest){
        ApplicationErreur error = new ApplicationErreur();
        error.setStatus(404);
        error.setMessage(exception.getMessage());
        return new ResponseEntity<>(error , HttpStatus.NOT_FOUND);
    }
}
