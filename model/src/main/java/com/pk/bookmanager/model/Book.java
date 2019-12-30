package com.pk.bookmanager.model;

import java.io.Serializable;
import java.util.Objects;

public class Book implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String title;
    private long cost;
    private long publishDate;
    private String author_id;
    private String genre_id;
    private int publishCompany_id;

    public Book(String title, long cost, long publishDate, String author_id, String genre_id, int publishCompany_id) {
        this.title = title;
        this.cost = cost;
        this.publishDate = publishDate;
        this.author_id = author_id;
        this.genre_id = genre_id;
        this.publishCompany_id = publishCompany_id;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    public long getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(long publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(String author_id) {
        this.author_id = author_id;
    }

    public String getGenre_id() {
        return genre_id;
    }

    public void setGenre_id(String genre_id) {
        this.genre_id = genre_id;
    }

    public int getPublishCompany_id() {
        return publishCompany_id;
    }

    public void setPublishCompany_id(int publishCompany_id) {
        this.publishCompany_id = publishCompany_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id &&
                cost == book.cost &&
                publishDate == book.publishDate &&
                publishCompany_id == book.publishCompany_id &&
                Objects.equals(title, book.title) &&
                Objects.equals(author_id, book.author_id) &&
                Objects.equals(genre_id, book.genre_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, cost, publishDate, author_id, genre_id, publishCompany_id);
    }
}
