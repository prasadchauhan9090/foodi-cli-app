package com.chauhan.foodiecliapp.service;

import com.chauhan.foodiecliapp.exceptions.CustomerExistsException;
import com.chauhan.foodiecliapp.model.Customer;

public interface CustomerService {


    public Customer save(Customer customer) throws CustomerExistsException;




}
