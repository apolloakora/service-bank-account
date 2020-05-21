package com.devops4me.bankaccount;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>
{
    List<Customer> findCustomerByCity( String city );
    List<Customer> findAllBy();
}
