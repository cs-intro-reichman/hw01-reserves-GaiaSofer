/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
	public static void main(String[] args) {
		
		int num = Integer.parseInt(args[0]);
		int num1 = Integer.parseInt(args[1]);

		System.out.println(num + "+"  + num1 + "=" + (num + num1));
	}
}
