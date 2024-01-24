package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.BookEN;

public interface BookRepository extends JpaRepository<BookEN, Integer>{

}
