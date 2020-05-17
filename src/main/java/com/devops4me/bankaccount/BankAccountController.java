package com.devops4me.bankaccount;

import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
public class BankAccountController
{
    private BankAccountRepository bankAccountRepository;

    public BankAccountController(BankAccountRepository bankAccountRepository ){
        this.bankAccountRepository = bankAccountRepository;
    }

    @GetMapping(value = "/{holder}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, List<BankAccount>> holdersBankAccounts(
            @PathVariable("holder") String holder, Model model) {
        List<BankAccount> bankAccountList = bankAccountRepository.findByHolder(holder);
        return Collections.singletonMap(holder, bankAccountList);
    }

    @PostMapping("/{holder}")
    public String addToBankAccountList( @PathVariable("holder") String holder, BankAccount bankAccount){
        bankAccount.setHolder(holder);
        bankAccountRepository.save(bankAccount);
        return "redirect:/{holder}";
    }
}

