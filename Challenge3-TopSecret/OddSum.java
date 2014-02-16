//UIUC CS125 SPRING 2014 MP. File: OddSum.java, CS125 Project: Challenge3-TopSecret, Version: 2014-02-14T21:54:00-0600.128676000
/**
 * Prints sum of odd numbers in a specific format.
 * TODO: add your netid to the line below
 * @author yangeng2
 */
public class OddSum { 
/**
Example output if user enters 10:
Max?
1 + 3 + 5 + 7 + 9 = 25
25 = 9 + 7 + 5 + 3 + 1

Example output if user enters 11:
Max?
1 + 3 + 5 + 7 + 9 + 11 = 36
36 = 11 + 9 + 7 + 5 + 3 + 1

 */
 public static void main(String[] args) { 
	 TextIO.putln("Max?");
	 int max = TextIO.getlnInt();
	 int sum = 0;
	 for (int i = 0; i <= max; i++){
		 if (i % 2 == 1){
			 sum = sum + i;
			 if (i == max || i == max -1)
				 TextIO.put(i + " = ");
			 else
				 TextIO.put(i + " + ");
		 }
	 }
	 TextIO.putln(sum);
	 TextIO.put(sum + " = ");
	 for (int j = max; j > 0; j--){
		 if (j % 2 == 1){
			 if (j == 1)
				 TextIO.put(j);
			 else
				 TextIO.put(j + " + ");
				 
			 
		 }
	 }

  } // end of main method
} // end of class 
