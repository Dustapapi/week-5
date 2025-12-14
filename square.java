
/**
 * Write a description of class square here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class square
{
    public static void main(String[] args){
        int i=0;
        int sum=0;
        
        do{
            int numb =i*i;
            sum = sum + numb;
            
            i++;
        }while(i<=10);
        System.out.println(sum +" ");
    }
}