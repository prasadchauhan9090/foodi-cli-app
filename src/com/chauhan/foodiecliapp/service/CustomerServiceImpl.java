package com.chauhan.foodiecliapp.service;

import com.chauhan.foodiecliapp.exceptions.CustomerExistsException;
import com.chauhan.foodiecliapp.model.Customer;
import com.chauhan.foodiecliapp.repository.CustomerRepository;

import java.util.Optional;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;


    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    @Override
    public Customer save(Customer customer) throws CustomerExistsException {
        //if custmer alredy exists (id,name, email) then throw customerException
        //else save the customer in the repository

        Optional<Customer> customerById = this.customerRepository.findCustomerById(customer.getCustomerId());

        if(customerById.isPresent())
            throw new CustomerExistsException("Customer with id " + customer.getCustomerId() + " already exists");


        return this.customerRepository.save(customer);
    }
}
