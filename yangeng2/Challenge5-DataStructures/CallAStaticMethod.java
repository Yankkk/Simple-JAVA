//UIUC CS125 SPRING 2014 MP. File: CallAStaticMethod.java, CS125 Project: Challenge5-DataStructures, Version: 2014-03-07T20:16:38-0600.220439000
/**
 * Prints out only lines that contain an email address Each printed line is
 * justified to right by prepending the text with '.' characters The minimum
 * width of the line including padding is 40 characters. See the test case for
 * example input and expected output.
 * 
 * @author yangeng2
 */
class CallAStaticMethod {

	public static void main(String[] args) {

		while (!TextIO.eof()) {
			String line = TextIO.getln();
			// Use ExampleClassMethods
			// 'isEmailAddress' and 'createPadding' to complete this method
			if(ExampleClassMethods.isEmailAddress(line)){
				
				TextIO.putln(ExampleClassMethods.createPadding('.', 40-line.length()) + line);
				}
		}

	}
}
