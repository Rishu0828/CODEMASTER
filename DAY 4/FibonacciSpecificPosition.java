import java.util.Scanner;

public class FibonacciSpecificPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Postion : ");
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;

        for(int i=2; i<=n; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }

        System.out.println("Fibonacci Series : " );
        for(int i=0; i<=n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        System.out.println("Fibonacci in " + n + " position : " + arr[n]);
    }
}
