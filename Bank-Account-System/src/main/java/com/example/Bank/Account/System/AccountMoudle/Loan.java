package com.example.Bank.Account.System.AccountMoudle;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data

public class Loan extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    Double amount;
    Double interestRate;

    @OneToOne
    @JoinColumn(name = "Customer_ID", referencedColumnName = "id")
    Customer customer;

}