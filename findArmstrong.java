package week1.day2;

public class findArmstrong {

	public static void main(String[] args) 
	{	
		
		int input=153;
		int orinum = input;
		
		int sum=0,temp=0;
		
		while(input>0)
		{
			
			temp = input % 10;
			
			sum = sum + (temp*temp*temp);
			
			System.out.println(sum);
			
			input = input/10;
			
		}
		
	if(orinum==sum)
	{
		System.out.println("The number is Armstrong");
	}
	else
	{
		System.out.println("The number is not Armstrong");
	}
		

	}

}
