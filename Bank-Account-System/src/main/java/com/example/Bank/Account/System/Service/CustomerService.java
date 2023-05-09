package com.example.Bank.Account.System.Service;

import com.example.Bank.Account.System.Moudle.Customer;
import com.example.Bank.Account.System.Repository.CustomerRepository;
import com.example.Bank.Account.System.RequestObject.UpdateCustomerInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
    public void updateCustomer(UpdateCustomerInfo customer) {
        Customer customerInfo = new Customer();
        customerInfo.setId(customer.getId());
        customerInfo.setName(customer.getName());
        customerInfo.setEmail(customer.getEmail());
        customerInfo.setPhone(customer.getPhone());
        customerInfo.setIsActive(customer.getIsActive());
        customerRepository.save(customerInfo);

    }
}