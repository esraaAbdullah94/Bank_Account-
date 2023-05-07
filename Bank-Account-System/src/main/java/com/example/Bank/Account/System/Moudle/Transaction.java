package com.example.Bank.Account.System.Moudle;

import lombok.Data;
import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "account_transaction")
public class Transaction extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    Double amount;

    Date TransactionDate;

    @ManyToOne // Many transaction to one credit card
    @JoinColumn(name = "creditCard_id", referencedColumnName = "id")
    CreditCard creditCard;
}