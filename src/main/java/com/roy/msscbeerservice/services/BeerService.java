package com.roy.msscbeerservice.services;

import com.roy.msscbeerservice.web.model.BeerDto;
import com.roy.msscbeerservice.web.model.BeerPageList;
import com.roy.msscbeerservice.web.model.BeerStyleEnum;
import org.springframework.data.domain.PageRequest;

import java.util.UUID;

public interface BeerService {

    BeerDto getById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);

    BeerPageList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest);
}
