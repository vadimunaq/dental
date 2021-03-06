package com.gmail.vadim.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gmail.vadim.backend.data.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
