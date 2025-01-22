import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your No. : ");

        int num = sc.nextInt();

        int result = 0;
        int n = num;
        while(n>0){
            int r = n%10;
            result = result*10+r;
            n/=10; 
        }

        if(num == result){
            System.out.println("Given No. is Palindrome : "+ result);
        }
        else {
            System.out.println("Given No. is Not Palindrome : "+ result);

        }
    }
}
