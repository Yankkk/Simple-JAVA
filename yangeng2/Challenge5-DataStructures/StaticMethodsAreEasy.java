//UIUC CS125 SPRING 2014 MP. File: StaticMethodsAreEasy.java, CS125 Project: Challenge5-DataStructures, Version: 2014-03-07T20:16:38-0600.220439000
public class StaticMethodsAreEasy {
// Oh no... Someone removed  the methods but left the comments!!
// Hint: Get the Geocache class working and passing its tests first.
	/**
	 * @author yangeng2
	 */

	/**
	 * Returns an array of num geocaches. Each geocache is initialized to a random
	 * (x,y) location.
	 * if num is less than zero, just return an empty array of length 0.
	 * 
	 * @param num
	 *            number of geocaches to create
	 * @return array of newly minted Points
	 */
//write the method here...
	public static Geocache[] createGeocaches(int num){
		if(num<0)
			num = 0;
		
	    Geocache[] arr = new Geocache[num];
	    if(num > 0){
		for(int i = 0; i < arr.length; i++){
			arr[i] = new Geocache(Math.random(),Math.random());
		
			}
	    }
	    return arr;
	}
	
	/**
	 * Modifies geocaches if the geocache's X value is less than the allowable minimum
	 * value.
	 * 
	 * @param p
	 *            array of geocaches
	 * @param minX
	 *            minimum X value.
	 * @return number of modified geocaches (i.e. x values were too small).
	 */
	//write the method here...
	public static int ensureMinimumXValue(Geocache[] p, double minX){
		int num = 0;
		for(int i = 0; i < p.length; i++){
			if(p[i].getX() < minX){
				p[i].setX(minX);
				num++;
			}
		}
		return num;
	}

	/**
	 * Counts the number of geocaches that are equal to the given geocache
	 * Hint: Use geocache.equals() method 
	 * @param p -
	 *            geocache array
	 * @param test -
	 *            test geocache (compared using .equal)
	 * @return number of matching geocaches
	 */
	//write the method here...
	public static int countEqual(Geocache[] p, Geocache test){
		int num = 0;
		for(int i = 0; i < p.length; i++){
			if(p[i].getX() == test.getX() && p[i].getY() == test.getY())
				num++;
		}
		return num;
	}
}
