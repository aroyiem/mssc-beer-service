package com.roy.msscbeerservice.web.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

public class BaseTest {

    BeerDto getDto() {
        return BeerDto.builder().
                beerName("Beer Name").
                beerStyle(BeerStyleEnum.ALE).
                id(UUID.randomUUID()).
                createdDate(OffsetDateTime.now()).
                lastModifiedDate(OffsetDateTime.now()).price(new BigDecimal("12.33")).upc(46374631321L)
                .build();
    }
}
