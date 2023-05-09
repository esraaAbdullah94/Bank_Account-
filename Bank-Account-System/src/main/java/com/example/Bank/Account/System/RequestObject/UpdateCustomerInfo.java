package com.example.Bank.Account.System.RequestObject;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class UpdateCustomerInfo {
    Integer id;
    String name;
    String email;
    String phone;
    String isActive;
}
