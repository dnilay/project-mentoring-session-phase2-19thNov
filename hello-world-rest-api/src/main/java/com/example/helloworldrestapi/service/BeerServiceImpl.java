package com.example.helloworldrestapi.service;

import com.example.helloworldrestapi.model.Beer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BeerServiceImpl implements BeerService{

    private List<Beer> beerList;

    public BeerServiceImpl() {
        beerList=new ArrayList<>();
    }

    @Override
    public Beer createBeer(Beer beer) {
         beerList.add(beer);
         return beer;
    }

    @Override
    public List<Beer> fetchAllBeer() {
        return beerList;
    }
}
