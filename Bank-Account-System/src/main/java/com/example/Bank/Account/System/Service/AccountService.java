package com.example.Bank.Account.System.Service;

import com.example.Bank.Account.System.Moudle.Account;
import com.example.Bank.Account.System.Moudle.Customer;
import com.example.Bank.Account.System.Repository.AccountRepository;
import com.example.Bank.Account.System.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private CustomerRepository customerRepository;

    // function to create new Account (createAccount)
    public void createAccount(Integer accountNumber, Double balance, Integer customerID) {
        Account account = new Account(); // create object
        account.setAccountNumber(accountNumber);
        account.setBalance(balance);
        account.setCreatedDate(new Date()); // give current date
        account.setUpdatedDate(new Date()); // give current date
        account.setIsActive(Boolean.TRUE);
        Customer customer = customerRepository.findById(customerID).get();
        account.setCustomer(customer);
        accountRepository.save(account);
    }
}