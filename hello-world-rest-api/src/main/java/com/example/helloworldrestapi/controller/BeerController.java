package com.example.helloworldrestapi.controller;

import com.example.helloworldrestapi.model.Beer;
import com.example.helloworldrestapi.service.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BeerController {


    private BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }
    @PostMapping("/beers")
    private Beer createBeer( @RequestBody  Beer beer)
    {
        return beerService.createBeer(beer);
    }

    @GetMapping("/beers")
    public List<Beer> getAll()
    {
        return beerService.fetchAllBeer();
    }



}
