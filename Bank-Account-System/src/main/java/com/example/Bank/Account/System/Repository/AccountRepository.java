package com.example.Bank.Account.System.Repository;


import com.example.Bank.Account.System.Moudle.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
    @Query("SELECT a from Account a")
    List<Account> getAllAccount();

    @Query("SELECT a from Account a where a.id= :accountId")
    Account getAccountById(@Param("accountId") Integer id);
}