package com.example.Bank.Account.System.Controller;

import com.example.Bank.Account.System.Moudle.Customer;
import com.example.Bank.Account.System.RequestObject.UpdateCustomerInfo;
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

    @RequestMapping(value = "updateCustomer", method = RequestMethod.POST)
    public String updateCustomer(@RequestBody UpdateCustomerInfo updateCustomerInfo) {
        try {
            customerService.updateCustomer(updateCustomerInfo);
            return "Customer Updated Successfully";
        } catch (Exception e) {
            return "Customer Updated Failed";
        }
    }
    @RequestMapping(value = "deleteCustomer", method = RequestMethod.GET)
    public String deleteCustomer(Integer id) {
        try {
            customerService.deleteCustomer(id);
            return " customer deleted Successfully ";
        } catch (Exception e) {
            return "customer delete failed";
        }

    }
}