import java.util.Scanner;

public class Assignment13 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.print("Which fibonacci number do you want to see? ");
            int n = sc.nextInt();//takes input
            int fib1 = 0;
            int fib2 = 1;
            if (n == 1)
                System.out.println("The " + n + "th value is " + fib1);
            else if (n == 2)
                System.out.println("The " + n + "th value is " + fib2);
            else {
                int fib3 = 0;
                for (int i = 3; i <= n; i++) {
                    fib3 = fib1 + fib2;
                    fib1 = fib2;
                    fib2 = fib3;
                }
                System.out.println("The " + n + "th value is " + fib3);
            }
        }
    }
}
