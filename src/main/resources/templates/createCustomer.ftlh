<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create a New Banking Customer</title>
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
    <h2>Create a New Customer</h2>

    <p>
        Enter the customer name and their city of residence.
    </p>

    <form method="POST">
        <label for="name">Customer Name</label>
        <input type="text" name="name" size="50"></input><br/>
        <label for="city">City</label>
        <input type="text" name="city" size="20"></input><br/>
        <input type="submit"></input>
    </form>

    <p><em>Thank you for visiting the Bank Liquidity Portal</em></p>

</body>
</html>