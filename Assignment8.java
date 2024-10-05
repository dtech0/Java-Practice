import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in);) {
            System.out.print("Have you completed your masters?(y/n) ");
            char answer = input.next().charAt(0);
            System.out.print("Are you fluent in English?(y/n) ");
            char answer2 = input.next().charAt(0);

            if (answer == 'y' && answer2 == 'y') {
                System.out.println("You are eligible for the job interview.");
            } else {
                System.out.println("You are not eligible for the job interview.");
            }
        }
    }
}
