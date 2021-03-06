//UIUC CS125 SPRING 2014 MP. File: UsingPublicFieldsIsEasy.java, CS125 Project: Challenge5-DataStructures, Version: 2014-03-07T20:16:38-0600.220439000

/**
 * Complete the class method 'analyze' that takes a SimplePublicPair object as an argument
 * and returns a new SimplePublicTriple object.
 * The SimplePublicTriple needs to set up as follows:
 * x = the minimum value of 'a' and 'b'
 * y = the maximum value of 'a' and 'b'
 * description:a*b=M 
 *   where a,b, and M are replaced with the numerical values of a, b and the multiplication of a and b.
 * Your code will create a SimplePublicTriple, initializes the three fields and return a reference to the SimplePublicTriple object.
 *
 *@author yangeng2
 */
public class UsingPublicFieldsIsEasy {
	
	public static SimplePublicTriple analyze(SimplePublicPair in) {
		int i = in.a;
		int j = in.b;
		int x;
		int y;
		String description;
		if(i>j){
			x = j;
			y = i;
			
		}
		else {
			x = i;
			y = j;
		}
		description =i + "*" + j + "=" +i * j;

		SimplePublicTriple out = new SimplePublicTriple();
		out.description = description;
		out.x = x;
		out.y = y;
		return out;
	}
}
