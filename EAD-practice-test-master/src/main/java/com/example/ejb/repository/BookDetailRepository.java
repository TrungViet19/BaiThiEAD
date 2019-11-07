package com.example.ejb.repository;

import com.example.ejb.entity.BookDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookDetailRepository extends JpaRepository<BookDetail, Integer> {
    Optional<BookDetail> findByName(String name);
}
