import java.util.Scanner;

public class PrimeLessThanNumber {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your No. : ");
        
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            int p = 0;
            for(int j=2; j<=i; j++){
                if(i%j == 0){
                    p++;
                }
            }
        
            if(p==1){
            System.out.print(i+" ");
            }
        }
   } 
}
