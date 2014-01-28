public class Example2SpriteMoveNoFlipBuffer {

	/**
	 * Drawing directly to the screen is easy - just don't call flipBuffer !
	 */
	public static void main(String[] args) {
		// Without using flipBuffer changes appear on screen immediately
		// However, this also means that each image will also stay on the
		// screen after it is drawn
		int x = 100;
		while (true) {
			Zen.drawImage("sprite1.gif", x, 200);
			Zen.sleep(50);
			x = x + 5;
		}
	}
}
