package com.devops4me.bankaccount.account;

import com.devops4me.bankaccount.customer.Customer;
import com.devops4me.bankaccount.customer.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
class BankAccountController
{
    private BankAccountRepository bankAccountRepository;
    private CustomerRepository customerRepository;

    @Autowired
    BankAccountController( BankAccountRepository bankAccountRepository, CustomerRepository customerRepository ){
        this.bankAccountRepository = bankAccountRepository;
        this.customerRepository = customerRepository;
    }

    @RequestMapping(value = "/addBankAccount/{customerId}", method=RequestMethod.GET)
    String addBankAccount( @PathVariable("customerId") Long customerId, Model model)
    {
        Customer customer = customerRepository.findCustomerById( customerId );
        model.addAttribute( "customer", customer );
        return "addBankAccount";
    }

    @PostMapping("/{holder}")
    String addToBankAccountList( @PathVariable("holder") String holder, BankAccount bankAccount){
        bankAccount.setHolder(holder);
        bankAccountRepository.save(bankAccount);
        return "redirect:/{holder}";
    }
}

