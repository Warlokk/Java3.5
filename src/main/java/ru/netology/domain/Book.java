package ru.netology.domain;

import lombok.Data;
import ru.netology.domain.Product;

@Data
public class Book extends Product {
    private String author;

    public Book(int id, String name, int price, String author) {
        super(id, name, price);
        this.author = author;
    }

    public Book() {
        super();
    }
}
