package com.example.Bank.Account.System.Controller;

import com.example.Bank.Account.System.RequestObject.AccountRequest;
import com.example.Bank.Account.System.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "Account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @RequestMapping(value = "addAccount", method = RequestMethod.POST)
    public String addAccount(@RequestBody AccountRequest account) {
        try {
            accountService.addAccount(account);
            return "Account added Successfully";
        } catch (Exception e) {
            return "Account added Failed";
        }
    }



}