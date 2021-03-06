//UIUC CS125 SPRING 2014 MP. File: Factorial.java, CS125 Project: Challenge1-DebugMe, Version: 2014-02-03T03:20:56-0600.311014000

/**
 * A program to calculate a factorial. The given code may contain errors. Fix the
 * given code and add additional code to calculate a factorial and pass the unit
 * tests. Hint sometimes an 'int' just 'aint big enough.
 * 
 * @see Factorial-ReadMe.txt for details on how to complete this program.
 * @author yangeng2
 */
public class Factorial {
	public static void main(String[] args) {
		int max = 0;
		long factorial = 1;
		System.out.println("Enter a number between 1 and 20 inclusive.");
		max = TextIO.getlnInt();
		while (max < 1 || max >= 21) {
			System.out.println("Enter a number between 1 and 20 inclusive.");
			max = TextIO.getlnInt();
		}
		for (int i = 1; i <= max; i++)
			factorial = factorial * i;
		
		System.out.println(max + "! = " + factorial);
	}
}
