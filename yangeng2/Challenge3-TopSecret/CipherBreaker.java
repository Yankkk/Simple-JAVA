//UIUC CS125 SPRING 2014 MP. File: CipherBreaker.java, CS125 Project: Challenge3-TopSecret, Version: 2014-02-14T21:54:00-0600.128676000
/**
 * See CipherBreaker.txt for instructions. TODO: add your netid to the line
 * below
 * 
 * @author yangeng2
 */
public class CipherBreaker {

	public static void main(String[] args) {
		TextIO.putln("Text?");
		String line = TextIO.getln();
		TextIO.putln(line);
		line = line.toUpperCase();
		int DIGITS = 0, SPACES = 0, PUNCTUATION = 0;
		for (int i = 0; i < line.length(); i++) {
			char c = line.charAt(i);
			if (c == ' ')
				SPACES++;
			else if (c == '.' || c == '\'' || c == '!' || c == '"' || c == ','
					|| c == '-') {
				PUNCTUATION++;
			} 
			else if (c >= '0' && c <= '9') {
				DIGITS++;
			}

		}
		int j;
		for (j = 65; j <= 90; j++) {
			int index = line.indexOf((char) j);
			if (index >= 0) {
				int count = 1;
				while (index < line.length()) {
					index = line.indexOf((char) j, index + 1);
					if (index >= 0) {
						count++;
					} else
						break;
				}

				TextIO.putln((char) j + ":" + count);
			}

		}
		if (DIGITS > 0)
			TextIO.putln("DIGITS:" + DIGITS);
		if (SPACES > 0)
			TextIO.putln("SPACES:" + SPACES);
		if (PUNCTUATION > 0)
			TextIO.putln("PUNCTUATION:" + PUNCTUATION);

	}
}
