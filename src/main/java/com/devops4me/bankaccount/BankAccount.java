package com.devops4me.bankaccount;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BankAccount
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String holder;
    private String ibanNumber;
    private String bankId;
    private Double overdraftLimit;
    private Double balance;

    public String getHolder() {
        return holder;
    }

    public void setHolder(String accountHolderName) {
        this.holder = accountHolderName;
    }

    public String getIbanNumber() {
        return ibanNumber;
    }

    public void setIbanNumber(String accountNumber) {
        this.ibanNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double accountBalance) {
        this.balance = accountBalance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }



}
