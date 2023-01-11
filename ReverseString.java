package stringHandling;

import java.util.Scanner;

public class ReverseString {

    private static String reverseString(String a) {
        String b="";
        for (int i = a.length()-1; i >=0 ; i--) {
            b=b+a.charAt(i);
        }
        return b;
    }

    static String  usingCharacterArray(String a){
        String  temp = "";
        char[] b=a.toCharArray();
        for (int i = b.length-1; i >= 0; i--) {
            temp=temp+b[i];
        }
        return temp;
    }


    private static void usingStringBuffer(String a) {
        StringBuffer sb=new StringBuffer(a);
        System.out.println(sb.reverse());
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the String : ");
        String a= scanner.next();
        //System.out.println(reverseString(a));
        //System.out.println(usingCharacterArray(a));
        usingStringBuffer(a);
    }
}
