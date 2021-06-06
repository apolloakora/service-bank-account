<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create a Bank Account for ${customer.name}</title>
    <style>
        body {
            width: 35em;
            margin: 0 auto;
            font-family: Tahoma, Verdana, Arial, sans-serif;
        }
    </style>
</head>
<body>
    <h1>Bank Liquidity Portal</h1>
    <h2>Create Bank Account for ${customer.name}</h2>

    <p>
        Please select the bank, enter the IBAN and the initial bank account balance.
    </p>

    <form method="POST">
        <label for="bankCode">Which bank is the account with?</label>
        <select name="bankCode" id="bankCode">
            <#list banks as bank>
            <option value="${bank}">${bank.bankName}</option>
            </#list>
        </select><br/>
        <label for="ibanNumber">IBAN Number</label>
        <input type="text" name="ibanNumber" size="50"></input><br/>
        <label for="overdraftLimit">Overdraft Limit</label>
        <input type="text" name="overdraftLimit" size="20"></input><br/><br/>
        <label for="balance">Initial Balance</label>
        <input type="text" name="balance" size="20"></input><br/><br/>
        <input type="submit">Submit New  Bank Account</input>
    </form>

    <p><em>Thank you for visiting the Bank Liquidity Portal</em></p>

</body>
</html>