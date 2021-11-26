package com.example.clientesAPI.controllers;

import com.example.clientesAPI.controllers.exceptions.ApiErrors;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.ResponseStatusException;

@RestControllerAdvice
public class ApplicationControllerAdvice {

    @ExceptionHandler(ResponseStatusException.class)
    public ResponseEntity<ApiErrors> handleErros(ResponseStatusException e ){
        String mensagemErro = e.getMessage();
        HttpStatus status = e.getStatus();
        ApiErrors apiErrors = new ApiErrors(mensagemErro);

        return new ResponseEntity<>(apiErrors,status);
    }

}
