package com.pk.bookmanager.model;

import java.io.Serializable;
import java.util.Objects;

public class PublishCompany implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String company;
    private String address;

    public PublishCompany(String company, String address) {
        this.company = company;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PublishCompany that = (PublishCompany) o;
        return id == that.id &&
                Objects.equals(company, that.company) &&
                Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, company, address);
    }
}
