import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Size of An Array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // int firstLarget = 0, secondLargest = 0;

        System.out.println("Enter " + n + "Elements of an Array : ");
        for(int i = 0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Second largest element is : " + arr[n-2]);
    }
}
