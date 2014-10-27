/**
 * Coding Problem 1
 */

import java.util.Arrays;

/**
 * @author Steven Vuong
 *
 */

public class RunProblem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] anArray = {1,2};
		System.out.println(Arrays.toString(findConsecutiveRuns(anArray)));
		
		int[] anArray2 = {1,2,3,5,10,9,8,9,10,11,7};
		System.out.println(Arrays.toString(findConsecutiveRuns(anArray2)));
		
		int[] anArray3 = {};
		System.out.println(Arrays.toString(findConsecutiveRuns(anArray3)));
	}
	
	public static int[] findConsecutiveRuns(int[] inArray){
		int consecutiveCount=0;
		int[] tempArray = new int[inArray.length]; 									//We don't know the length of the array yet
		for(int i=0;i<inArray.length-2;i++){
			if(((inArray[i]+1)==inArray[i+1])&&((inArray[i+1]+1)==inArray[i+2])){ 	//check increasing consecutive 3
				tempArray[consecutiveCount]=i;
				consecutiveCount++;
			}
			else if(((inArray[i]-1)==inArray[i+1])&&((inArray[i+1]-1)==inArray[i+2])){ 	//check decreasing consecutive 3
				tempArray[consecutiveCount]=i;
				consecutiveCount++;
			}
			
		}
			
		int[] outArray = new int[consecutiveCount];									//Clone the temp array section that has values
		for(int i=0;i<consecutiveCount;i++)
			outArray[i]=tempArray[i];
		
		if(consecutiveCount==0)
			return null;
		else
			return outArray;
		
	}

}
