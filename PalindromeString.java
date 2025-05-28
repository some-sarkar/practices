import java.util.Locale;
import java.util.Scanner;

class HelperPalindrome{
    public static boolean checkPalindrome(String str){
        int s=0;
        int e=str.length()-1;
        while(str.toLowerCase().charAt(s) != str.toLowerCase().charAt(e)){
            return false;
        }
        return  true;
    }
}


public class PalindromeString {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        String ss = scanner.nextLine();
        System.out.println(HelperPalindrome.checkPalindrome(ss) ? ss+" is Palindrome" : ss+" is not Palindrome");
    }
}
