import java.io.*;
import java.util.*;

class Complex_op
	{
	//public:
		float real,imag;

		Complex_op()
		{
			real=0;imag=0;
		}
		Complex_op(float Comp1,float Comp2)
		{
			real=Comp1;
			imag=Comp2;
		}
              void AddNumbers(Complex_op C1,Complex_op C2)
		{
			float real,imag;
			this.real=(C1.real+C2.real);
			this.imag=(C1.imag+C2.imag);
			System.out.println("Answer is :("+this.real+") + ("+this.imag+")i");
		}
		void SubNumbers(Complex_op C1,Complex_op C2)
		{
			float real,imag;
			this.real=(C1.real-C2.real);
			this.imag=(C1.imag-C2.imag);
			System.out.println("Answer is :("+this.real+") + ("+this.imag+")i");
		}
		void MultNumbers(Complex_op C1,Complex_op C2)
		{
			float real,imag;
			this.real=(C1.real-C2.real);
			this.imag=(C1.imag+C2.imag);
			System.out.println("Answer is :("+this.real+") + ("+this.imag+")i");
		}
		void DivNumbers(Complex_op C1,Complex_op C2)
		{
			float real,imag,deno;
			deno=(C2.real*C2.real+C2.imag*C2.imag);
			this.real=(C1.real*C2.real+C1.imag*C2.imag)/deno;
			this.imag=(C2.real*C1.imag-C1.real*C2.imag)/deno;
			System.out.println("Answer is :("+this.real+") + ("+this.imag+")i");
		}

	}
	
public class Complex
{
	public static void main(String args[])
	{
		int ch=0;
		float no1,no2,ans;
		Complex_op cal = new Complex_op();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first no :\n");
		System.out.println("Real part:");
		no1=input.nextInt();
		System.out.println("Imagenary Part:");
		no2=input.nextInt();
		
		Complex_op Obj1=new Complex_op(no1,no2);
		System.out.println("Enter the first no :\n");
		System.out.println("Real part:");
		no1=input.nextInt();
		System.out.println("Imagenary Part:");
		no2=input.nextInt();
		
		Complex_op Obj2=new Complex_op(no1,no2);
		do
		{
			System.out.println("1:Add\n2:Sub\n3:Mult\n4:Div\n5:Exit\n");
			System.out.println("\nChoose your Choice");
			ch=input.nextInt();
			switch(ch)
			{
				case 1:
					cal.AddNumbers(Obj1,Obj2);
					break;
				case 2:
					cal.SubNumbers(Obj1,Obj2);
					break;
					
				case 3:
					cal.MultNumbers(Obj1,Obj2);
					break;
					
				case 4:
					cal.DivNumbers(Obj1,Obj2);
					break;
				case 5:
					break;
			}
		}while(ch!=5);
	}
}
