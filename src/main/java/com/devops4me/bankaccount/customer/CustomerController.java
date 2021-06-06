package com.devops4me.bankaccount.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/")
class CustomerController
{
    private CustomerRepository customerRepository;

    @Autowired
    CustomerController( CustomerRepository customerRepository ){
        this.customerRepository = customerRepository;
    }

    @RequestMapping(value = "/", method=RequestMethod.GET)
    String splashPage( Model model ) {
        List<Customer> customerList = customerRepository.findAllBy();
        if( customerList != null )
            model.addAttribute( "customers", customerList );
        return "listCustomers";
    }

    @RequestMapping(value = "/createCustomer", method=RequestMethod.GET)
    String createCustomerPage( Model model ) {
        return "createCustomer";
    }

    @RequestMapping( value = "/createCustomer", method=RequestMethod.POST )
    String createNewCustomer( Customer customer ) {
        customerRepository.save(customer);
        return "redirect:/";
    }

}

