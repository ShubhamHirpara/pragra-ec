package com.example.pragraec.repo;

import com.example.pragraec.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustRepo extends JpaRepository<Customer,Long> {
}
