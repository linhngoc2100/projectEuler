import java.util.*;

/******************************************************************************
 If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
This is also used to check other numbers' sum.
 *
 ******************************************************************************/
public class problem1 {

    public static void main(String[] args) {
        int defaultN=1000;
        int n=0;
        int sum=0;
        sum=getSum(defaultN);
        System.out.println("The sum of all the multiples of 3 or 5 below 1000:"+sum);
        System.out.println("Enter a number tp get of all the multiples of 3 or 5 below that number: ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        sum=0;
        sum=getSum(n);
        System.out.println("The sum of all the multiples of 3 or 5 below "+n+" is "+sum);
    }
    public static int getSum(int input)
    {
      int sum=0;
      for(int i =0; i<input;i++)
      {
         if((i%3==0) ||(i%5==0))
            sum=sum+i;
      }
         return sum;
    }

}