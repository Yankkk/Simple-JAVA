//UIUC CS125 SPRING 2014 MP. File: Example_RecursivePicture.java, CS125 Project: Challenge6-RecursionSee, Version: 2014-04-04T10:07:33-0500.044234000
public class Example_RecursivePicture {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		recurse(0, 0, Zen.getZenWidth(), Zen.getZenHeight());
	}

	private static void recurse(int x, int y, int width, int height) {
		if (width < 4 || height < 4)
			return;

		Zen.setColor((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
		Zen.fillRect(x, y, width, height);
		Zen.sleep(100);
		
		width /= 2;
		height /= 2;

		recurse(x , y + height, width, height); // Large Y (lowerleft square) first
		recurse(x + width, y, width, height); // Small Y (upperright square) second
	}

}
