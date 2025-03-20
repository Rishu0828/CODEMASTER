import java.util.*;
public class AvgOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " Elements of an array : ");

        int sum = 0;

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println("Average No. in an Array is : " + (float)sum/n);


    }
}
