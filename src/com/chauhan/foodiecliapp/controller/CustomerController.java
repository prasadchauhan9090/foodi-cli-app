package com.chauhan.foodiecliapp.controller;

import com.chauhan.foodiecliapp.exceptions.CustomerExistsException;
import com.chauhan.foodiecliapp.model.Customer;
import com.chauhan.foodiecliapp.repository.CustomerRepository;
import com.chauhan.foodiecliapp.service.CustomerService;
import com.chauhan.foodiecliapp.service.CustomerServiceImpl;

public class CustomerController {




    private CustomerServiceImpl customerService;

    public CustomerController(CustomerServiceImpl customerService) {
        this.customerService = customerService;
    }


    public Customer save(Customer customer) throws CustomerExistsException
    {
        return this.customerService.save(customer);

    }

}

