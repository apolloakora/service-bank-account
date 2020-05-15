package com.devops4me.bankaccount;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BankAccountRepository extends JpaRepository<BankAccount, Long>
{
    List<BankAccount> findByHolder(String holder );
}
