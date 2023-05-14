package com.example.Bank.Account.System.Repository;

import com.example.Bank.Account.System.Moudle.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query(value = "SELECT c.id FROM Customer c WHERE c.phone = :phone")
    Integer findIdByPhoneNumber(@Param("phone") String phone);

    @Query(value = "SELECT m FROM Customer m where m.id= :customerId")
    Customer getCustomerById(@Param("customerId") Integer id);
    @Modifying
   @Transactional
   @Query("UPDATE Customer c SET c.isActive=0  WHERE c.id = :id")
   void deleteCustomer(@Param("id") Integer id);


}