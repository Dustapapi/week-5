import java.util.Scanner;

public class Fd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double feeRate = 0.005; 
        int count = 1;

        while (count <= 3) {  
            System.out.println("----- Fixed Deposit " + count + " -----");

            System.out.print("Enter Principal (min 1000): ");
            double P = sc.nextDouble();

            System.out.print("Enter Annual Interest Rate (8 to 12): ");
            double annualRate = sc.nextDouble();

            System.out.print("Enter Duration in Years (max 5): ");
            int years = sc.nextInt();

            double monthlyRate = annualRate / 12 / 100;
            int months = years * 12;

            
            double A = P * Math.pow(1 + monthlyRate, months);

            
            double fee = A * feeRate;

            
            double finalAmount = A - fee;

            
            System.out.println("Monthly Rate = " + monthlyRate);
            System.out.println("Months = " + months);
            System.out.println("Maturity Amount (A) = Rs. " + String.format("%.2f", A));
            System.out.println("Processing Fee (0.5%) = Rs. " + String.format("%.2f", fee));
            System.out.println("Final Amount = Rs. " + String.format("%.2f", finalAmount));
            System.out.println();

            count++;
        }

        
    }
}
