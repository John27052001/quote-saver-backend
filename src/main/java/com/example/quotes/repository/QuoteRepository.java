package com.example.quotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.quotes.model.Quote;

public interface QuoteRepository extends JpaRepository<Quote, Long> {
}
