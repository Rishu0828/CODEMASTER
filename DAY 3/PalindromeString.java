import java.util.*;
public class PalindromeString{

    static String reverse(String str){
        int n = str.length();
        String rev = "";
    

        for(int i=0; i<n; i++){
             rev = str.charAt(i) + rev;
        }

        return rev;
    }
// Shortcut to check palindrome
    // static boolean check (String str){
    //       int n = str.length();
    //     for(int i = 0; i < n ;i ++){
    //         if(str.charAt(i) == str.charAt((n-1) - i)){
    //             continue;
    //         }  else {
    //             return false;
    //         }
    //     }

    //     return true;
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String rev = reverse(str);

        // if(check(str)){
        //     System.out.println("Palindrome");
        // } else {
        //     System.out.println("not Palindrome");
        // }

        boolean s=true;
        for(int i = 0; i<str.length(); i++){
        if(str.charAt(i) == rev.charAt(i)){
            continue;
        } else {
            s=false;
            break;
        }
    }

    if(s){
        System.out.println("Palindrome : " + rev);
    } else {
        System.out.println(" Not Palindrome : " + rev);
    }
    
}
}