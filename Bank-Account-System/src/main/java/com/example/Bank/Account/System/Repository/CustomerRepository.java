package com.example.Bank.Account.System.Repository;

import com.example.Bank.Account.System.Moudle.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query(value = "SELECT c.id FROM Customer c WHERE c.phone = :phone")
    Integer findIdByPhoneNumber(@Param("phone") String phone);



}