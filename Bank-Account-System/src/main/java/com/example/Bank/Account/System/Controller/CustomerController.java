package com.example.Bank.Account.System.Controller;

import com.example.Bank.Account.System.Moudle.Customer;
import com.example.Bank.Account.System.Service.AccountService;
import com.example.Bank.Account.System.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RequestMapping(value = "customer")
@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @Autowired
    AccountService accountService;


    @RequestMapping(value = "addCustomer", method = RequestMethod.POST)
    public String addCustomer(@RequestBody Customer customer) {
        try {
            customerService.addCustomer(customer);
            return "Customer added Successfully";
        } catch (Exception e) {
            return "Customer added Failed";
        }
    }
}