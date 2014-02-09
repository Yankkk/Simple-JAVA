//UIUC CS125 SPRING 2014 MP. File: MovieSurvey.java, CS125 Project: Challenge2-Hollywood, Version: 2014-02-07T20:36:25-0600.438730000
/**
 * A program to run a simple survey and report the results. See MovieSurvey.txt
 * for more information. TODO: add your netid to the line below
 * 
 * @author yangeng2
 */
public class MovieSurvey {
	public static void main(String[] arg) {
		// TODO: Write your program here
		// Hints :
		// Formatted output
		// http://math.hws.edu/javanotes/c2/s4.html#basics.4.4
		
		// Don't just copy paste the expected output
		// For grading purposes your code may be tested
		// with other input values.
		TextIO.putln("Welcome. We're interested in how people are watching movies this year.\nThanks for your time. - The WRITERS GUILD OF AMERICA.");
		TextIO.putln("Please tell us about how you've watched movies in the last month.");
		TextIO.putln("How many movies have you seen at the cinema?");
		int cinema = TextIO.getlnInt();
		TextIO.putln("How many movies have you seen using a DVD or VHS player?");
		int dvd = TextIO.getlnInt();
		TextIO.putln("How many movies have you seen using a Computer?");
		int computer = TextIO.getlnInt();
		
		int sum = cinema + dvd + computer;
		double cinemaPercent = (double)cinema / sum * 100;
		double otherPercent = 100 - cinemaPercent;
		
		TextIO.putln("Summary: " + cinema + " Cinema movies, " + dvd + " DVD/VHS movies, " + computer + " Computer movies");
		TextIO.putln("Total: " + sum +" movies");
		System.out.print("Fraction of movies seen at a cinema: ");
		TextIO.putf("%.2f",cinemaPercent);
		System.out.println("%");
		System.out.print("Fraction of movies seen outside of a cinema: ");
		TextIO.putf("%.2f", otherPercent);
		System.out.println("%");
		
	}
}
