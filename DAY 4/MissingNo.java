import java.util.Scanner;

public class MissingNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Seq : ");
        int n = sc.nextInt();

        System.out.println("Enetr Seq : ");
        int seq[] = new int[n];
        for(int i = 0; i<n; i++){
            seq[i] = sc.nextInt();
        }

        System.out.print("Missing No. is : ");
        for(int i = 0; i<n; i++){
            if(seq[i] != i+seq[0]){
           System.out.print(i+seq[0]);
            break;
            }
            
        }
    }
}
