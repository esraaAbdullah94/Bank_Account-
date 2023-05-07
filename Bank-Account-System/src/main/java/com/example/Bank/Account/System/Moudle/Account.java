package com.example.Bank.Account.System.Moudle;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class Account extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    Integer accountNumber;
    Double balance;
    @ManyToOne
    @JoinColumn(name="Customer_id",referencedColumnName = "id")
    Customer customer;


}