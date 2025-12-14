
import java.util.Scanner;

public class Five {
    public static void main(String[] args) {

        
        String[] districts = {"Morang", "Kathmandu", "Kaski", "Sindhuli"};
        System.out.println("Default Districts:");
        for (int i = 0; i < districts.length; i++) {
            System.out.println((i + 1) + ". " + districts[i]);
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number of districts: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] newDistricts = new String[n];
        System.out.println("yaha  jilla ko naam:");
        for (int g= 0; g < n; g++) {
            System.out.print("District " + (g + 1) + ": ");
            newDistricts[g] = sc.nextLine();
        }
        System.out.println("\nNaya jilla ko List:");
        for (int s = 0; s < newDistricts.length; s++) {
            System.out.println((s + 1) + ". " + newDistricts[s]);
        }

    
    }
}
