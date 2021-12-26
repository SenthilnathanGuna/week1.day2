package week1.day2;

public class TestCalculator {
	
	public int addFunction(int a, int b)
	{
		int c=0;
		c=a+b;
		return c; 
		
	}
	public int subFunction(int a, int b)
	{
		int c=0;
		c=a-b;
		return c; 
		
	}
	public int multiplyFunction(int a, int b)
	{
		int c=0;
		c=a*b;
		return c; 
		
	}
	public int divideFunction(int a, int b)
	{
		int c=0;
		c=a/b;
		return c; 
		
	}

	public static void main(String[] args) {
		
		
		TestCalculator objcal = new TestCalculator();
		
		System.out.println("Addition of two numbers :"+objcal.addFunction(10, 5)+"\n");
		System.out.println("Subtraction of two numbers :"+objcal.subFunction(10, 5)+"\n");
		System.out.println("Multiplication of two numbers :"+objcal.multiplyFunction(10, 5)+"\n");
		System.out.println("Division of two numbers :"+objcal.divideFunction(10, 5));
		
	}

}
