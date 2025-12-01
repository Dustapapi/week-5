import java.util.Scanner;

/**
 * Write a description of class Qfxmovies here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Qfxmovies
{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("=====QFX ticket price calculator=======");
        System.out.println("Enter age group(Child,Adult, or Senior):");
        String ageGroup= sc.nextLine();
        System.out.println("Enter language(Nepali,Hindi, or English):");
        String language=sc.nextLine();
        System.out.println("Are you a student? (yes/no):");
        boolean Student=sc.nextLine().trim().equalsIgnoreCase("yes");
        System.out.println("Is today a festival day? (yes/no):");
        boolean festival=sc.nextLine().trim().equalsIgnoreCase("Yes");
        double baseprice=0.0;
        
        if(ageGroup==("Child")){
            baseprice=150;
            
        }
        else if (ageGroup==("Adult")){
            baseprice=250;
        }
        else{
            baseprice=200;
        }
        if(language==("Hindi")){
            baseprice+=50;
            
        }
        else if(language==("English")){
            baseprice+=100;
        }
        double currentprice = baseprice;
        if(Student){
            double studentDiscount= currentprice*0.20;
            currentprice-= studentDiscount;
            System.out.printf("Student Discount (20%%): -rs. %.2f\n" ,studentDiscount);
        
            
            
            
        }
        if(festival){
            double festivaldiscount = currentprice*0.15;
            currentprice-= festivaldiscount;
            System.out.printf("Festival Discount (15%%): -rs. %.2f\n" ,festivaldiscount);
        }
        System.out.println("----------------------------------------------------");
        System.out.printf("Base Price(before discounts): Rs. %.2f\n", baseprice);
        System.out.printf("Final Ticket Price: **Rs. %.2f**\n", currentprice);
        System.out.println("----------------------------------------------------");
    }
    
}