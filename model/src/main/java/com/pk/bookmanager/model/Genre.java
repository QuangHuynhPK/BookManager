package com.pk.bookmanager.model;

import java.io.Serializable;
import java.util.Objects;

public class Genre implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String genre;

    public Genre(String genre) {
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Genre genre1 = (Genre) o;
        return id == genre1.id &&
                Objects.equals(genre, genre1.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, genre);
    }
}
