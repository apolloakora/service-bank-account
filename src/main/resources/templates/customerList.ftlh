<!DOCTYPE html>
<html>
<head>
    <title>Welcome to Bank Liquidity Portal!</title>
    <style>
        body
        {
            width: 35em;
            margin: 0 auto;
            font-family: Tahoma, Verdana, Arial, sans-serif;
        }
    </style>
</head>
<body>
    <h1>Bank Liquidity Portal</h1>

    <ul>
        <li><strong><a href="/createCustomer">Create New Customer</a></strong></li>
    </ul>

<#if customers?has_content>
    <div>
        <table style="width:100%">
            <tr>
                <th style="text-align:left">Customer Name</th>
                <th style="text-align:left">City of Residence</th>
                <th style="text-align:left">Total Balance</th>
                <th style="text-align:left">&nbsp;</th>
            </tr>
            <#list customers as customer>
            <tr>
                <td>${customer.name}</td>
                <td>${customer.city}</td>
                <td>£0.00</td>
                <td><strong><a href="/addBankAccount/${customer.id}">Add Bank Account</a></strong></td>
            </tr>
            </#list>
        </table>
    </div>
</#if>

    <p><em>Thank you for visiting the Bank Liquidity Portal</em></p>
</body>
</html>
