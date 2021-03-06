//UIUC CS125 SPRING 2014 MP. File: GridCounting.java, CS125 Project: Challenge7-RecursiveKnight, Version: 2014-04-11T09:33:42-0500.688996000
/**
 * 
 * @author yangeng2
 *
 */
public class GridCounting {
	/** Returns the total number of possible routes (paths) from
	 * (x,y) to (tx,ty).
	 * There are only three valid kinds of moves:
	 *  Increment x by one.
	 *  Increment x by two.
	 *  Increment y by one.
	 *  
	 *  Hint: You'll need to test two base cases.
	 */
	public static int count(int x,int y, int tx, int ty) {
		if(x > tx || y > ty)
			return 0;
		if(x==tx && y == ty)
			return 1;
		if(y == ty && x + 2 == tx)
			return 2;
		//if(y == ty && x + 2 > tx)
			//return 1;
			
		return count(x+1,y,tx,ty) + count(x+2,y,tx,ty) + count(x,y+1,tx,ty);
		
	}
}
