//UIUC CS125 SPRING 2014 MP. File: PixelEffects.java, CS125 Project: Challenge4-Photoscoop, Version: 2014-02-28T16:51:50-0600.525629000

/* A class to implement the various pixel effects.
 *
 * Todo: Put your netid (i.e. username) in the line below
 * 
 * @author yangeng2
 */
public class PixelEffects {

	/** Copies the source image to a new 2D integer image */
	public static int[][] copy(int[][] source) {
		// Create a NEW 2D integer array and copy the colors across
		// See redeye code below
		int[][] newImage = new int[source.length][source[0].length];
		for (int i = 0; i<source.length; i++){
			for (int j = 0; j < source[0].length; j++){
				newImage[i][j] = source[i][j];
			}
		}
		return newImage; // Fix Me
	}
	/**
	 * Resize the array image to the new width and height
	 * You are going to need to figure out how to map between a pixel
	 * in the destination image to a pixel in the source image
	 * @param source
	 * @param newWidth
	 * @param newHeight
	 * @return
	 */
	public static int[][] resize(int[][] source, int newWidth, int newHeight) {
		int[][] newImage = new int[newWidth][newHeight];
		double widthnum = (double)source.length / newWidth;
		double heightnum =(double)source[0].length / newHeight;
		
		for (int i =0; i < newWidth; i++){
			for (int j = 0; j < newHeight; j++){
				newImage[i][j] = source[(int)(widthnum * i)][(int)(heightnum * j)];
			}
		}
		return newImage; // Fix Me
		// Hints: Use two nested for loops between 0... newWidth-1 and 0.. newHeight-1 inclusive.
		// Hint: You can just use relative proportion to calculate the x (or y coordinate)  in the original image.
		// For example if you're setting a pixel halfway across the image, you should be reading half way across the original image too.
	}

	/**
	 * Half the size of the image. This method should be just one line! Just
	 * delegate the work to resize()!
	 */
	public static int[][] half(int[][] source) {
		return resize(source, source.length/2, source[0].length/2); // Fix Me
	}
	
	/**
	 * Create a new image array that is the same dimesions of the reference
	 * array. The array may be larger or smaller than the source. Hint -
	 * this methods should be just one line - delegate the work to resize()!
	 * 
	 * @param source
	 *            the source image
	 * @param reference
	 * @return the resized image
	 */
	public static int[][] resize(int[][] source, int[][] reference) {
		return resize(source, reference.length, reference[0].length) ; // Fix Me
	}

	/** Flip the image vertically */
	public static int[][] flip(int[][] source) {
		int[][] newImage = new int[source.length][source[0].length];
		
		for(int i = 0; i < source.length; i++){
			for(int j = 0; j < source[0].length; j ++){
				newImage[i][j] = source[i][source[0].length - 1 -j];
				}
		}
		return newImage;// Fix Me
	}

	/** Reverse the image horizontally */
	public static int[][] mirror(int[][] source) {
		int[][] newImage = new int[source.length][source[0].length];
		
		for(int i = 0; i < source.length; i++){
			for(int j = 0; j < source[0].length; j ++){
				newImage[i][j] = source[source.length -1 - i][j];
			}
		}
		return newImage;// Fix Me
	}

	/** Rotate the image */
	public static int[][] rotateLeft(int[][] source) {
		int[][] newImage = new int[source[0].length][source.length];
		for(int i = 0; i < newImage.length; i++){
			for(int j = 0; j< newImage[0].length; j ++){
				newImage[i][j] = source[newImage[0].length-1-j][i];
			}
		}
		return newImage;
	}

	/** Merge the red,blue,green components from two images */
	public static int[][] merge(int[][] sourceA, int[][] sourceB) {
		// The output should be the same size as the input. Scale (x,y) values
		// when reading the background
		// (e.g. so the far right pixel of the source is merged with the
		// far-right pixel of the background).
		sourceB = resize(sourceB, sourceA);
		int[][] newImage = new int[sourceA.length][sourceA[0].length];
		for (int i = 0; i < sourceA.length; i++){
			for(int j = 0; j< sourceA[0].length; j++){
				int red = (RGBUtilities.toRed(sourceA[i][j]) + RGBUtilities.toRed(sourceB[i][j])) / 2;
				int green = (RGBUtilities.toGreen(sourceA[i][j]) + RGBUtilities.toGreen(sourceB[i][j])) / 2;
				int blue = (RGBUtilities.toBlue(sourceA[i][j]) + RGBUtilities.toBlue(sourceB[i][j])) / 2;
				newImage[i][j] = RGBUtilities.toRGB(red, green, blue);
			}
		}
		return newImage;
	}

	/**
	 * Replace the green areas of the foreground image with parts of the back
	 * image
	 */
	public static int[][] chromaKey(int[][] foreImage, int[][] backImage) {
		// If the image has a different size than the background use the
		// resize() method
		// create an image the same as the background size.
		int[][] newImage = resize(foreImage, backImage);
		for (int i = 0; i < newImage.length; i++){
			for(int j = 0; j < newImage[0].length; j++){
				int number = (newImage[i][j] >> 8)- ((newImage[i][j] >> 16) << 8);
				if (number > 0){
					newImage[i][j] = backImage[i][j];
				}
			}
		}
		return newImage;
	}

	/** Removes "redeye" caused by a camera flash. sourceB is not used */
	public static int[][] redeye(int[][] source, int[][] sourceB) {

		int width = source.length, height = source[0].length;
		int[][] result = new int[width][height];
		for (int i = 0; i < width; i++)
			for (int j = 0; j < height; j++) {
				int rgb = source[i][j];
				int red = RGBUtilities.toRed(rgb);
				int green = RGBUtilities.toGreen(rgb);
				int blue = RGBUtilities.toBlue(rgb);
				if (red > 4 * Math.max(green, blue) && red > 64)
					red = green = blue = 0;
				result[i][j] = RGBUtilities.toRGB(red, green, blue);
			}

		return result;
	}

	/* Upto you! do something fun to the image */
	public static int[][] funky(int[][] source, int[][] sourceB) {
		// You need to invent your own image effect
		// Minimum boring requirements to pass autograder:
		
		// Does not ask for any user input and returns a new 2D array
		// Todo: remove this return null
		
		source = resize(source, sourceB);
		int[][] newImage = new int[source.length][source[0].length];
		for (int i = 0; i < source.length; i++){
			for(int j = 0; j < source[0].length; j++){
				if(i / 2 == 0){
					newImage[i][j] = sourceB[i][j];
				}
				else
					newImage[i][j] = source[i][j];
					
			}
		}
		return newImage;
	}
}
