package relational_operator;

public class Relational_Operator 
{

	public static void main(String[] args) 
	{
		int a=45 , b=45 , c=65;
		
		// print these numbers
		
		System.out.println("A =" +a);
		System.out.println("B =" +b);
		System.out.println("C =" +c);
		
		// use relational operator "==" & "!="between a, b & c
		
		System.out.println("Is A same as B? -" + (a==b));
		System.out.println("Is B same as C? -" + (b==c));
		System.out.println("is A not same as B? -" + (a!=b));
		System.out.println("Is B not same as C? -" + (b!=c));
		System.out.println("Is A not same as C? -" + (a!=c));
		
		// use relational operator "<",">","<=",">=" between a, b & c
		  // ">" & ">="
		
		System.out.println("Is A is greater than B? -" + (a>b));
		System.out.println("Is B is greater than C? -" + (b>c));
		System.out.println("Is C is Greater than A? -" + (c>a));
		System.out.println("Is C is greater than B? -" + (c>b));
		System.out.println("Is A is greater than equals to B? -" + (a>=b));
		System.out.println("Is B is greater than equals to C? -" + (b>=c));
		System.out.println("Is c is greater than equals to A? -" + (c>=a));
		
		 // "<" & "<="
		
		System.out.println("Is A is smaller than B? -" + (a<b));
		System.out.println("Is B is smaller than C? -" + (b<c));
		System.out.println("Is C is smaller than A? -" + (c<a));
		System.out.println("Is C is smaller than B? -" + (c<b));
		System.out.println("Is A is smaller than equals to B? -" + (a<=b));
		System.out.println("Is B is smaller than equals to C? -" + (b<=c));
		System.out.println("Is c is smaller than equals to A? -" + (c<=a));
		
		
		

	}

}
