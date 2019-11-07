package com.example.ejb.entity;

import javax.persistence.*;

@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String address;
    private String contact;
    private String phoneNumber;

    @OneToOne(mappedBy = "publisher")
    private BookDetail bookDetail;

    public Publisher(String name, String address, String contact, String phoneNumber, BookDetail bookDetail) {
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.phoneNumber = phoneNumber;
        this.bookDetail = bookDetail;
    }

    public Publisher() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public BookDetail getBookDetail() {
        return bookDetail;
    }

    public void setBookDetail(BookDetail bookDetail) {
        this.bookDetail = bookDetail;
    }
}
