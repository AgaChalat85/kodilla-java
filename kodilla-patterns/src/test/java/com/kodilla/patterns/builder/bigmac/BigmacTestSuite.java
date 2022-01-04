package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {


    @Test
    void testBigmacNewOhne() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(Bun.WITH_SESAME)
                .sauce(Sauce.THOUSAND_ISLAND)
                .burgers(1)
                .ingredient(Ingredients.CHEESE)
                .ingredient(Ingredients.BACON)
                .ingredient(Ingredients.LETTUCE)
                .ingredient(Ingredients.ONION)
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();
        Sauce sauce = bigmac.getSauce();
        //Then
        assertEquals(4, howManyIngredients);
        assertEquals(1, howManyBurgers);
        assertEquals(Sauce.THOUSAND_ISLAND, sauce);

    }
}
