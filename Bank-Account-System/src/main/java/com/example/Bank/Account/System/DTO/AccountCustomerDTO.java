package com.example.Bank.Account.System.DTO;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter

public class AccountCustomerDTO {


    public AccountCustomerDTO(Integer id, Double amount, Integer accountNumber, Date createdDate, Integer customerId) {
        this.id = id;
        this.amount = amount;
        this.accountNumber = accountNumber;
        this.createdDate = createdDate;
        this.customerId = customerId;
    }
    private Integer id;
    private Double amount ;

    private Integer accountNumber;
    private Date createdDate;
    private Integer customerId;

}
