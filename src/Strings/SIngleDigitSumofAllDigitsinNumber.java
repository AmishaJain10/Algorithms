package StringPackage;

/*Giving a string, find the first non-repeating character in it and return its index.
        If it doesn’t exist, return -1
        For example: “leetcode”, return 0 */

//Digital Root or Digital sum of a Number: single digit number

public class SIngleDigitSumofAllDigitsinNumber {
    public static void main(String args[]) {
        int num = 317;
        int sum = getSum(num);
        System.out.println(sum);
    }

    static int getSum(int num){
        int sum=0;
        while(num!=0){
            sum=sum+num%10;
            num=num/10;
        }

        if(sum/10>0)
            getSum(sum);

        return sum;

    }

}

