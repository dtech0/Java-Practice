import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in);){
            int phonePrice = 1800; // 1800 euros
            int numberOfInstallments, installmentPerMonth;
            System.out.print("Number of installments? ");

            numberOfInstallments = input.nextInt();
            installmentPerMonth = phonePrice / numberOfInstallments;

            System.out.println("Monthly installment Amount: " + installmentPerMonth + " euros");
        }
    }
}
