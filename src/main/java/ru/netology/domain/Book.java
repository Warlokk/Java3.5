package ru.netology.domain;

import lombok.Data;

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

    @Override
    public boolean matches(String search) {
        return  (super.matches(search)) || (this.getAuthor().equalsIgnoreCase(search));
    }
}
