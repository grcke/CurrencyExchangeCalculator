# CurrencyExchangeCalculator
Write a Java application that prompts the user to input the currency type (e.g., SGD, USD, etc), the amount, and the exchange rate (to MYR), and then calculates the result of the currency exchange. Note that all currency exchanges require the payment of an admin fee based on the following scheme:

| Exchange Result (MYR)   | Admin Fee (%) |
|--------------------------|---------------|
| 0 – 2000                | 0.25%         |
| 2000.01 – 5000.00       | 0.5%          |
| 5000.01 – 10000.00      | 0.75%         |
| Above 10000             | 1.0%          |

Your program should obtain the necessary input from the user and display the exchange result after adding the admin fee to the user. You may choose either the command line or the GUI for input and output activities. All user inputs must be validated before the calculation process.

