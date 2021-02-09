package com.roy.msscbeerservice.web.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
        String json = "{\"id\":\"d46310fb-ac21-49ef-af9b-52a5e035831d\",\"version\":null,\"createdDate\":\"2021-02-09T11:06:38+0000\",\"lastModifiedDate\":\"2021-02-09T11:06:38.9212755Z\",\"beerName\":\"Beer Name\",\"beerStyle\":\"ALE\",\"upc\":46374631321,\"price\":\"12.33\",\"quantityOnHand\":null}";

        BeerDto beerDto = objectMapper.readValue(json, BeerDto.class);

        System.out.println(beerDto);
    }
}
