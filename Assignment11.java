import java.util.Scanner;

public class Assignment11 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);){
            System.out.print("Enter a number for finding the factorial: ");
            int num = sc.nextInt();
            int fact = 1;
            int k = num;
            while(k!=0){
                fact *= k;
                k--;
            }
            System.out.println("Factorial of " + num + " is: " + fact);
        }
    }
}
