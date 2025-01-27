import java.util.Scanner;

public class Largest_Smallest_SUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of elements : " );
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter Elements : ");
        for(int i = 0 ; i< n ; i++){
            arr[i] = sc.nextInt();
        }

        int l = Integer.MIN_VALUE;
        int s = Integer.MAX_VALUE;
        int sum = 0;

        for(int i =0; i<arr.length; i++){
            if(l<arr[i]){
                l = arr[i];
            }
            
            if(s > arr[i]){
                s = arr[i];
            } 

            sum = sum + arr[i];
             
        } 



        System.out.println("Largest : " + l + ", " + "Smallest : " + s);

        System.out.println("Sum of Array is : " + sum);
    }
}
