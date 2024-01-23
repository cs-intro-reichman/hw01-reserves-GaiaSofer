/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
	// Computes the  equation ax + b = c	

	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	
	System.out.println((int) (Math.random() * ( b - a ) + a));

	}
}
