package com.example.Bank.Account.System.Repository;


import com.example.Bank.Account.System.Moudle.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

    @Query(value = "SELECT id FROM customer WHERE phone = :phone", nativeQuery = true)
    Integer findIdByPhoneNumber(@Param("phone") String phone);

    @Query(value = "Select a.balance From Account a WHERE a.id = :id")
    Double getBalanceForAccount(@Param("id") Integer id);

}