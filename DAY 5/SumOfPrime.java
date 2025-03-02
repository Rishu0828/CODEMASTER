import java.util.*;
public class SumOfPrime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
           
        int range[] = new int[2];
        int sum = 0;

        System.out.println("Enter Your Range : ");
        for(int i = 0; i<range.length; i++){
            range[i] = s.nextInt();
        }

        for(int i = range[0]; i<=range[1]; i++){
            int p = 0;
            for(int j=2; j<=i; j++){
                if(i%j == 0){
                    p++;
                }

                
            }
            if(i == 1 || i == 0){
                continue;
            }
            else if(p==1){
            sum += i;
            }
        }

        System.out.println("Sum of Prime Numbers is : " + sum);
    }
}
