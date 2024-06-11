import java.util.*;
import java.lang.Math.*;
class tvs
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number :");
		int a=sc.nextInt();
		int c=0;
		System.out.println("1:Square of Number\n2:Cube of Number\n3:Square root of Number\n4:Factorial of Number\n5:Exit");
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1:
			{
			c=a*a;
			System.out.println("Square of the no is: " + c);
			break;
			}
			case 2:
			{
			c=a*a*a;
			System.out.println("Cube of the no is: " + c);
			break;
			}
			case 3:
			{
			double d;
			d=(Math.sqrt((a)));
			System.out.println("Square root of the no is: " + d);
			break;
			}
			case 4:
			{
			int i,fact=1,num;
			System.out.println("Enter A Number :");
			num=sc.nextInt();
			for(i=1;i<=num;i++)
			{
				fact=fact*i;
			}
			System.out.println("Factorial of the no is: " + fact);
			break;
			}
			case 5:
			
			break;
		}
	}
}
