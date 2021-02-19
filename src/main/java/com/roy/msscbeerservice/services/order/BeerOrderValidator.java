package com.roy.msscbeerservice.services.order;

import com.roy.brewery.model.BeerOrderDto;
import com.roy.msscbeerservice.repositories.BeerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

@Component
@RequiredArgsConstructor
@Slf4j
public class BeerOrderValidator {

    private final BeerRepository beerRepository;

    public Boolean validateOrder(BeerOrderDto beerOrderDto) {
        AtomicInteger beersNotFound = new AtomicInteger();

        beerOrderDto.getBeerOrderDetails().forEach(orderDetails -> {
            if(beerRepository.findByUpc(orderDetails.getUpc()) == null) {
                beersNotFound.incrementAndGet();
            }
        });

        return beersNotFound.get() == 0;
    }
}
