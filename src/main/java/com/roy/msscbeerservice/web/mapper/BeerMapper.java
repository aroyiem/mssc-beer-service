package com.roy.msscbeerservice.web.mapper;

import com.roy.msscbeerservice.domain.Beer;
import com.roy.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto dto);
}