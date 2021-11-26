package com.example.helloworldrestapi.service;

import com.example.helloworldrestapi.model.Beer;
import com.example.helloworldrestapi.repo.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BeerServiceImpl implements BeerService{



    private BeerRepository beerRepository;

    @Autowired
    public BeerServiceImpl(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }


    @Override
    public Beer createBeer(Beer beer) {

         return beerRepository.save(beer);
    }

    @Override
    public List<Beer> fetchAllBeer() {
        return beerRepository.findAll();
    }
}
