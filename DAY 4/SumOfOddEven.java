import java.util.*;
public class SumOfOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range : ");
        int s = sc.nextInt();
        int e = sc.nextInt();

        int os = 0;
        int es = 0;

        for(int i = s; i<=e; i++){
            if(i%2 != 0){
                os = os+i;
            } else {
                es = es + i;
            }
        }

        System.out.println("Odd Sum : " + os);
        System.out.println("Even Sum : " + es);

        
    }
}
