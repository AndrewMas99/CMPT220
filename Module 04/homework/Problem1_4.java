//Andrew Masone
/*
Given two numbers n1 and n2, find the next prime number p that satisfies
p ≥ n1 × n2
 */
import java.util.Scanner;

public class Problem1_4 {
    public static void main(String[] Args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter 2 prime numbers: ");
        double n1 = sc1.nextInt();
        double n2 = sc1.nextInt();

        double p = n1 * n2;
        //System.out.println("p = "+p);
        // This only checks if p is prime, but you need to keep looking until you find the prime
        // number that is greater than or equal to p. You do this with another loop.
        for (int i = 2; i <= p; ++i) {
            if (p % i == 0) {
                //System.out.println(p+" not prime");
                p++;
            }
            if(p % i != 0){
                System.out.println("The next prime number is "+p);
                break;
            }
        }
    }
}
