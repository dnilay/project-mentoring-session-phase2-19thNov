package com.example.helloworldrestapi.exception;

import com.example.helloworldrestapi.ui.ErrorResponseModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BeerControllerExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ErrorResponseModel> handleIdNotFoundException(BeerIdNotFoundException e)
    {
        ErrorResponseModel model=new ErrorResponseModel();
        model.setMessage(e.getMessage());
        model.setStatusCode(HttpStatus.NOT_FOUND.value());
        model.setErrorReportingTime(System.currentTimeMillis());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(model);
    }


}
