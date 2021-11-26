package com.example.helloworldrestapi.service;

import com.example.helloworldrestapi.exception.BeerIdNotFoundException;
import com.example.helloworldrestapi.model.Beer;
import com.example.helloworldrestapi.repo.BeerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class BeerServiceImpl implements BeerService{



    private BeerRepository beerRepository;

    @Autowired
    public BeerServiceImpl(BeerRepository beerRepository) {
        log.info("autowired done");
        this.beerRepository = beerRepository;
    }


    @Override
    public Beer createBeer(Beer beer) {
    log.info("within createBeer method(Service Layer)");
         return beerRepository.save(beer);
    }

    @Override
    public List<Beer> fetchAllBeer() {
        log.info("within findAll method(service layer)");
        return beerRepository.findAll();
    }

    @Override
    public Beer getBeerById(Integer id) {
        log.info("within findById method(service layer)");
        Optional<Beer> beer=beerRepository.findById(id);
        if(beer.isEmpty())
        {
            throw new BeerIdNotFoundException("id "+id+" not found");
        }

        return beer.get();
        //return beerRepository.getById(id);
    }
}
