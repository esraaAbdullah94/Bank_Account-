package com.example.Bank.Account.System.Moudle;

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