package com.mycompany.simplesol;

public class Interest {
    //Monthly interest rate is annual rate / 12 months.
    //All interest amount is round up to 2 decimal places later
    //All interest rate is fixed
    //Interest amount are viewed monthly, quarterly or yearly
      
    public double calculateInterest(String accountType, double accountBalance) {
        switch (accountType) {
            case "CURRENT": 
                return accountBalance * (0.02 / 12); 

            case "SAVINGS": 
                return accountBalance * (0.04 / 12);

            case "LOAN": 
                return accountBalance * (0.1 / 12);

            default:
                return 0;
        }
    }
    
    public double amountInterest(String period, double interest) {
        switch (period) {
            case "month":
                return interest;
            
            case "quarter": 
                return interest * 4;

            case "year": 
                return interest * 12;

            default:
                return 0;
        }
    }
}
