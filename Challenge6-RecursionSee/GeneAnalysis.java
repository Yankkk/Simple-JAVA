//UIUC CS125 SPRING 2014 MP. File: GeneAnalysis.java, CS125 Project: Challenge6-RecursionSee, Version: 2014-04-04T10:07:33-0500.044234000
/**
 * @author yangeng2
 *
 */
public class GeneAnalysis
{
	/** Wrapper method. Returns the length of the longest 
	 * common subsequence
	 */
	public static int score(String gene1, String gene2)
	{
		char[] array1 = gene1.toCharArray();
		char[] array2 = gene2.toCharArray();
		return score(array1, array2, array1.length-1, array2.length-1);
		// Hint: Use toCharArray() to convert each string to a char array.
		 // call your recursive implementation here with
		// the genes as char arrays, starting at the end of each gene.
	}

	/** Implements longest common subsequence recursive search
The recursive case is defined as
					S(i-1, j)
S(i,j) = max {		S(i,j-1)
					S(i-1,j-1)
					S(i-1,j-1) +1 if gene1[i] = gene2[j]

NB  0<=i < gene1.length
    0<=j < gene2.length

You need to figure out the base case.
	 * */
//	define a private recursive Class method 'score' that 
//	returns an integer the score.
//	The method should take four parameters- 
//	two char arrays and two integers (gene1,gene2,i,j)
//	i and j are the indices into gene1 and gene2 respectively.
private static int score(char[] gene1, char[] gene2,int i, int j ){
	if(i == -1 || j == -1)
		return 0;
	if(gene1[i] == gene2[j])
		return 1+score(gene1,gene2,i-1,j-1);
	else if(score(gene1,gene2, i-1,j) > score(gene1,gene2,i,j-1))
		return score(gene1,gene2,i-1,j);
	else
		return score(gene1,gene2,i,j-1);
	
	
}

}
// Use local variables to store a recursive result so that you  do not need to calculate it again.

// Do not use a loops.
