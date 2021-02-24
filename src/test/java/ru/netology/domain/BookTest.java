package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void shouldMatchByAuthor() {
        Product first = new Book(1, "Мизери", 150, "С.Кинг");
        boolean actual = first.matches("С.Кинг");
        assertEquals(true, actual);
    }
}