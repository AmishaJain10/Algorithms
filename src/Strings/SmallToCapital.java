package Strings;

public class SmallToCapital {
    public static void main(String args[]){
        char str='b';
        System.out.println(str);
        int num=str+2;
        System.out.println(num);
        char c=32+'A';
        System.out.println(c);
        String arr="AMISHA";
        char[] cAr=arr.toCharArray();
        for(int i=0;i<cAr.length;i++){
            cAr[i]+='a'-'A';
            //TODO: WHY ITS NOT GETTING ADDED
            System.out.println(cAr[i]);
        }

    }
}
