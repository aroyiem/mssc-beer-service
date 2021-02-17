package com.roy.msscbeerservice.events;

import com.roy.msscbeerservice.web.model.BeerDto;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
@Builder
public class BeerEvent implements Serializable {

    static final long serialVersionUID = 6320787385706890086L;

    private final BeerDto beerDto;
}
