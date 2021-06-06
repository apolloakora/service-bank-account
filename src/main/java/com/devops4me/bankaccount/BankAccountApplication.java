package com.devops4me.bankaccount;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
public class BankAccountApplication
{
    private static final Logger LOGGER= LoggerFactory.getLogger( BankAccountApplication.class );
    public static void main(String[] args)
    {
        try
        {
            LOGGER.info("Running Bank Account app on {} with user {}", InetAddress.getLocalHost().getHostName(), System.getProperty("user.name") );
        } catch (UnknownHostException e)
        {
            e.printStackTrace();
        }

        SpringApplication.run(BankAccountApplication.class, args);
    }
}
