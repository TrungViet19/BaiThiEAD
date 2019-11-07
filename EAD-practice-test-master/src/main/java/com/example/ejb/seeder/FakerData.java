package com.example.ejb.seeder;

import com.example.ejb.entity.BookDetail;
import com.example.ejb.entity.Publisher;
import com.example.ejb.repository.BookDetailRepository;
import com.example.ejb.repository.PublisherRepository;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class FakerData {
    private final BookDetailRepository bookDetailRepository;
    private final PublisherRepository publisherRepository;

    public FakerData(BookDetailRepository bookDetailRepository, PublisherRepository publisherRepository) {
        this.bookDetailRepository = bookDetailRepository;
        this.publisherRepository = publisherRepository;
    }


}
