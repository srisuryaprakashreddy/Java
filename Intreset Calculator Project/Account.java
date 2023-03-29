
package College;
public abstract class Account {

    double interestRate;
    double amount;

    abstract double calculateInterest(double amount)


            throws interestcalculator.InvalidMonthsException, interestcalculator.InvalidAgeException,
            interestcalculator.InvalidAmountException, interestcalculator.InvalidDaysException;
}
