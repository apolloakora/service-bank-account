package com.devops4me.bankaccount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/")
public class CustomerController
{
    private CustomerRepository customerRepository;

    @Autowired
    public CustomerController( CustomerRepository customerRepository ){
        this.customerRepository = customerRepository;
    }

    @RequestMapping(value = "/", method=RequestMethod.GET)
    public String splashPage( Model model ) {
        List<Customer> customerList = customerRepository.findAllBy();
        if( customerList != null )
            model.addAttribute( "customers", customerList );
        return "bankAccountList";
//        List<BankAccount> bankAccountList = bankAccountRepository.findByHolder(holder);
//        return Collections.singletonMap(holder, bankAccountList);
    }

    @RequestMapping(value = "/createCustomer", method=RequestMethod.GET)
    public String createCustomerPage( Model model ) {
        return "createCustomer";
//        List<BankAccount> bankAccountList = bankAccountRepository.findByHolder(holder);
//        return Collections.singletonMap(holder, bankAccountList);
    }

    @RequestMapping( value = "/createCustomer", method=RequestMethod.POST )
    public String createNewCustomer( Customer customer ) {
        customerRepository.save(customer);
        return "redirect:/";
//        List<BankAccount> bankAccountList = bankAccountRepository.findByHolder(holder);
//        return Collections.singletonMap(holder, bankAccountList);
    }

}

