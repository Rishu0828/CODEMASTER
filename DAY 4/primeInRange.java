import java.util.*;
class primeInRange{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Range : ");
        int s = sc.nextInt();
        int e = sc.nextInt();

        for(int i=s; i<=e; i++){
            int p = 0;
            for(int j=2; j<=i; j++){
                if(i%j == 0){
                    p++;
                }
            }
            if(i == 1 && i == 0){
                continue;
            }
            else if(p==1){
            System.out.print(i+" ");
            }
        }

        
    }
}