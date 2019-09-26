package com.xebia.fs101.bookstore;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.assertj.core.api.Assertions.assertThat;

public class BookStoreTests {

    @Test
    public void should_be_able_to_search_a_book_present_in_bookstore_inventory() {
        BookStore bookStore = new BookStore();
        bookStore.addBook(new Book("Joshua Bloch", "Effective Java", LocalDate.of(2018, Month.JANUARY, 6), 412, "Technology", "9780134685991", "English"));
        bookStore.addBook(new Book("Robert C. Martin", "Clean Code", LocalDate.of(2008, Month.AUGUST, 1), 464, "Technology", "9780132350884", "English"));
        bookStore.addBook(new Book("Daniel Kahneman", "Thinking, Fast and Slow", LocalDate.of(2011, Month.OCTOBER, 25), 512, "Psychology", "9780374275631", "English"));
        bookStore.addBook(new Book("Antoine de Saint-Exupéry", "The Little Prince", LocalDate.of(2000, Month.MAY, 15), 96, "Fiction", "9780156012195", "French"));
        bookStore.addBook(new Book("Günter Grass", "Die Blechtrommel", LocalDate.of(1993, Month.OCTOBER, 1), 778, "Fiction", "978-3423118217", "German"));

        Book foundBook = bookStore.search(
                new Book(
                        null,
                        "Effective java",
                        null,
                        0,
                        "Technology",
                        null,
                        "english"
                ));

        assertThat(foundBook).isNotNull();
        assertThat(foundBook.getTitle()).isEqualTo("Effective Java");
    }
}