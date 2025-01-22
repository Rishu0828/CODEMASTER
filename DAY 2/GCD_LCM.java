import java.util.Scanner;

public class GCD_LCM {

    // Function of Gretest Common Divisor
    public static int GretestCommonDivisor(int a, int b) {
        int gcd = 0;
        if (a <= 0 && b <= 0) {
            return 0;
        }
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }

    // Function of Least Common Multiple
    public static int LeastCommonMultiple(int a, int b){
    // int lcm = 0;
    if (a <= 0 && b <= 0) {
        return 0;
    }
 
    for (int i = a>b ? a : b; i >= a && i >= b; i++) {
        if (i % a == 0 && i % b == 0) {
            return i;
        }
    }

    return -1;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your 1st No. : ");
        int a = sc.nextInt();
        System.out.print("Enter Your 2nd No. : ");
        int b = sc.nextInt();

        int GCD = GretestCommonDivisor(a, b);
        int LCM = LeastCommonMultiple(a, b);


        System.out.println("Gretest Common Divisor of " + a + " & " + b + " is " + GCD);
        System.out.println("Least Common Multiple of " + a + " & " + b + " is " + LCM);


    }
}