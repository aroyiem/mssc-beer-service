package com.roy.msscbeerservice.web.controller;

import com.roy.msscbeerservice.services.BeerService;
import com.roy.msscbeerservice.web.model.BeerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/beer")
public class BeerController {

    private final BeerService beerService;

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId) {
        return new ResponseEntity<>(beerService.getById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveBeer(@RequestBody @Validated BeerDto beerDto) {
        return new ResponseEntity<>(beerService.saveNewBeer(beerDto), HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeer(@PathVariable("beerId") UUID beerId, @RequestBody @Validated BeerDto beerDto) {

        return new ResponseEntity<>(beerService.updateBeer(beerId, beerDto), HttpStatus.NO_CONTENT);
    }
}
