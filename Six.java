
public class Six {
    public static void main(String[] args) {

      
        int[][] marks = {
            {20, 45}, 
            {30, 55}  
        };
        System.out.println("Marks Table:");
        System.out.println("Student\tNepali\tEnglish");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("S" + (i + 1) + "\t");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + "\t");
            }
            System.out.println();
        }

        
        for (int i = 0; i < marks.length; i++) {
            int total = 0;
            for (int j = 0; j < marks[i].length; j++) {
                total += marks[i][j];
            }
            System.out.println("Total marks of Student " + (i + 1) + " = " + total);
        }
    }
}