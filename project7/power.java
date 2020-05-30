
/*Name: Arjina Khanom
 * CST 3613
 * Assignment - 7
 * In class work
 * Question: Write a recursive function to perform exponentiation. Return Xm, assuming m >= 0 (public int exp(int x, int m) {})
 */


package project7;


public class power {

    public static void main(String[] args) {
        int x = 3, m = 4;
        int result = power(x, m);

        System.out.printf("%d^%d = %d", x, m, result);
    }

    public static int power(int x, int m) {
        if (m != 0)
            return (x * power(x, m - 1));
        else
            return 1;
    }
}