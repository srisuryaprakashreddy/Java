package College;

import java.util.Scanner;

class SBaccount extends Account {
    double SBamount, SbInterestRate, interest;
    Scanner SBScanner = new Scanner(System.in);
    @Override
    double calculateInterest(double amount)
            throws interestcalculator.InvalidAmountException
    {
        this.SBamount = amount;
        if (SBamount < 0) {
            throw new interestcalculator.InvalidAmountException();
        }
        System.out.println(
                "Select account type \n1. senior citizen \n2. Normal ");
        int accountChoice = SBScanner.nextInt();
        switch (accountChoice) {
            case 1:
                SbInterestRate = .06;
                break;
            case 2:
                SbInterestRate = .04;
                break;
            default:
                System.out.println(
                        "Please choose right account again");
        }
        return amount * SbInterestRate;
    }
}
