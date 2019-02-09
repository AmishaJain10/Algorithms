package SearchingAndSorting;//
//
//
/////*
////Given an input string, reverse the string word by word. Example: Input: “The sky is
////blue”, output: “blue is sky the”.
////1. A word is defined as a sequence of non-space characters.
////2. Input string may contain leading or trailing spaces. However, your reversed string
////should not contain leading or trailing spaces.
////3.You need to reduce multiple spaces between two words to a single space in the
////reversed string.
////*/
////public String reverse(String s) {}
////*/
//
//public class ReverseWordsinString {
//
//    public static void main(String arg[])
//    {
//        String[] rs=new String[arg.length];
//        System.out.println("You entered Sting: " +arg[0]);
//         rs=callReverseMethod(arg);
//
//
//    }
//
//    static String[] callReverseMethod(String[] str)
//    {
//        String[] rs=new String[str.length];
//        for(int i=0;i<str.length;i=i+2)
//        {
//         rs[i]=str[str.length-i];
//
//        }
//
//
//    return rs;
//
//    }
//}--------------------------------------------


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class ReverseWordsinString {

    public static void main(String args[]) {
        // System.out.println("Enter string to reverse");
        String initial=" my    name is amisha";
        // BufferedReader reader =
        //       new BufferedReader(new InputStreamReader(System.in));
        //Scanner sc=new Scanner(System.in);
        // String initial = sc.nexLine();

        String reverse = doReverse(initial);
        System.out.println("Reversed String is: " +reverse);


    }

    static String doReverse(String initial) {
        String reverse = "";
        for (int i = initial.length() - 1; i > 0; i--) {
            reverse = reverse + initial.charAt(i);


        }

        return reverse;
    }


}




