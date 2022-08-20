package unary_operator;

public class Post_Decrement 
{

	public static void main(String[] args) 
	{
		int a=778 , b=--a;
		
		System.out.println("a =" +a);
		System.out.println("b =" +b);
		
		//here first "a" decrement by 1 step and the "b" will take the value of "a"
		
		int c=--b;
		
		System.out.println("B =" +b);
		System.out.println("c =" +c);
	

	}

}
