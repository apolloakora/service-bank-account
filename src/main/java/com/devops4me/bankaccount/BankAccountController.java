package com.devops4me.bankaccount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/")
public class BankAccountController
{
    private BankAccountRepository bankAccountRepository;

    @Autowired
    public BankAccountController( BankAccountRepository bankAccountRepository ){
        this.bankAccountRepository = bankAccountRepository;
    }

    @RequestMapping(value="/{holder}", method = RequestMethod.GET )
    public String holdersBankAccounts(
            @PathVariable("holder") String holder, Model model) {
        List<BankAccount> bankAccountList = bankAccountRepository.findByHolder(holder);
        if (bankAccountList != null) {
            model.addAttribute("accounts", bankAccountList);
        }
        return "bankAccountList";
    }
    @RequestMapping(value="/{holder}", method = RequestMethod.POST )
    public String addToBankAccountList( @PathVariable("holder") String holder, BankAccount bankAccount){
        bankAccount.setHolder(holder);
        bankAccountRepository.save(bankAccount);
        return "redirect:/{holder}";
    }
}

