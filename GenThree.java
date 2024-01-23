/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
	// Computes the  equation ax + b = c	

	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	
	int answer1 = (int) (Math.random() * ( b - a ) + a);
	int answer2 = (int) (Math.random() * ( b - a ) + a);
	int answer3 = (int) (Math.random() * ( b - a ) + a);

	int min = Math.min(answer1, answer2);
	int min1 = Math.min(min, answer3);

	System.out.println(answer1);
	System.out.println(answer2);
	System.out.println(answer3);
	System.out.println("The" + " minimal " + " generated " + " number " + " was " + min1);
	}
}
