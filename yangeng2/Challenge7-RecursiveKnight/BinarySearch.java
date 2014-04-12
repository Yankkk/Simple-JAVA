//UIUC CS125 SPRING 2014 MP. File: BinarySearch.java, CS125 Project: Challenge7-RecursiveKnight, Version: 2014-04-11T09:33:42-0500.688996000
/**
 * @author yangeng2
 */
public class BinarySearch {
	/**
	 * Wrapper method. Just runs the recursive search method below for the
	 * entire array
	 */
	public static boolean search(int[] array, int key) {
		return search(array, key, 0, array.length - 1);
	}

	/**
	 * Recursive search using Divide and Conquer approach: The given array is
	 * already sorted so we can very quickly discover if the key is in the array
	 * or not. Hint: For the recursive case check the value at (lo+hi)/2 and
	 * proceed accordingly.
	 */
	static boolean search(int[] array, int key, int lo, int hi) {

		//if(hi<lo)
			//return false;
		while (lo <= hi) {
			if (key == array[(lo + hi) / 2] )
				return true;

			else if (key > array[(lo + hi) / 2]) {
				return search(array, key, (lo + hi) / 2 + 1, hi);
			} else
				return search(array, key, lo, (lo + hi) / 2 - 1);

	
		}
		return false;
		
	}
}
