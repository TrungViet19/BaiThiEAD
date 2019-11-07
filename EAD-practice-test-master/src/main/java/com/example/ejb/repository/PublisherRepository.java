package com.example.ejb.repository;

import com.example.ejb.entity.BookDetail;
import com.example.ejb.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PublisherRepository extends JpaRepository<Publisher, Integer> {
    Optional<Publisher> findByName(String name);
}
