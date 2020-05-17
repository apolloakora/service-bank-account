package com.devops4me.bankaccount.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface BankAccountRepository extends JpaRepository<BankAccount, Long>
{
    List<BankAccount> findByHolder(String holder);
}
