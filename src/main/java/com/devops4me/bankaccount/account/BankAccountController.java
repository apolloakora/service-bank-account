package com.devops4me.bankaccount.account;

import com.devops4me.bankaccount.BankAccountApplication;
import com.devops4me.bankaccount.bank.Bank;
import com.devops4me.bankaccount.customer.Customer;
import com.devops4me.bankaccount.customer.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private static final Logger LOGGER= LoggerFactory.getLogger( BankAccountController.class );

    @Autowired
    BankAccountController( BankAccountRepository bankAccountRepository, CustomerRepository customerRepository ){
        this.bankAccountRepository = bankAccountRepository;
        this.customerRepository = customerRepository;
    }

    @RequestMapping(value = "/createBankAccount/{customerId}", method=RequestMethod.GET)
    String bankAccountCreation( @PathVariable("customerId") Long customerId, Model model)
    {
        Customer customer = customerRepository.findCustomerById( customerId );
        model.addAttribute( "customer", customer );
        model.addAttribute( "banks", Bank.values() );
        LOGGER.info( "Request received to add a bank account for {} ID [{}].", customer.getName(), customerId );
        return "createBankAccount";
    }

    @RequestMapping( value = "/createBankAccount/{customerId}", method=RequestMethod.POST )
    String createBankAccount( @PathVariable("customerId") Long customerId, BankAccount bankAccount ) {
        bankAccount.setCustomerId( customerId );
        Bank bank = Bank.valueOf( bankAccount.getBankCode() );
        LOGGER.info( "Adding new BankAccount {} with {}", bankAccount, bank.getBankName() );
        bankAccountRepository.save( bankAccount );
        return "redirect:/";
    }

}

