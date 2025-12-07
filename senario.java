import java.util.Scanner;

/**
 * Write a description of class senario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class senario
{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String choice = "yes"; 

while (choice.equalsIgnoreCase("yes")) {

            System.out.println("Fixed Deposit Calculation (NIB)");
            System.out.print("Enter deposit amount (min Rs.1000): ");
            double P = scan.nextDouble();
            if (P < 1000) {
                System.out.println("Error: Minimum deposit is Rs. 1000");
                continue;
            }
            System.out.print("Enter annual interest rate (8–12%): ");
            double annualRate = scan.nextDouble();

            if (annualRate < 8 || annualRate > 12) {
                System.out.println("Error: Interest rate must be between 8% and 12%");
                continue;
            }
            System.out.print("Enter duration in years (max 5 years): ");
            int years = scan.nextInt();
            if (years > 5 || years <= 0) {
                System.out.println("Error: Duration must be between 1 and 5 years");
                continue;
            }
            double monthlyRate = annualRate / 12 / 100;  
            int months = years * 12;
            double A = P * Math.pow((1 + monthlyRate), months);
            double feeRate = 0.005; 
            double fee = A * feeRate;
            double finalAmount = A - fee;
            System.out.println("---- FD Summary --------");
            System.out.println("Principal (P): Rs. " + P);
            System.out.println("Annual Rate: " + annualRate + "%");
            System.out.println("Monthly Rate: " + monthlyRate);
            System.out.println("Duration: " + years + " years (" + months + " months)");
            System.out.println("Maturity Amount (Before Fee): Rs. " + A);
            System.out.println("Processing Fee (0.5%): Rs. " + fee);
            System.out.println("Final Amount Received: Rs. " + finalAmount);
            System.out.print("Do you want to calculate another FD? (yes/no): ");
            choice = scan.next();
        }

    }
}