package com.devops4me.bankaccount;

import lombok.Data;

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
    private String accountSortcode;
    private String accountNumber;
    private Double accountBalance;

    public String getHolder() {
        return holder;
    }

    public void setHolder(String accountHolderName) {
        this.holder = accountHolderName;
    }

    public String getAccountSortcode() {
        return accountSortcode;
    }

    public void setAccountSortcode(String accountSortcode) {
        this.accountSortcode = accountSortcode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }



}
