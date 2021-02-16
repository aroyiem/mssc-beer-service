package com.roy.msscbeerservice.services.inventory;

import com.roy.msscbeerservice.bootstrap.BeerLoader;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@Disabled
@SpringBootTest
class BeerInventoryServiceRestTemplateImplTest {

    @Autowired
    BeerInventoryService beerInventoryService;

    @Test
    void getOnHandInventory() {
        //Integer qoh = beerInventoryService.getOnHandInventory(BeerLoader.BEER_1_UUID);
        // todo evolve to use upc
        //System.out.println(qoh);
    }
}
