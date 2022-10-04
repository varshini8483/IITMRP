package com.example.ForeignExchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ForeignExchange.entity.ExchangeValue;

public interface ExchangeValueRepository extends 
JpaRepository<ExchangeValue, Long>{
ExchangeValue findByFromAndTo(String from, String to);
}
