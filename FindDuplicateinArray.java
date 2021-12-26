package week1.day2;

import java.util.Arrays;

public class FindDuplicateinArray {

	public void findDupinArray(int[] testarray)
	{
		int dup=1,i;
	Arrays.sort(testarray);//1,2,3,4,4,5,6,6,7,9,9
		
		for(i=0;i<testarray.length-1;i++)
		{
			
	//		System.out.println("Array list num "+testarray[i]);
		
			
			if(testarray[i]==testarray[i+1])
			{
				dup=dup+1;
			}
			else if(dup>1)
			{
			System.out.println("Duplicate number "+testarray[i]+" Count :"+dup);
			dup=1;
			}
			
						
		}
		if(dup>1)
		System.out.println("Duplicate number "+testarray[i]+" Count :"+dup);

		
	}

	public static void main(String[] args) 
	{
		
		FindDuplicateinArray Obj1 = new FindDuplicateinArray();
		
	  	//int[] testarray = {4,5,6,9,1,3,2,4,6,7,9,1,5};
		int[] testarray = {1,2,4,5,5,1,1,2,4,7,7};
	  	
		
	  	Obj1.findDupinArray(testarray);
		
		
	}

}

