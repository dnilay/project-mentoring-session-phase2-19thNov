package com.example.helloworldrestapi.ui;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ErrorResponseModel {

    private String message;
    private Integer statusCode;
    private Long errorReportingTime;
}
