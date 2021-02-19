package com.roy.brewery.model.events;

import com.roy.brewery.model.BeerOrderDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ValidateOrderRequest {

    private BeerOrderDto beerOrderDto;
}
