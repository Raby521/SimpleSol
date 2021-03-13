package com.mycompany.simplesol;

import java.text.DecimalFormat;

public class DPATSimpleSolution {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("####0.00");
        Interest 
        
        double balanceAmount;
        double interestLoan, interestCurrent, interestSavings;
        
        balanceAmount = 100000;
        System.out.println("Calculating CURRENT (" + df.format(balanceAmount) + "):-\n");
        interestCurrent = itrstCurrent.calculateInterest("CURRENT", balanceAmount);
        System.out.println("Current Interest per month: " + df.format(itrstCurrent.amountInterest("month", interestCurrent))); 
        System.out.println("Current Interest per quarter: " + df.format(itrstCurrent.amountInterest("quarter", interestCurrent))); 
        System.out.println("Current Interest per year: " + df.format(itrstCurrent.amountInterest("year", interestCurrent))); 
        
        balanceAmount = 200000;
        System.out.println("\nCalculating SAVINGS (" + df.format(balanceAmount) + "):-\n");
        interestSavings = itrstSavings.calculateInterest("SAVINGS", balanceAmount);
        System.out.println("Savings Interest per month: " + df.format(itrstSavings.amountInterest("month", interestSavings))); 
        System.out.println("Savings Interest per quarter: " + df.format(itrstSavings.amountInterest("quarter", interestSavings))); 
        System.out.println("Savings Interest per year: " + df.format(itrstSavings.amountInterest("year", interestSavings))); 
        
        balanceAmount = 300000;
        System.out.println("\nCalculating LOAN (" + df.format(balanceAmount) + "):-\n");
        interestLoan = itrstLoan.calculateInterest("LOAN", balanceAmount);
        System.out.println("Loan Interest per month: " + df.format(itrstLoan.amountInterest("month", interestLoan))); 
        System.out.println("Loan Interest per quarter: " + df.format(itrstLoan.amountInterest("quarter", interestLoan))); 
        System.out.println("Loan Interest per year: " + df.format(itrstLoan.amountInterest("year", interestLoan))); 
    }
}
