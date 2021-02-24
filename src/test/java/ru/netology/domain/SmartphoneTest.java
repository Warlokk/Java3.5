package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {

    @Test
    void shouldMatchByManufacturer() {
        Product first = new Smartphone(4, "Мизери", 15000, "Xiaomi");
        boolean actual = first.matches("Xiaomi");
        assertEquals(true, actual);
    }
}