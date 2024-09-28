import java.util.Scanner;

public class Product{
    public static void main(String[] args){

        // First task:

        // System.out.println("Id: 101");
        // System.out.println("Title: iphone 15");
        // System.out.println("Price: 1895 euros");
        // System.out.println("Description: Perfect product with best image qualiy");
        // System.out.println("Category: phone");

        // Second task:

        // int id = 101;
        // String title = "iphone 15";
        // double price = 1895.0;
        // String description = "Perfect product with best image qualiy";
        // String category = "phone";
        // System.out.println("Id: " + id);
        // System.out.println("Title: " + title);
        // System.out.println("Price: " + price + " euros");
        // System.out.println("Description: " + description);
        // System.out.println("Category: " + category);

        // Third task:

        int id;
        String title;
        double price;
        String description;
        String category;

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the id: ");
        id = input.nextInt();
        input.nextLine(); // It is used when user tap enter it takes grasp the new line
        
        System.out.print("Enter the Title: ");
        title = input.nextLine();
        
        System.out.print("Enter the Price: ");
        price = input.nextDouble();
        input.nextLine(); // It is used when user tap enter it takes grasp the new line
        
        System.out.print("Enter the description: ");
        description = input.nextLine();
        
        System.out.print("Enter the category: ");
        category = input.nextLine(); // It is used when user tap enter it takes grasp the new line

        System.out.println("Id: " + id);
        System.out.println("Title: " + title);
        System.out.println("Price: " + price + " euros");
        System.out.println("Description: " + description);
        System.out.println("Category: " + category);

        input.close();  // for preventing the resource leak problem
    }
}
