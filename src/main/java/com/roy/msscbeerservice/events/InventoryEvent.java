package com.roy.msscbeerservice.events;

import com.roy.msscbeerservice.web.model.BeerDto;

public class InventoryEvent extends BeerEvent {

    public InventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
