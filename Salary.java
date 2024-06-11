//package mypackage;
import java.util.Scanner;
class Employee
{
	int empid;
	long mobile;
	String name,address,mailid;
	Scanner get=new Scanner(System.in);
	void getdata()
	{
		System.out.println("Enter name of employee");
		name=get.nextLine();
		System.out.println("Enter mail id");
		mailid=get.nextLine();
		System.out.println("Enter address of employee");
		address=get.nextLine();
		System.out.println("Enter employee id");
		empid=get.nextInt();
		System.out.println("Enter mobile no");
		mobile=get.nextLong();
	}
	void display()
	{
		System.out.println("Employee Name::"+name);
		System.out.println("Employee id::"+empid);
		System.out.println("Mail id::"+mailid);
		System.out.println("Address::"+address);
		System.out.println("Mobile no::"+mobile);
	}
}
class Programmer extends Employee
{
	double salary,bp,da,hra,pf,club,net,gross;
	void getprogrammer()
	{
		System.out.println("Enter basic pay");
		bp=get.nextDouble();
	}
	void calculateprog()
	{
		da=(0.92*bp);
		hra=(0.10*bp);
		pf=(0.12*bp);
		club=(0.1*bp);
		gross=(bp+da+hra);
		net=(gross-pf-club);
		System.out.println("********************");
		System.out.println("PAY SLIP FOR PROGRAMMER");
		System.out.println("********************");
		System.out.println("BASIC PAY Rs"+bp);
		System.out.println("DA Rs"+da);
		System.out.println("HRA Rs"+hra);
		System.out.println("PF Rs"+pf);
		System.out.println("CLUB Rs"+club);
		System.out.println("GROSS PAY Rs"+gross);
		System.out.println("NET PAY Rs"+net);
	}
}
class Asstprofessor extends Employee
{
	double salary,bp,da,hra,pf,club,net,gross;
	void getasst()
	{
		System.out.println("Enter basic pay");
		bp=get.nextDouble();
	}
	void calculateasst()
	{
		da=(0.92*bp);
		hra=(0.10*bp);
		pf=(0.12*bp);
		club=(0.1*bp);
		gross=(bp+da+hra);
		net=(gross-pf-club);
		System.out.println("********************");
		System.out.println("PAY SLIP FOR ASSISTENT PROFESSOR");
		System.out.println("********************");
		System.out.println("BASIC PAY Rs"+bp);
		System.out.println("DA Rs"+da);
		System.out.println("HRA Rs"+hra);
		System.out.println("PF Rs"+pf);
		System.out.println("CLUB Rs"+club);
		System.out.println("GROSS PAY Rs"+gross);
		System.out.println("NET PAY Rs"+net);
	}
}
class Assoprofessor extends Employee
{
	double salary,bp,da,hra,pf,club,net,gross;
	void getasso()
	{
		System.out.println("Enter basic pay");
		bp=get.nextDouble();
	}
	void calculateasso()
	{
		da=(0.92*bp);
		hra=(0.10*bp);
		pf=(0.12*bp);
		club=(0.1*bp);
		gross=(bp+da+hra);
		net=(gross-pf-club);
		System.out.println("********************");
		System.out.println("PAY SLIP FOR ASSOCIATE PROFESSOR");
		System.out.println("********************");
		System.out.println("BASIC PAY Rs"+bp);
		System.out.println("DA Rs"+da);
		System.out.println("HRA Rs"+hra);
		System.out.println("PF Rs"+pf);
		System.out.println("CLUB Rs"+club);
		System.out.println("GROSS PAY Rs"+gross);
		System.out.println("NET PAY Rs"+net);
	}
}
class Professor extends Employee
{
	double salary,bp,da,hra,pf,club,net,gross;
	void getprof()
	{
		System.out.println("Enter basic pay");
		bp=get.nextDouble();
	}
	void calculateprof()
	{
		da=(0.92*bp);
		hra=(0.10*bp);
		pf=(0.12*bp);
		club=(0.1*bp);
		gross=(bp+da+hra);
		net=(gross-pf-club);
		System.out.println("********************");
		System.out.println("PAY SLIP FOR PROFESSOR");
		System.out.println("********************");
		System.out.println("BASIC PAY Rs"+bp);
		System.out.println("DA Rs"+da);
		System.out.println("HRA Rs"+hra);
		System.out.println("PF Rs"+pf);
		System.out.println("CLUB Rs"+club);
		System.out.println("GROSS PAY Rs"+gross);
		System.out.println("NET PAY Rs"+net);
	}
}
class Salary
{
	public static void main(String[]args)
	{
		int choice,cont;
		do
		{
			System.out.println("PAYROLL");
			System.out.println("1:PROGRAMMER\n2:ASSISTENT PROFESSOR\n3:ASSOCIATE PROFESSOR\n4:PROFESSOR");
			Scanner c=new Scanner(System.in);
			System.out.println("Enter your choice: ");
			choice=c.nextInt();
			switch(choice)
			{
				case 1:
				{
					Programmer p=new Programmer();
					p.getdata();
					p.getprogrammer();
					p.display();
					p.calculateprog();
					break;
				}
				case 2:
				{
					Asstprofessor asst=new Asstprofessor();
					asst.getdata();
					asst.getasst();
					asst.display();
					asst.calculateasst();
					break;
				}
				case 3:
				{
					Assoprofessor asso=new Assoprofessor();
					asso.getdata();
					asso.getasso();
					asso.display();
					asso.calculateasso();
					break;
				}
				case 4:
				{
					Professor prof=new Professor();
					prof.getdata();
					prof.getprof();
					prof.display();
					prof.calculateprof();
					break;
				}
			}
		}
		while(choice!=5);
	}
}
