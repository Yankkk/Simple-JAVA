//UIUC CS125 SPRING 2014 MP. File: InsecureCombinationLockBreaker.java, CS125 Project: Challenge7-RecursiveKnight, Version: 2014-04-11T09:33:42-0500.688996000
/**
 * 
 * @author yangeng2
 * 
 */
public class InsecureCombinationLockBreaker {
	
	public static boolean isEven(String s){
		if(s.charAt(0) == '*')
			return true;               // if the first char of the string is '*' reutrn true
		return false;                  // return false;
		
	}

	public static int breakLock(InsecureCombinationLock lock) {
		// Write your code here to break the combination lock
		// Read the combination lock source code to determine
		// the weakness in the lock

		// You do not need to use recursion.

		// - An inside programmer has written some extra
		// code that gives you a tiny hint about how close you
		// are to opening the lock.
		// Using this single bit of information, your job
		// is to find the integer value that opens the lock

		// This method is only for honors students and the curious to complete
		// Honor students: Be prepared to demonstrate how you completed
		// this problem!

		// **** This method is not graded as part of the MP ****

		// (but for your own local testing just remove
		// the 'xxx's in the test method in InsecureTest.java)

		// Beginner: This problem is not for beginners

		// Intermediate: It took me 90 minutes to create a robust solution
		// (including 15 minutes debugging it with several million tests).

		// Advanced: 'Don't be wasteful' -
		// Assume there is a 1s time penalty for every unlocking attempt,
		// make sure your code uses the fewest number of unlocking attempts
		// ie. It will open the lock as quickly as possible.
		// (My solution was little wasteful but was simpler to implement).
		int key =0;
		int temp = 1;

		while (temp <= 10000000) {
			int[] value = new int[10];        
			int k = key;
			int counto = 0;    // count the number of odd result
			int counte = 0;    // count the number of even result
			int index = 0;     // store the correct integer
			for (int i = 0; i < 10; i++) {
				String ss = lock.open(k);   // get the result of calling open(k) and store in ss
				if (ss.equals("Success!"))  // if the ss is "Success"
					break;                  // break the loop

				if (isEven(ss)) {           // if the result is even
					counte++;               // counte increase
					value[i] = 2;           // set the value at i to 2(represent a even value)
				} else {
					counto++;
					value[i] = 1;            // is odd, counto increase, set value to 1
				}
				k = k + temp;                // increase k by temp
		
			}
			if (counte == 1 && counto == 9) {        // if turn out to be one even result
				for (int i = 0; i < 10; i++) {
					if (value[i] == 2) {             // find out the value[index] that holds even value
						index = i;
					}
				}
			}
			if (counto == 1 && counte == 9) {         // if turn out to be one odd result
				for (int i = 0; i < 10; i++) {    
					if (value[i] == 1) {              // find out the value[index] that holds odd value  
						index = i;
					}
				}
			}
			
			if (!lock.open(key).equals("Success!")) {     // if not correct
				key = key + index * temp;                 // change value of key, increase by index * temp
				temp = temp * 10;                         // increase temp to 10*temp
			}
		}

		if (!lock.open(key).equals("Success!")) {       // if the code is not 8 digits
			key = key + 100000000;                      // change key to 9 digits

		}
		
		lock.open(key).equals("Success!");              // need to call open again to change to value of isUnlocked

		return key;
	}

	public static void main(String[] args) {
		InsecureCombinationLock lock = new InsecureCombinationLock();
		int code = breakLock(lock);

		System.out.println("Unlock code:" + code);
		System.out.println(lock.isUnlocked() ? "Unlocked :-)"
				: "Still Locked :-(");
	}
}
