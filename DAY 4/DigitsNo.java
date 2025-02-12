import java.util.*;
public class DigitsNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your No. : ");
        int n = sc.nextInt();

        int d = 0;
        while(n != 0){
            n/=10;
               d++;
        }

        System.out.println("Digit of Given No. is : " + d);
    }
}
