package week1.day2;

import java.util.Arrays;

public class FindSecondLargestNum {
	
	public int getSecondLargeNum(int[] testarray)
	{
		int i=0;
		Arrays.sort(testarray);
		i = testarray[testarray.length-2];
		
		return i;
	}

	public static void main(String[] args) 
	{
		
		FindSecondLargestNum Obj1 = new FindSecondLargestNum();
		
	  	int[] testarray = {3,2,11,4,6,7};
	  	int SecondLargeNum = 0;
		SecondLargeNum = Obj1.getSecondLargeNum(testarray);
		System.out.println("Second Largest Number in Array : "+SecondLargeNum);
		
		
	}

}
