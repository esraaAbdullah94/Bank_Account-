package com.example.Bank.Account.System.RequestObject;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class AccountRequest {

    Double balance;
    Integer accountNumber;
    String phone;
    String isActive;

}