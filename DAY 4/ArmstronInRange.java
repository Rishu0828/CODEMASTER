import java.util.Scanner;

public class ArmstronInRange {
    public static void checkArmstrong(int n){
        int d = 0;
        int num = n;

        while(n != 0){
         n=n/10;
         d++;
        }

        n = num;
        int sum = 0;
        while(n != 0){
            int r = n%10;
            sum = sum + (int)Math.pow(r, d);
            n /=10;

        }

        if(sum == num){
            System.out.print(sum + " ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Range : ");
        int s = sc.nextInt();
        // checkArmstrong(s);
        int e = sc.nextInt();

        for(int i = s; i<=e; i++){
            checkArmstrong(i);
        }
        
    }
}
