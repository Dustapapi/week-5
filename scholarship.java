import java.util.Scanner;

/**
 * Write a description of class scholarship here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class scholarship
{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the GPA");
        float GPA =s.nextFloat();
        System.out.println("Enter the attendance in %");
        float a=s.nextFloat();
        System.out.println("Enter the attidute between 1 to 10");
        int att=s.nextInt();
        if(GPA>=3.2 && a>=80 && att>7){
            System.out.println("Eligible for scholarship");
            
            
            
            
            
        }
           else{
               System.out.println("Not eligible for scholarship)");
           }
        }
        
        
    }
