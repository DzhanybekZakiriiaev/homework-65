package com.example.homework65.controller;

import com.example.homework65.exception.ProductNotFoundException;
import org.springdoc.api.ErrorMessage;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@RestControllerAdvice
public class ProductControllerAdvice {

    @ExceptionHandler(value = {ProductNotFoundException.class, IllegalArgumentException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<Object> handleNotFoundExceptions(Exception ex, WebRequest request) {
        String errorDescription = ex.getLocalizedMessage();
        if (errorDescription == null) {
            errorDescription = ex.toString();
        }
        ErrorMessage errorMessage = new ErrorMessage(errorDescription);
        return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = {Exception.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<Object> handleOtherExceptions(Exception ex, WebRequest request) {
        String errorDescription = ex.getLocalizedMessage();
        if (errorDescription == null) {
            errorDescription = ex.toString();
        }
        ErrorMessage errorMessage = new ErrorMessage(errorDescription);
        return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
