//UIUC CS125 SPRING 2014 MP. File: RGBUtilities.java, CS125 Project: Challenge4-Photoscoop, Version: 2014-02-28T16:51:50-0600.525629000
/* Manipulates RGB values
 * 
 * Todo: Put your netid (i.e. username) in the line below
 * 
 * @author yangeng2
 */

public class RGBUtilities {

/**
 * Extracts the red component (0..255)
 * Hint: see ch13.1.2 Working With Pixels 
 * http://math.hws.edu/javanotes/c13/s1.html#GUI2.1.2
 * 
 * ... also see the notes in READ-ME-FIRST
 * 
 * @param rgb the encoded color int
 * @return the red component (0..255)
 */
	public static int toRed(int rgb) {
		int number =(rgb >> 16)- ((rgb >> 24) << 8);
	
		return number; // FIX ME
	}

	public static int toGreen(int rgb) {
		int number = (rgb>>8) - ((rgb >> 16) << 8);
		return number; // FIX THIS
	}

	public static int toBlue(int rgb) {
		int number = rgb - ((rgb >> 8) << 8);
		return number; // FIX THIS
	}

	/**
	 * 
	 * @param r the red component (0..255)
	 * @param g the green component (0..255)
	 * @param b the blue component (0..255)
	 * @return a single integer representation the rgb color (8 bits per component) rrggbb
	 */
	static int toRGB(int r, int g, int b) {
		return (r << 16) + (g << 8) + b; // FIX THIS
	}

}
