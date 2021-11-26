package com.example.helloworldrestapi.service;

import com.example.helloworldrestapi.model.Beer;

import java.util.List;

public interface BeerService {

    public Beer createBeer(Beer beer);

    public List<Beer> fetchAllBeer();


}
