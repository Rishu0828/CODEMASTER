import java.util.*;
class SquareMatrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Matrix : ");
        int n = sc.nextInt();

        int arr[][] = new int[n][n];

        System.out.println("Enter " + n*n + " elements for " + n + " X " + n + " matrix : ");

        for(int i=0; i<n; i++){
            
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Genarated Matrix is :");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }

    }
}