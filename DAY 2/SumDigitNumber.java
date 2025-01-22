import java.util.Scanner;

public class SumDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your No. : ");

        int n = sc.nextInt();

        int sum = 0;
        while (n > 0) {
            int r = n % 10;
            sum = sum + r;
            n /= 10;
        }

        System.out.println("Sum of digit of given No. is : " + sum);
    }
}
