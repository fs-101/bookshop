package com.xebia.fs101.bookshop;

import java.time.LocalDate;

public class Book {

    private final String author;
    private final String title;
    private final LocalDate publishedOn;
    private final int pages;
    private final String genre;
    private final String isbn;
    private final String language;


    public Book(String author, String title,
                LocalDate publishedOn, int pages,
                String genre, String isbn,
                String language) {
        this.author = author;
        this.title = title;
        this.publishedOn = publishedOn;
        this.pages = pages;
        this.genre = genre;
        this.isbn = isbn;
        this.language = language;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getPublishedOn() {
        return publishedOn;
    }

    public int getPages() {
        return pages;
    }

    public String getGenre() {
        return genre;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
