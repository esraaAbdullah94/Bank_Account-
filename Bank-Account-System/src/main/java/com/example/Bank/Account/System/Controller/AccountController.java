package com.example.Bank.Account.System.Controller;

import com.example.Bank.Account.System.RequestObject.AccountRequest;
import com.example.Bank.Account.System.RequestObject.AccountRequestForUpdate;
import com.example.Bank.Account.System.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

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

    @RequestMapping(value = "updateAccount", method = RequestMethod.POST)
    public String updateAccount(@RequestBody AccountRequestForUpdate accountRequestForUpdate)throws ParseException {
        try {
            accountService.updateAccount(accountRequestForUpdate);
            return " Account updated Successfully ";
        } catch (Exception e) {

            return "Account update failed";
        }

    }
    @RequestMapping(value = "deleteAccount", method = RequestMethod.GET)
    public String deleteAccount(Integer id){
        try {
            accountService.deleteAccount(id);
            return " Account deleted Successfully ";
        } catch (Exception e) {

            return "Account deletion failed";
        }
    }
///2. Retrieve the account balance for a specific account.
    @RequestMapping(value = "getBalanceForAccount", method = RequestMethod.GET)
        public double getBalanceForAccount(@RequestParam Integer id) {
            return accountService.getBalanceForAccount(id);
        }





}