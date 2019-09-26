package com.xebia.fs101.bookshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BookStore {

    private List<Book> books;

    public BookStore() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public Book search(Book toSearch) {
        for (Book book : books) {
            if (toSearch.getAuthor() != null
                    && !Objects.equals(book.getAuthor(), toSearch.getAuthor())) {
                continue;
            }
            if (toSearch.getGenre() != null
                    && !Objects.equals(book.getGenre(), toSearch.getGenre())) {
                continue;
            }
            if (toSearch.getTitle() != null
                    && !Objects.equals(book.getTitle(), toSearch.getTitle())) {
                continue;
            }
            if (toSearch.getLanguage() != null
                    && !Objects.equals(book.getLanguage(), toSearch.getLanguage())) {
                continue;
            }
            return book;
        }
        return null;
    }
}