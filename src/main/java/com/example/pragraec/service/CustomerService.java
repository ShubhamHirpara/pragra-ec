package com.example.pragraec.service;

import com.example.pragraec.entity.Customer;
import com.example.pragraec.repo.CustRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustRepo repo;

    public List<Customer> getAllCustomer(){
        return repo.findAll();
    }
}
