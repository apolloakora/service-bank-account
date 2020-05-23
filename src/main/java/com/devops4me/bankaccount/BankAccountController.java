package com.devops4me.bankaccount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class BankAccountController
{
    private BankAccountRepository bankAccountRepository;

    @Autowired
    public BankAccountController(BankAccountRepository bankAccountRepository ){
        this.bankAccountRepository = bankAccountRepository;
    }

    @RequestMapping(value = "/{holder}", method=RequestMethod.GET)
    public String holdersBankAccounts(
            @PathVariable("holder") String holder, Model model) {
        return "customerList";
//        List<BankAccount> bankAccountList = bankAccountRepository.findByHolder(holder);
//        return Collections.singletonMap(holder, bankAccountList);
    }

    @PostMapping("/{holder}")
    public String addToBankAccountList( @PathVariable("holder") String holder, BankAccount bankAccount){
        bankAccount.setHolder(holder);
        bankAccountRepository.save(bankAccount);
        return "redirect:/{holder}";
    }
}

