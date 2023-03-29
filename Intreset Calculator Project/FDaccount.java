package College;

import java.util.Scanner;

public class FDaccount extends Account {
    double FDinterestRate;
    double FDAmount;
    int noOfDays;
    int ageOfACHolder;
    double General, SCitizen;
    Scanner FDScanner = new Scanner(System.in);
    @Override
    double calculateInterest(double amount)
            throws interestcalculator.InvalidAgeException, interestcalculator.InvalidAmountException,
            interestcalculator.InvalidDaysException
    {
        this.FDAmount = amount;
        System.out.println("Enter FD days");
        noOfDays = FDScanner.nextInt();
        System.out.println("Enter FD age holder ");
        ageOfACHolder = FDScanner.nextInt();
        if (amount < 0) {
            throw new interestcalculator.InvalidAmountException();
        }
        if (noOfDays < 0) {
            throw new interestcalculator.InvalidDaysException();
        }
        if (ageOfACHolder < 0) {
            throw new interestcalculator.InvalidAgeException();
        }
        if (amount < 10000000) {
            if (noOfDays >= 7 && noOfDays <= 14) {
                General = 0.0450;
                SCitizen = 0.0500;
            }
            else if (noOfDays >= 15 && noOfDays <= 29) {
                General = 0.0470;
                SCitizen = 0.0525;
            }
            else if (noOfDays >= 30 && noOfDays <= 45) {
                General = 0.0550;
                SCitizen = 0.0600;
            }
            else if (noOfDays >= 45 && noOfDays <= 60) {
                General = 0.0700;
                SCitizen = 0.0750;
            }
            else if (noOfDays >= 61 && noOfDays <= 184) {
                General = 0.0750;
                SCitizen = 0.0800;
            }
            else if (noOfDays >= 185 && noOfDays <= 365) {
                General = 0.0800;
                SCitizen = 0.0850;
            }
            FDinterestRate
                    = (ageOfACHolder < 50) ? General : SCitizen;
        }
        else {
            if (noOfDays >= 7 && noOfDays <= 14) {
                FDinterestRate = 0.065;
            }
            else if (noOfDays >= 15 && noOfDays <= 29) {
                FDinterestRate = 0.0675;
            }
            else if (noOfDays >= 30 && noOfDays <= 45) {
                FDinterestRate = 0.00675;
            }
            else if (noOfDays >= 45 && noOfDays <= 60) {
                FDinterestRate = 0.080;
            }
            else if (noOfDays >= 61 && noOfDays <= 184) {
                FDinterestRate = 0.0850;
            }
            else if (noOfDays >= 185 && noOfDays <= 365) {
                FDinterestRate = 0.10;
            }
        }
        return FDAmount * FDinterestRate;
    }
}
