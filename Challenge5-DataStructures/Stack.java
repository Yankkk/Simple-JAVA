//UIUC CS125 SPRING 2014 MP. File: Stack.java, CS125 Project: Challenge5-DataStructures, Version: 2014-03-07T20:16:38-0600.220439000

/**
 * @author yangeng2
 */
public class Stack {
	/** Adds a value to the top of the stack.*/
	private String[] s =  new String[0];
	private int size = 0;
	
	public void push(String value){
		String[] old = s;
		size ++ ;
		s = new String[size];
		for(int i = 1; i < size; i++)
			s[i] = old[i-1];
		s[0] = value;
	}
	
	/** Removes the topmost string. If the stack is empty, returns null. */
	public String pop() {
		if(s.length == 0)
			return null;
		else{
			size--;
			String[] old = s;
			s = new String[size];
			for(int i = 0; i < size; i++)
				s[i] = old[i+1];
			return old[0];
		}
	}
	
	/** Returns the topmost string but does not remove it. If the stack is empty, returns null. */
	public String peek() {
		if(s.length == 0)
			return null;
		else{
			return s[0];
		}
	}
	
	/** Returns true iff the stack is empty */
	public boolean isEmpty() {
		return s.length==0;
	}

	/** Returns the number of items in the stack. */
	public int length() {
		return s.length;
	}
	
	/** Returns a string representation of the stack. Each string is separated by a newline. Returns an empty string if the stack is empty. */
	public String toString() {
		String line = "";
		if(s.length == 0)
			return "";
		else{
			for(int i = s.length -1; i > -1; i--){
				line += s[i] + "\n";
				
			}
			return line;	
		}
	}
}
