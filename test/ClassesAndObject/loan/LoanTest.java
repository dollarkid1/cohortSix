package ClassesAndObject.loan;
import java.util.Scanner;

class LoanTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter annual interest rate, for example, 8.25: ");
        double annualInterestRate = input.nextDouble();

        System.out.println("Enter number of years as an integer: ");
        int numberOfYears = input.nextInt();

        System.out.println("Enter loan amount, for example, 120000.95: ");
        double loanAmount = input.nextDouble();

        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        System.out.printf("""
                        The loan was created on %s
                        The monthly payment is %.2f
                        """,
                loan.getLoanDate().toString(), loan.getMonthlyPayment(),
                loan.getTotalPayment());


    }

}


//    @DisplayName(" User can take loan")
//    void userCanEnterInfo1(){
//
//        // Enter annual interest rate
//        System.out.print("Enter annual interest rate, for example, 8.25: ");
//        loan.annualInterestRate = input.nextDouble();
//
//        // Enter number of years
//        System.out.println("Enter number of years as an integer: ");
//        loan.numberOfYears = input.nextInt();
//
//        // Enter loan amount
//        System.out.println("Enter loan amount, for example, 120000.95: ");
//        loan.loanAmount = input.nextDouble();
//
//        // Create a Loan object
//        loan = new Loan(annualInterestRate, numberOfYears, loanAmount);
//
//
//    }