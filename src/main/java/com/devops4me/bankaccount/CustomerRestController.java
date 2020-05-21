package com.devops4me.bankaccount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerRestController {

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerRestController( CustomerRepository customerRepository ){
        this.customerRepository = customerRepository;
    }

    @GetMapping("/createRestCustomer")
    public Customer createNewCustomer( @RequestParam(value = "city", defaultValue = "Birmingham") String city ) {
        Customer newCustomer = new Customer();
        newCustomer.setName("Joe Bloggs");
        newCustomer.setCity( city );
        customerRepository.save( newCustomer );
        return newCustomer;
    }


}
