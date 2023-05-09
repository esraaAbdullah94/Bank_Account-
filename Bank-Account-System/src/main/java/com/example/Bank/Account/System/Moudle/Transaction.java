package com.example.Bank.Account.System.Moudle;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Data
@Entity
@Table(name = "account_Transaction")
public class Transaction extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    Double amount;

    @ManyToOne
    @JoinColumn(name = "accountId", referencedColumnName = "id")
    Account account; // many Transaction to one Account

}