package logical_operator;

public class Logical_Operator 
{

	public static void main(String[] args) 
	{
		
		int a=50 , b=50 , c=21 , d=0;
		
		if ((a<b) && (b!=c))
		{
			d=a+b+c;
			System.out.println("the number is =" +d);
		}
		else if ((a>=b) && (b<=c))
		{
			d=c-b+a;
			System.out.println("the new no. is =" +d);
			
		}
		else if ((c==b) || (a>=b))
		{
			d=a+b-c;
		System.out.println("The new value is =" + d);
		}
		
		else
			System.out.println("false statement");
			
		
		
		

	}

}
