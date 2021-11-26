package com.example.clientesAPI.controllers.exceptions;

import lombok.Getter;

import java.util.List;

public class ApiErrors {

    @Getter
    private List<String> erros;

    public ApiErrors(){
    }
    public ApiErrors(List<String> erros) {
        this.erros = erros;
    }

    public ApiErrors(String message){
        this.erros = List.of(message);
    }
}
