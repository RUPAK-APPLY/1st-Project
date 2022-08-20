package unary_operator;

public class Pre_Decrement 
{

	public static void main(String[] args) 
	{
		int a=45 , b=a--;
		
		System.out.println("Value of a =" +a);
		System.out.println("Value of b =" +b);
		
		//here "b" takes the value of "a" and then "a" will decrement by 1 step
		
		int c=b--;
		
		System.out.println("the value of B =" +b);
		System.out.println("the value of C =" +c);
		
		//here "c"takes the new value of "b" and then "b" will increment by 1 step
 		

	}

}
