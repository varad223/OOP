import java.util.*;
class stroperat
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first string: ");
		char a=sc nextChar();
		System.out.println("Enter a second string: ");
		char b=sc nextChar();
		int c=0;
		System.out.println("\n1:Add\n2:Mult\nEXIT");
		int ch=sc.nextInt();
		do
		{
		switch(ch)
		{
			case 1:c=a+b;
			{
				System.out.println("Addition is: " + c);
				break;
			}
			case 2:c=a*b;
			{
				System.out.println("Multiplication is: " + c);
				break;
			}
			case 3:
			{
				System.out.println("THANK YOU😊️");
				break;
			}
		}
		}while(ch!=3);
	}
}
