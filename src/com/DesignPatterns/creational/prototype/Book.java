package com.DesignPatterns.creational.prototype;

public class Book implements Copyable{

    String name;
    String author;
    String licenceCompany;
    int pageQuantity;

    public Book(String name, String author, String licenceCompany, int pageQuantity) {
        this.name = name;
        this.author = author;
        this.licenceCompany = licenceCompany;
        this.pageQuantity = pageQuantity;
    }

    @Override
    public Object copy() {
        return new Book(name, author, licenceCompany, pageQuantity);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", licenceCompany='" + licenceCompany + '\'' +
                ", pageQuantity=" + pageQuantity +
                '}';
    }
}
