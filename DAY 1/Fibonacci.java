import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a No. to Genrate Upto Fibanacci Series  :- ");
        int n = sc.nextInt();

        int t1 = 0, t2 = 1;
        int nextTerm = t1 + t2;

        System.out.print("Fibonacci Series upto Given No. is " + t1 + " " + t2);

        while(nextTerm < n) {
        System.out.print(" " + nextTerm);
        t1 = t2;
        t2 = nextTerm;
        nextTerm = t1 + t2;

        }
    }
}
