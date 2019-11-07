package com.example.ejb.service;

import com.example.ejb.entity.BookDetail;
import com.example.ejb.repository.BookDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookDetailService {

    @Autowired
    private BookDetailRepository repository;

    public BookDetail findByName(String name){
        return repository.findByName(name).orElse(null);
    }
}
