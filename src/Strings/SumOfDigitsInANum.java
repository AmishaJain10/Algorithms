package StringPackage;

//calculates sum of digits in a number

public class SumOfDigitsInANum {

    public static void main(String args[]) {
        int num = 345;
        int sum = getSum(num);
        System.out.println(sum);
    }

   static int getSum(int num){
        int sum=0;
        while(num!=0){
            sum=sum+num%10;
            num=num/10;
        }
        return sum;

    }

}
