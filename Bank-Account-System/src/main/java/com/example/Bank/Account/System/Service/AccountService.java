package com.example.Bank.Account.System.Service;

import com.example.Bank.Account.System.Moudle.Account;
import com.example.Bank.Account.System.Moudle.Customer;
import com.example.Bank.Account.System.Repository.AccountRepository;
import com.example.Bank.Account.System.Repository.CustomerRepository;
import com.example.Bank.Account.System.RequestObject.AccountRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service


public class AccountService {

    @Autowired
    AccountRepository accountRepository;
    @Autowired
    CustomerRepository customerRepository;

    public void addAccount(AccountRequest account) {
        Double interestVariable = 2.5; // variable for interest
        Account accountInfo = new Account();
        accountInfo.setAccountNumber(account.getAccountNumber());
        accountInfo.setBalance(account.getBalance());
        accountInfo.setInterest(account.getBalance() * interestVariable); // balance * interest Variable to get the profit
        Integer id = customerRepository.findIdByPhoneNumber(account.getPhone()); // find ID by unique variable (Phone)
        Customer customerId = customerRepository.findById(id).get();
        accountInfo.setCustomer(customerId);
        accountInfo.setIsActive(account.getIsActive());
        accountRepository.save(accountInfo);

    }
}