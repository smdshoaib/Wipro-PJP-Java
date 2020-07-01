//CLASSES AND OBJECTS PROGRAM2
class Calculator
{
	static double powerInt(int num1,int num2)
	{
		double res=Math.pow(num1,num2);
		return res;
	}
	static double powerDouble(double num1,int num2)
	{
		double res=Math.pow(num1,num2);
		return res;
	}
	public static void main(String args[])
	{	
		System.out.println(Calculator.powerInt(2,5));
		System.out.println(Calculator.powerDouble(5.2,5));
	}
}