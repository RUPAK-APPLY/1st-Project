package unary_operator;

public class Pre_Increment 
{

	public static void main(String[] args) 
	{
        int  a= 45 ,b=a++;
		
		System.out.println("value of a =" +a);
		System.out.println("value of b =" +b);
		
		//value of "b" take the value of "a" and  then value "a" increase by 1 step
		
		int c=b++;
		System.out.println("value of B =" +b);
		System.out.println("value of c =" +c);
		
		//value of "c" taken the new value of "b" and then new value of "b" increase by 1 step
		
		

	}

}
