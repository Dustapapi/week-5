import java.util.Scanner;

/**
 * Write a description of class Three here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Three
{
    public static void main(String[] args){
        String [] names={"Saroj","Sushant","Ujjawal","Rabina","Sandesh"};
        for(int i=0; i<names.length; i++){
            System.out.println("Student at index" + i + ":" +names[i]);
            
            
        }
        System.out.println("Student name at index 2 is: "+ names[2]);
        
        Scanner input= new Scanner(System.in);
        System.out.println("Ask for index between(0-4)");
        int idx= input.nextInt();
        
        System.out.println("pass the value for that index");
        input.nextLine();
        String value= input.nextLine();
        names[idx]=value;
        System.out.println(names[idx]);
        
        
        
        
        
        
    
        
    }
}