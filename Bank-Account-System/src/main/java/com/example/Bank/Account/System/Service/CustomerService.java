package com.example.Bank.Account.System.Service;

import com.example.Bank.Account.System.Moudle.Customer;
import com.example.Bank.Account.System.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public void addCustomer(Customer customer) {
        Customer customerInfo = new Customer();
        customerInfo.setName(customer.getName());
        customerInfo.setEmail(customer.getEmail());
        customerInfo.setPhone(customer.getPhone());
        customerInfo.setIsActive(customer.getIsActive());
        customerRepository.save(customerInfo);

    }
}