import java.util.Scanner;

public class PerfectSqr {
    public static boolean checkPefect(int n){
    
        for(int i=0; i<=Math.sqrt(n); i++){
            if(i*i == n){
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Your No. : ");
        int n = sc.nextInt();

        System.out.println(checkPefect(n));
    }
}
