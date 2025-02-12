import java.util.Scanner;

public class SumOfDigitsOfFactorial {
 
    public static void SumOfDigit(int n){
        int sum = 0;

        while (n !=0) {
            sum = sum + n%10;
            n /= 10;
        }

        System.out.println("Sum of digit is  " + sum );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your no. : ");
        int n = sc.nextInt();
        int fact = 1;

        for(int i = 1; i<=n; i++){
           fact = fact * i;
        }

        System.out.println("Factorial of " + n + " is " + fact);
        SumOfDigit(fact);
    }
}
