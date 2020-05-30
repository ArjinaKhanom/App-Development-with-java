
/**Name: Arjina Khanom
 * CST 3613
 * Assignment - 6
 * Due Date: Tuesday, February 25, 2020 at 6:00 PM
 * 
 * Project: Use the Summation recursive program you did in the class to also work with minus integers.
 * For example, the sum of -3 will be -6 which is (-3)+(-2)+(-1)+0.
**/

package project6;

import java.util.Scanner;

public class SingleRecursion {
    // Main method 
    public static long sum(int n) {
        if (n==0)
            return 0;
        else if (n<0)
            return n + sum(n+1);
        else
            return n+sum(n-1);
        //return (n<2) ? 1 : n*factorial (n-1);
    }
    public static void main (String[] args) {
        Scanner stdIn = new Scanner (System.in);
        System.out.print("Factorial of what number do you want to calculate ? ");
        int num = stdIn.nextInt();
        System.out.print( sum (num));
        stdIn.close();
    }
}