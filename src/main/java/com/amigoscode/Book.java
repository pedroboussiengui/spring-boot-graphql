package com.amigoscode;

import java.util.Arrays;
import java.util.List;

public record Book(Integer id, String name, Integer pageCount, Integer authorId) {

    public static List<Book> books = Arrays.asList(
            new Book(1, "Quran", 604, 1),
            new Book(2, "Harry Potter", 700, 1),
            new Book(3, "Foobar", 100, 2),
            new Book(4, "Spring boot", 344, 2)
    );

    public static Book getBookById(Integer id) {
        return books.stream()
                .filter(b -> b.id.equals(id))
                .findFirst()
                .orElse(null);
    }
}
