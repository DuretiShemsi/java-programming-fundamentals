package com.shemsi.loan;
public class CarLoanPayment {

    public static void main(String[] args) {
        // Initial values
        double carLoan = 20000;
        double loanLength = 3;
        double interestRate = 0.03;
        double downPayment = 3000;

        // Validation
        if (loanLength <= 0) {
            System.out.println("Error: loan length must be greater than zero.");
            return;
        }
        if (interestRate <= 0) {
            System.out.println("Error: interest rate must be greater than zero.");
            return;
        }
        if (downPayment > carLoan) {
            System.out.println("Error: down payment can not be greater than car loan.");
            return;
        }

        // Paid in full condition
        if (downPayment == carLoan) {
            System.out.println("Car loan is paid in full.");
            return;
        }

        // Car loan month payment calculation
        double remainingBalance = carLoan - downPayment;
        double lengthInMonths = loanLength * 12;
        double monthlyPaymentWithoutInterest = remainingBalance / lengthInMonths;
        double interest = remainingBalance * interestRate / 12;
        double monthlyPayment = monthlyPaymentWithoutInterest + interest;

        // Print monthly payment amount
        System.out.println("Monthly payment: $" + monthlyPayment);

        // Extend the program
        // Prompt user for values instead of using default values
		        /*
		        Scanner input = new Scanner(System.in);
		        System.out.print("Enter car loan amount: ");
		        carLoan = input.nextDouble();
		        System.out.print("Enter loan length (in years): ");
		        loanLength = input.nextDouble();
		        System.out.print("Enter interest rate: ");
		        interestRate = input.nextDouble();
		        System.out.print("Enter down payment: ");
		        downPayment = input.nextDouble();
		        input.close();
		        */
    }


}


