import java.util.*;
public class SumOfSqr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your No. : ");
        int n = sc.nextInt();

        int sum = 0;
        while (n>0) {
            sum += n%10 * n%10;
            n /= 10;
        }

        System.out.println("Sum of Digit is : " + sum);
           
    }
}
