import java.util.Scanner;

public class Assignment12 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);){
            System.out.print("Enter the starting number: ");
            int start = sc.nextInt();
            System.out.print("Enter the ending number: ");
            int end = sc.nextInt();
            
            int sum = 0;
            for(int i=start; i<=end; i++){
                if(i%2 != 0){
                    sum += i;
                }
            }
            System.out.println("Sum: " + sum);
        }
    }
}
