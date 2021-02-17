package com.roy.msscbeerservice.events;

import com.roy.msscbeerservice.web.model.BeerDto;
import lombok.*;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BeerEvent implements Serializable {

    static final long serialVersionUID = 6320787385706890086L;

    private BeerDto beerDto;
}
