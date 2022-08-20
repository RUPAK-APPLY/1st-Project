package unary_operator;

public class Post_increment 
{
	public static void main(String[] args) 
	{
		int a=85 , b=++a;
		
		System.out.println("value of a =" +a);
		System.out.println("value of b =" +b);
		
		//first value of "a" is increment by 1 step then "b" will take value of "a"

		int c=++b;
		
		System.out.println("value of B =" +b);
		System.out.println("value of C =" +c);
		
		// here first new value of "b" is increment by 1 step then "c" will take value of "c"
		
	}
	

}
