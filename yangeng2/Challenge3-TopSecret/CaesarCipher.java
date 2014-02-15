//UIUC CS125 SPRING 2014 MP. File: CaesarCipher.java, CS125 Project: Challenge3-TopSecret, Version: 2014-02-14T21:54:00-0600.128676000
/**
 * A program to search for to encrypt and decrypt lines of text. See
 * CaesarCipher.txt Hints: line.charAt( int ) is useful. You'll need loops, and
 * conditions and variables You'll need to read the Test cases to understand how
 * your program should work. Good Programming Hints:
 * "DRY: Don't Repeat Yourself" Try to make your program as short as possible.
 * TODO: add your netid to the line below
 * 
 * @author yangeng2
 */
public class CaesarCipher {

	public static void main(String[] strings) {
		// TODO: Delete the following line and write your implementation here-
		// throw new RuntimeException ("Et tu Brutus?");

		TextIO.putln("Please enter the shift value (between -25..-1 and 1..25)");
		int shift = TextIO.getlnInt();
		if (shift == -999 || shift == 999) {
			TextIO.putln("Using position shift");
			boolean output = false;
			while (!output) {
				TextIO.putln("Please enter the source text (empty line to quit)");
				String message = TextIO.getln();
				if (message.isEmpty()) {
					TextIO.putln("Bye.");
					output = true;
					break;

				}
				TextIO.putln("Source   :" + message);
				TextIO.put("Processed:");
				message = message.toUpperCase();
				int newShift = 0;
				for (int i = 0; i < message.length(); i++) {
					char c = message.charAt(i);

					if (c >= 'A' && c <= 'Z') {
						c = (char) ('A' + (c - 'A' + (newShift%26) + 26) % 26);
					} else
						c = c;
					TextIO.put(c);
					if (shift == -999){
						newShift --;
					}
					else if (shift == 999){
						newShift ++;
					}
				}
				System.out.println();

			}

		} else {
			while (shift == 0 || shift > 25 || shift < -25) {
				TextIO.putln(shift + " is not a valid shift value.");
				TextIO.putln("Please enter the shift value (between -25..-1 and 1..25)");
				shift = TextIO.getlnInt();
			}
			TextIO.putln("Using shift value of " + shift);
			boolean output = false;
			while (!output) {
				TextIO.putln("Please enter the source text (empty line to quit)");
				String message = TextIO.getln();
				if (message.isEmpty()) {
					TextIO.putln("Bye.");
					output = true;
					break;
				}
				TextIO.putln("Source   :" + message);
				TextIO.put("Processed:");
				message = message.toUpperCase();
				for (int i = 0; i < message.length(); i++) {
					char c = message.charAt(i);

					if (c >= 'A' && c <= 'Z') {
						c = (char) ('A' + (c - 'A' + shift + 26) % 26);
					} else
						c = c;
					TextIO.put(c);
				}
				System.out.println();

			}
		}
	}

}
