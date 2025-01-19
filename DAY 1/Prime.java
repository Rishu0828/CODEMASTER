import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Number :- ");
        int n = sc.nextInt();

        int d = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                d = 1;
                break;
            }
        }

        if (d == 0) {
            System.out.println(n + " is Prime Number");

        } else {

            System.out.println(n + " is not Prime Number");

        }

    }
}
