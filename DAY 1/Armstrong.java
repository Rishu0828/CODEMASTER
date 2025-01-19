import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Number :- ");
        int n = sc.nextInt();

        int num = n;
        int d = 0;

        while(n != 0) {
            n = n/10 ;
            d ++;
        }
        
        n = num;
        int sum = 0;
        while(n != 0){
            int r = n % 10;
            sum = sum + (int)Math.pow(r, d);
            n /= 10;
        }

        if (sum == num){
            System.out.println(num + " is Armstrong Number");
        } else {
            System.out.println(num + " is not Armstrong Number");
        }
    }
}
