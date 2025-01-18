package cw2.q1;

import java.util.*;
import java.math.*;

public class CW2Q1 {

    public static void main(String[] args) {

        double adminFee, amount;
        String currencyType;
        char answer;
        boolean displayPrompt = true;
        Scanner input = new Scanner(System.in);

        do {
            do { // Prevent infinite loop
                System.out.println("Enter currency type (USD or SGD): ");
                currencyType = input.nextLine().toUpperCase();
                displayPrompt = false;
            } while (displayPrompt);

            switch (currencyType) {
                case "USD": {
                    System.out.println("You've picked USD.");
                    System.out.println("Enter exchange rate (MYR): ");
                    String exchange = input.nextLine().toUpperCase();

                    if (exchange.equals("MYR")) {
                        System.out.println("You've picked MYR.");
                        try {
                            System.out.println("Enter amount: ");
                            amount = input.nextDouble();
                            input.nextLine(); // Prevent StringIndexOutOfBoundsException

                            if (amount > 0) {
                                double exchangedAmount = amount * 4.71;
                                if (exchangedAmount <= 2000)
                                    adminFee = exchangedAmount * 0.0025;
                                else if (exchangedAmount <= 5000)
                                    adminFee = exchangedAmount * 0.005;
                                else if (exchangedAmount <= 10000)
                                    adminFee = exchangedAmount * 0.0075;
                                else
                                    adminFee = exchangedAmount * 0.01;

                                double total = adminFee + exchangedAmount;

                                BigDecimal bd = new BigDecimal(total).setScale(2, RoundingMode.HALF_UP);
                                BigDecimal bd1 = new BigDecimal(adminFee).setScale(2, RoundingMode.HALF_UP);
                                BigDecimal bd2 = new BigDecimal(exchangedAmount).setScale(2, RoundingMode.HALF_UP);

                                double roundedTotal = bd.doubleValue();
                                double roundedAdmin = bd1.doubleValue();
                                double roundedExchanged = bd2.doubleValue();

                                int hyphenCount = 42 + Double.toString(roundedTotal).length();

                                System.out.println("\t\tExchange Results\n");
                                System.out.println("Description\t\t\t\tAmount");
                                for (int i = 0; i <= hyphenCount; i++) {
                                    System.out.print("-");
                                }
                                System.out.println("\nUnited States Dollar \t\t\t$ " + amount);
                                System.out.println("Exchange Rate @ 1 USD = 4.71 MYR");
                                System.out.println("Malaysian Ringgit \t\t\tRM " + roundedExchanged);
                                System.out.println("Admin Fee(s) \t\t\t\tRM " + roundedAdmin);
                                for (int i = 0; i <= hyphenCount; i++) {
                                    System.out.print("-");
                                }
                                System.out.println("\nTOTAL \t\t\t\t\tRM " + roundedTotal);
                                for (int i = 0; i <= hyphenCount; i++) {
                                    System.out.print("-");
                                }
                            } else {
                                System.out.println("Invalid amount, try again!");
                            }
                        } catch (InputMismatchException ex) {
                            System.out.println("Invalid amount, try again!");
                            input.nextLine(); // Consume invalid input
                        }
                    } else {
                        System.out.println("Invalid exchange rate, please enter again!");
                    }
                    break;
                }
                case "SGD": {
                    System.out.println("You've picked SGD.");
                    System.out.println("Enter exchange rate (MYR): ");
                    String exchange = input.nextLine().toUpperCase();

                    if (exchange.equals("MYR")) {
                        System.out.println("You've picked MYR.");
                        try {
                            System.out.println("Enter amount: ");
                            amount = input.nextDouble();
                            input.nextLine();

                            if (amount > 0) {
                                double exchangedAmount = amount * 3.53;
                                if (exchangedAmount <= 2000)
                                    adminFee = exchangedAmount * 0.0025;
                                else if (exchangedAmount <= 5000)
                                    adminFee = exchangedAmount * 0.005;
                                else if (exchangedAmount <= 10000)
                                    adminFee = exchangedAmount * 0.0075;
                                else
                                    adminFee = exchangedAmount * 0.01;

                                double total = adminFee + exchangedAmount;

                                BigDecimal bd = new BigDecimal(total).setScale(2, RoundingMode.HALF_UP);
                                BigDecimal bd1 = new BigDecimal(adminFee).setScale(2, RoundingMode.HALF_UP);
                                BigDecimal bd2 = new BigDecimal(exchangedAmount).setScale(2, RoundingMode.HALF_UP);

                                double roundedTotal = bd.doubleValue();
                                double roundedAdmin = bd1.doubleValue();
                                double roundedExchanged = bd2.doubleValue();

                                int hyphenCount = 42 + Double.toString(roundedTotal).length();

                                System.out.println("\t\tExchange Results\n");
                                System.out.println("Description\t\t\t\tAmount");
                                for (int i = 0; i <= hyphenCount; i++) {
                                    System.out.print("-");
                                }
                                System.out.println("\nSingapore Dollar \t\t\tS$ " + amount);
                                System.out.println("Exchange Rate @ 1 SGD = 3.53 MYR");
                                System.out.println("Malaysian Ringgit \t\t\tRM " + roundedExchanged);
                                System.out.println("Admin Fee(s) \t\t\t\tRM " + roundedAdmin);
                                for (int i = 0; i <= hyphenCount; i++) {
                                    System.out.print("-");
                                }
                                System.out.println("\nTOTAL \t\t\t\t\tRM " + roundedTotal);
                                for (int i = 0; i <= hyphenCount; i++) {
                                    System.out.print("-");
                                }
                            } else {
                                System.out.println("Invalid amount, please try again!");
                            }
                        } catch (InputMismatchException ex) {
                            System.out.println("Invalid amount, try again!");
                            input.nextLine();
                        }
                    } else {
                        System.out.println("Invalid exchange rate, please enter again!");
                    }
                    break;
                }
                default: {
                    System.out.println("Invalid currency type, please try again!");
                    break;
                }
            }

            System.out.println("\nDo you want to continue? (Y/N)");
            answer = input.nextLine().toUpperCase().charAt(0);
            if (answer == 'Y')
                displayPrompt = true;

        } while (answer != 'N');
    }
}
