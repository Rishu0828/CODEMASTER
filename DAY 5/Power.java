import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Base element : ");
        int b = s.nextInt();

        System.out.print("Enter Exponent element : ");
        int e = s.nextInt();

        System.out.print("Power of Given no. is : " + (int)Math.pow(b, e));
    }
}
