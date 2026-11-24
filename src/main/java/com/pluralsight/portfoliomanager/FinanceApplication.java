package com.pluralsight.portfoliomanager;

import com.pluralsight.portfoliomanager.model.*;

import java.math.BigDecimal;
import java.util.ArrayList;

public class FinanceApplication {
    public static void main(String[] args) {
        House house = new House("Ranch house", new BigDecimal("325000.00"), 1998, 1850, 3);
        Gold gold = new Gold("Gold coins", new BigDecimal("12000.00"), 5.0);
        Jewelry ring = new Jewelry("Grandma's ring", new BigDecimal("2500.00"), 14.0);

        System.out.println(house.getName() + ": $" + house.getValue());
        System.out.println(gold.getName() + ": $" + gold.getValue());
        System.out.println(ring.getName() + ": $" + ring.getValue());

        BankAccount account1 = new BankAccount(123, "Pam", new BigDecimal("12500"));
        //Valuable account2 = new BankAccount(456, "Gary", new BigDecimal("1500"));
        // try to deposit money into both accounts
        account1.deposit(BigDecimal.valueOf(100));
        //account2.deposit(100);

        House house1 = new House("Ram Ranch", new BigDecimal("3250000.00"), 2016, 4500, 18);
        Gold gold1 = new Gold("Schemckles", new BigDecimal("500.00"), 4);
        Jewelry ring1 = new Jewelry("Eye of Agammoto", new BigDecimal("100000000000000.00"), 48);
        BankAccount bankAccount1 = new BankAccount(123456, "Peter", new BigDecimal("69.00"));
        CreditCard creditCard1 = new CreditCard(1234, "Peter's card", new BigDecimal("23.45"));

        Portfolio portfolio1 = new Portfolio("Peter's portfolio", "Peter", new ArrayList<>());
        portfolio1.add(house1);
        portfolio1.add(gold1);
        portfolio1.add(ring1);
        portfolio1.add(bankAccount1);
        portfolio1.add(creditCard1);

        System.out.println(portfolio1.getValue());

        Valuable mostValuable = portfolio1.getMostValuable();
        Valuable leastValuable = portfolio1.getLeastValuable();

        System.out.println(mostValuable.getValue());
        System.out.println(leastValuable.getValue());

    }
}
