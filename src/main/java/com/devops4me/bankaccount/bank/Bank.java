package com.devops4me.bankaccount.bank;

/**
 * This class represents a Bank and is an Enum because not many a created in the course of a decade.
 */
public enum Bank
{
    LLOYDS ("Lloyds Bank Plc"          , "25 Gresham Street, London, UK"             ),
    HSBC   ("HSBC Plc"                 , "8 Canada Square, Canary Wharf, London, UK" ),
    RBS    ("Royal Bank of Scotland"   , "36 St Andrew Square, Edinburgh, UK"        ),
    UBS    ("Union Bank of Switzerland", "Bahnhofstrasse 45, Zürich, Switzerland"    ),
    BOI    ("Bank of India"            , "Bandra Kurla Complex, Mumbai, India"       ),
    ABC    ("Arab Banking Corporation" , "Diplomatic Area of Manama, Bahrain"        ),
    SBG    ("Standard Bank Group"      , "Standard Bank Centre, Johannesburg, SA"    );


    private final String bankName;
    private final String bankAddress;

    Bank( String bankName, String bankAddress )
    {
        this.bankName = bankName;
        this.bankAddress = bankAddress;
    }

    public String getBankName()
    {
        return bankName;
    }

    public String getBankAddress()
    {
        return bankAddress;
    }

}
