
public class week6
{
    public static void main(String[] args){
        int[] age;
        age= new int[5];
        
        
        System.out.println(age.length);
        age[0]=10;
        age[1]=20;
        age[2]=30;
        age[3]=40;
        age[4]=50;
        int firstelement= age[0];
        System.out.println(firstelement);
        int[] ag= {5,11,15,20,25};
        int start=0;
        int end=ag.length-1;
        
        for(int i=start; i<=end; i++){
            System.out.println(ag[i]);
            
        }
        
        
        
        
        int[][] matrix={ {1,2,3},{4,5,6},{7,8,9} };
        
        System.out.println(matrix[1][0]);
        System.out.println(matrix[1][1]);
        System.out.println(matrix[1][2]);
        
        
        
        
        
    }
    
}