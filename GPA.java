import java.util.Scanner;

/**
 * Write a description of class GPA here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GPA
{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter GPA: ");
        double gpa= sc.nextDouble();
        if(gpa<0 || gpa>0){
            System.out.print("Invalid");
            
        }
        else if(gpa>= 3.7){
            System.out.print("Grade: A");
            
        }
        else if(gpa>= 3.0){
            System.out.print("Grade: B");
        }
        else if(gpa>= 2.0){
            System.out.print("Grade: C");
        }
        else{
            System.out.print("Grade: F");
        }
    }
}