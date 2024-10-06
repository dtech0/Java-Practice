import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in);) {
            System.out.println("1. Bengali");
            System.out.println("2. Hindi");
            System.out.println("3. Urdu");
            System.out.println("4. English");
            System.out.print("Enter your choice: ");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Selected Language is Bengali.");
                    break;
                case 2:
                    System.out.println("Selected Language is Hindi.");
                    break;
                case 3:
                    System.out.println("Selected Language is Urdu.");
                    break;
                default:
                    System.out.println("Selected Language is English.");
                    break;
            }
        }
    }
}
