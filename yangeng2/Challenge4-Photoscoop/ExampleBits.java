//UIUC CS125 SPRING 2014 MP. File: ExampleBits.java, CS125 Project: Challenge4-Photoscoop, Version: 2014-02-28T16:51:50-0600.525629000

public class ExampleBits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=0;i<16;i++) {
			TextIO.putln(i+ " "+Integer.toHexString(i)+ " : "+Integer.toBinaryString(i));
		}
	}
}
