package com.example.helloworldrestapi.controller;

import com.example.helloworldrestapi.exception.BeerIdNotFoundException;
import com.example.helloworldrestapi.model.Beer;
import com.example.helloworldrestapi.service.BeerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class BeerController {


    private BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }
    @PostMapping("/beers")
    private ResponseEntity createBeer(@RequestBody  Beer beer)
    {
        log.info("within createBeer(Controller Layer)");

        Beer theBeer=beerService.createBeer(beer);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/beers")
    public ResponseEntity<List<Beer>> getAll()
    {
        log.info("within fetchAll(Controller Layer)");
        List<Beer> list=beerService.fetchAllBeer();
        return new ResponseEntity<List<Beer>>(list,HttpStatus.OK);
    }
    @GetMapping("/beers/{id}")
    public ResponseEntity<Beer> getById(@PathVariable("id") Integer id)
    {

        return ResponseEntity.ok(beerService.getBeerById(id));
    }



}
