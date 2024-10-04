import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in);) {
            System.out.print("Do you love JAVA? (Y/y/N/n) ");
            char check = input.next().charAt(0);
            if (check == 'Y' || check == 'y') {
                System.out.println("You are a JAVA lover.");
            } else if (check == 'N' || check == 'n') {
                System.out.println("You are not a JAVA lover.");
            } else {
                System.out.println("Invalid input");
            }
        }
    }
}
