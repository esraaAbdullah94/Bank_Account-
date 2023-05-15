package com.example.Bank.Account.System.Service;

import com.example.Bank.Account.System.Moudle.Account;
import com.example.Bank.Account.System.Moudle.Customer;
import com.example.Bank.Account.System.Repository.CustomerRepository;
import com.example.Bank.Account.System.RequestObject.UpdateCustomerInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
import java.util.List;

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
    public void deleteCustomer(Integer id) {
        customerRepository.deleteCustomer(id);
    }
    public List<Account> getCustomerAccounts(Integer customerId) {
        Customer customer = customerRepository.getCustomerById(customerId);
        List<Account> accounts = customerRepository.getAccountsByCustomer(customer);
        for (Account account : accounts) {
            account.getCustomer().getName();
            account.getCustomer().getEmail();
            account.getCustomer().getPhone();
            account.getId();
            account.getAccountNumber();

        }
        return accounts;
    }

}