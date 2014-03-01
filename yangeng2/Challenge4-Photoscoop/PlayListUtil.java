//UIUC CS125 SPRING 2014 MP. File: PlayListUtil.java, CS125 Project: Challenge4-Photoscoop, Version: 2014-02-28T16:51:50-0600.525629000
/**
 * yangeng2
 * 
 * @author angrave, yangeng2
 * 
 */
public class PlayListUtil {

	/**
	 * Debug ME! Use the unit tests to reverse engineer how this method should
	 * work. Hint: Fix the formatting (shift-cmd-F) to help debug the following
	 * code
	 * 
	 * @param list
	 * @param maximum
	 */
	public static void list(String[] list, int maximum) {
		if (maximum == -1){
			for(int j = 0; j < list.length; j++ ){
				TextIO.putln("" + (j + 1) + ". " + list[j]);
		    }
		}
		else if (maximum > 0){
			for (int i = 0; i < maximum; i++){
				TextIO.putln("" + (i + 1) + ". " + list[i]);
		    }
		}
	}

	/**
	 * Appends or prepends the title
	 * 
	 * @param list
	 * @param title
	 * @param prepend
	 *            if true, prepend the title otherwise append the title
	 * @return a new list with the title prepended or appended to the original
	 *         list
	 */
	public static String[] add(String[] list, String title, boolean prepend) {
		String[] newlist = new String[list.length + 1];
		if (prepend) {

			newlist[0] = title;
			for (int i = 1; i < newlist.length; i++) {
				newlist[i] = list[i - 1];
			}
		} else {
			newlist[newlist.length - 1] = title;
			for (int i = 0; i < list.length; i++) {
				newlist[i] = list[i];
			}
		}
		return newlist;
	}

	/**
	 * Returns a new list with the element at index removed.
	 * 
	 * @param list
	 *            the original list
	 * @param index
	 *            the array index to remove.
	 * @return a new list with the String at position 'index', absent.
	 */
	public static String[] discard(String[] list, int index) {
		String[] newlist = new String[list.length - 1];
		int j = 0;
		for (int i = 0; i < newlist.length; i++) {
			if (i == index) {
				j++;
			}
			newlist[i] = list[j];
			j++;
		}
		return newlist;
	}

}
