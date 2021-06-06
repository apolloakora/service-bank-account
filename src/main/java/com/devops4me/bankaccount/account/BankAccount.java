package com.devops4me.bankaccount.account;

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

    private Long customerId;
    private String ibanNumber;
    private String bankCode;
    private Double overdraftLimit;
    private Double balance;

    public String getBankCode()
    {
        return bankCode;
    }

    public void setBankCode(String bankCode)
    {
        this.bankCode = bankCode;
    }

    public Double getOverdraftLimit()
    {
        return overdraftLimit;
    }

    public void setOverdraftLimit(Double overdraftLimit)
    {
        this.overdraftLimit = overdraftLimit;
    }

    public Long getCustomerId()
    {
        return customerId;
    }

    public void setCustomerId( Long customerId )
    {
        this.customerId = customerId;
    }

    public String getIbanNumber()
    {
        return ibanNumber;
    }

    public void setIbanNumber(String ibanNumber)
    {
        this.ibanNumber = ibanNumber;
    }

    public Double getBalance()
    {
        return balance;
    }

    public void setBalance(Double balance)
    {
        this.balance = balance;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String toString()
    {
        return "[IBAN " + ibanNumber + "] [Person ID " + customerId + "] Bank Code [" + bankCode + "] Balance [" + balance + "]";
    }

}
