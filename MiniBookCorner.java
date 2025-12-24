
public class MiniBookCorner {
    public static void main(String[] args) {
        String[] categories = {"Fiction", "Nepali"};
        String[][] titles = new String[2][1];
        double[][] prices = new double[2][1];
        titles[0][0] = "To kill a mokingbird"; 
        prices[0][0] = 800.00; 
       
        titles[1][0] = "Asahamati"; 
        prices[1][0] = 350.00; 

        System.out.println("--- Mini Book Corner Inventory ---");
        for (int i = 0; i < categories.length; i++) {
            String bookTitle = titles[i][0];
            double bookPrice = prices[i][0];
            String categoryName = categories[i];
            String formattedPrice = String.format("%.2f", bookPrice);
            System.out.println("Category: " + categoryName);
            System.out.println("  Title: " + bookTitle);
            System.out.println("  Price: $" + formattedPrice);
            System.out.println("----------------------------------");
        }
    }
}
