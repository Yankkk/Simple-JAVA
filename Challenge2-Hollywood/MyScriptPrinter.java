//UIUC CS125 SPRING 2014 MP. File: MyScriptPrinter.java, CS125 Project: Challenge2-Hollywood, Version: 2014-02-07T20:36:25-0600.438730000
/**
 * A program to print one actor's lines. 
 * See ScriptPrinter.txt for more information.
 * TODO: add your netid to the line below
 * @author yangeng2
 */
public class MyScriptPrinter {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		boolean output=false; //Set to true when we find the desired character
		String name=""; // Only print lines for this character
		boolean in = false;
		int length;
		
		TextIO.putln("Which character's lines would you like? (NEO,MORPHEUS,ORACLE)");
		name = TextIO.getln();
		name = name.toUpperCase();
		

		TextIO.readFile("thematrix.txt"); // stop reading from the keyboard- use the script

		System.out.println(name + "'s lines:"); //TODO: Print the name here (see ScriptPrinter.txt example output for format)
		
		output = false; // initially don't print anything

		// This loop will read one line at a time from the script until it
		// reaches the end of the file and then TextIO.eof() will return true.
		// eof means end-of-file
		while (false == TextIO.eof()) {
			String line = TextIO.getln(); // Read the next line
			
			line = line.trim();
		
			//TODO: If it's a blank line set 'output' to false
			//TODO: Correct the output format (see ScriptPrinter.txt example output)
			//TODO: Re-order the three if statements so the output is correct

			if (line.indexOf(name) == 0)
				output = true; // We found the character's name, time to start printing their lines
			
			if (line.isEmpty()){
				output = false;
			}
			if (output){
				if (line.indexOf(name) != 0)
					TextIO.putln(name + ":\"" + line + "\""); // Only print the line if 'output' is true
				
			}

			
		}
		System.out.println("---"); //TODO: Print 3 dashes here to indicate processing is complete
	}

}
