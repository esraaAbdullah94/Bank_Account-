package com.example.Bank.Account.System.Repository;

import com.example.Bank.Account.System.Moudle.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    @Query("SELECT c from Customer c where c.id= :customerId")
    Customer getCustomerById(@Param("customerId") Integer id);

    @Query("SELECT c from Customer c")
    List<Customer> getAllCustomer();



}