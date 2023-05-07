package com.example.Bank.Account.System.AccountMoudle;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class Customer extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;
    String email;
    String phone;


}