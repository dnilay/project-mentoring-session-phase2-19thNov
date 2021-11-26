package com.example.helloworldrestapi.model;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Beer {

    private String beerId;
    private String beerName;
    @JsonEnumDefaultValue
    private BeerType beerType;
    private Double beerPrice;
}
