//UIUC CS125 SPRING 2014 MP. File: Queue.java, CS125 Project: Challenge5-DataStructures, Version: 2014-03-07T20:16:38-0600.220439000
/**
 * 
 * @author yangeng2
 *
 */
public class Queue {
	/** Adds the value to the front of the queue.
	 * Note the queue automatically resizes as more items are added. */
	private double[] q = new double[0];
	private int size = 0;
	
	public void add(double value) {
		double[] old = q;
		size++;
		q = new double[size];
		q[0] = value;
		for(int i = 1; i < size; i++){
			q[i] = old[i-1];
		}
		
	}
	/** Removes the value from the end of the queue. If the queue is empty, returns 0 */
	public double remove() {
		double[] old = q;
		size--;
		
		if(size < 0){
			q = new double[0];
			return 0.;
			}
		else if(size == 0){
			q = new double[0];
			return old[size];
			}
		else{
			q = new double[size];
			for(int i = 0; i < size; i++){
				q[i] = old[i];
				}
			return old[size];
		}
		
	}
	
	/** Returns the number of items in the queue. */
	public int length() {
		return q.length;		
	}
	
	/** Returns true iff the queue is empty */
	public boolean isEmpty() {
		return q.length==0;
	}
	
	/** Returns a comma separated string representation of the queue. */
	public String toString() {
		String line = "";
		for(int i = q.length-1; i > -1; i--){
			line += q[i];
			if(i>0)
				line+=",";
		
		}
		return line;
	}
}
