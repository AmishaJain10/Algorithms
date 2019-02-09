package Strings;
/*Giving a string, find the first non-repeating character in it and return its index.
        If it doesn’t exist, return -1
        For example: “leetcode”, return 0 */


public class IndexOfNonRepeatingCharacter {
    public static void main(String args[]) {
        String str = "Amisha";
        StringtoChar(str);
    }

    static int StringtoChar(String str) {
        char[] c = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {

            System.out.println(c[i]);
        }
return 0;
    }
}


