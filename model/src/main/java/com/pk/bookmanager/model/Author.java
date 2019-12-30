package com.pk.bookmanager.model;

import java.io.Serializable;
import java.util.Objects;

public class Author implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String genre;
    private long birthday;
    private String address;
    private long salary;

    public Author(String name, String genre, long birthday, String address, long salary) {
        this.name = name;
        this.genre = genre;
        this.birthday = birthday;
        this.address = address;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public long getBirthday() {
        return birthday;
    }

    public void setBirthday(long birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return id == author.id &&
                birthday == author.birthday &&
                salary == author.salary &&
                Objects.equals(name, author.name) &&
                Objects.equals(genre, author.genre) &&
                Objects.equals(address, author.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, genre, birthday, address, salary);
    }
}
