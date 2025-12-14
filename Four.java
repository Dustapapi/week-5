
import java.util.Scanner;

public class Four {
    public static void main(String[] args) {

        int scores[] = {10, 20, 30, 40, 50};
        System.out.println("Static Scores:");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + (sum / scores.length));
        int highest = scores[0];
        int lowest = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > highest) highest = scores[i];
            if (scores[i] < lowest) lowest = scores[i];
        }

        System.out.println("Highest = " + highest);
        System.out.println("Lowest = " + lowest);
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter number of subjects: ");
        int n = sc.nextInt();

        int newScores[] = new int[n];

        System.out.println("Enter scores:");
        for (int i = 0; i < n; i++) {
            newScores[i] = sc.nextInt();
        }

        System.out.println("\nUpdated Scores:");
        for (int i = 0; i < n; i++) {
            System.out.println(newScores[i]);
        }
    }
}