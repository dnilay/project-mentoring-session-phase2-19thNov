package com.example.helloworldrestapi.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class BeerIdNotFoundException extends RuntimeException{

    private String message;

}
