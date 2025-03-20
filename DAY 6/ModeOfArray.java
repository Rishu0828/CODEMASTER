import java.util.Scanner;

public class ModeOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter " + n + "Elements of an array : ");

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int occurence = 0;
        int maxOccurence = 0;
        int value = 0 ;

        for(int i = 0; i<n; i++){
            occurence = 0;
            for(int j = i+1; j<n; j++){
                if(arr[i] == arr[j])
                occurence++;
            }

            if(occurence > maxOccurence){
            maxOccurence = occurence;
            value = arr[i];
            }
            
        }
        System.out.println("Mode of an Array is : " + value);
    }
}
