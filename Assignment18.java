import java.util.Scanner;

public class Assignment18 {
    public static void main(String[] args) {
        String[] weekdays = new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday",
                "Sunday" };

        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Enter the day of the week (1-7): ");
            int day = sc.nextInt();
            if (day >= 1 && day <= 7) {
                System.out.println("The day of the week is: " + weekdays[day - 1]);
            } else {
                System.out.println("Invalid day of the week");
            }
        }
    }
}
