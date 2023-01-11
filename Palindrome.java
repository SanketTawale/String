package stringHandling;

import java.util.Scanner;

public class Palindrome {
    private static void checkPalindrome(String a) {
        String b="";
        for (int i = a.length()-1; i >=0 ; i--) {
            b=b+a.charAt(i);
        }
        if (a.equals(b)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String a= scanner.next();
        checkPalindrome(a);
    }
}
