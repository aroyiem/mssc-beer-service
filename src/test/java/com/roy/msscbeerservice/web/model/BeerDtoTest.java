package com.roy.msscbeerservice.web.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.roy.brewery.model.BeerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

@JsonTest
class BeerDtoTest extends BaseTest {

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void serializeDto() throws JsonProcessingException {
        BeerDto beerDto = getDto();

        String jsonString = objectMapper.writeValueAsString(beerDto);

        System.out.println(jsonString);
    }

    @Test
    void testDeserializ() throws JsonProcessingException {
        String json = "{\"id\":\"0e498ed5-d230-4ab3-8210-e88a33d94f89\",\"version\":null,\"createdDate\":\"2021-02-09T11:46:10+0000\",\"lastModifiedDate\":\"2021-02-09T11:46:10+0000\",\"beerName\":\"Beer Name\",\"beerStyle\":\"ALE\",\"upc\":\"46374631321\",\"price\":\"12.33\",\"quantityOnHand\":null}";

        BeerDto beerDto = objectMapper.readValue(json, BeerDto.class);

        System.out.println(beerDto);
    }
}
