import java.util.*;


class Median {

    public static void sort(int arr[]){
    
        for(int i=0; i<arr.length - 1; i++){
               if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;

                i = -1;
               }
        }

    
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Size of Array : ");
        int n = s.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Elements : ");
        for(int i = 0; i<n; i++){
            arr[i] = s.nextInt();
        }

        sort(arr);

        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i]+ " ");
        // }

        System.out.println("Median Of an Array is : " +  arr[n/2]);
    }
}