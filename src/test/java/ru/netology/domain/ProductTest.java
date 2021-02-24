package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void shouldMatchByName() {
        Product first = new Product(1, "Мизери", 150);
        boolean actual = first.matches("Мизери");
        assertEquals(true, actual);
    }

}
