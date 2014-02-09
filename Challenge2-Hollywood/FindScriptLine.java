//UIUC CS125 SPRING 2014 MP. File: FindScriptLine.java, CS125 Project: Challenge2-Hollywood, Version: 2014-02-07T20:36:25-0600.438730000
/**
 * A program to search for specific lines and print their line number.
 * See FindScriptLine.txt for more details
 * TODO: add your netid to the line below
 * @author yangeng2
 */
public class FindScriptLine {

	public static void main(String[] args) {
// TODO: Implement the functionality described in FindScriptLine.txt
// TODO: Test your code manually and using the automated unit tests in FindScriptLineTest
		int count = 0;
		boolean output;
		String word = "";
		
		System.out.println("Please enter the word(s) to search for");
		word = TextIO.getln();
		System.out.println("Searching for '" + word + "'");
		String words = word.toLowerCase();
		TextIO.readFile("thematrix.txt");
		
		while (TextIO.eof() == false){
			count = count + 1;
			output = false;
			String line = TextIO.getln();
			line = line.trim();
			String lines = line.toLowerCase();
			if (lines.indexOf(words) >= 0)
				output = true;
			if (output)
				System.out.println(count + " - " + line );
		}
		System.out.println("Done Searching for '" + word + "'");
	}
}
