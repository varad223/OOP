import java.util.Scanner;
class publication
{
	int price,copies;
	String title;
	Scanner input=new Scanner(System.in);
	void displaydata(){}
	void salecopy(){}
}
class book extends publication
{
	String author;
	int totalorder=0;
	int totalsale=0;
	void getdata()
	{
		System.out.println("Title");
		title=input.nextLine();
		System.out.println("Price");
		price=Integer.parseInt(input.nextLine());
		System.out.println("Author");
		author=input.nextLine();
		System.out.println("Copies");
		copies=Integer.parseInt(input.nextLine());
	}
	void displaydata()
	{
		System.out.println("Price="+ price);
		System.out.println("Copies="+ copies);
		System.out.println("Title="+ title);
		System.out.println("Author="+ author);
	}
	void ordercopies()
	{
		int x;
		System.out.println("How many copies do you want to order");
		x=Integer.parseInt(input.nextLine());
		totalorder=totalorder+x;
	}
	void Salecopy()
	{
		int qty;
		System.out.println("How many copies do you want to sale");
		qty=Integer.parseInt(input.nextLine());
		if(copies>=qty)
		{
			int totalprice;
			totalprice=qty*price;
			copies=copies-qty;
			totalsale=totalsale+qty;
			System.out.println("Book in sold with total amount"+ totalprice);
			System.out.println("Total sale="+ totalsale);
		}
		else
		{
			System.out.println("Sufficient copies are not available"+copies);
		}
	}
}
class magzine extends publication
{
	int current_issue,totalsale;
	void getdata()
	{
		System.out.println("Title");
		title=input.nextLine();
		System.out.println("Current issue=");
		current_issue=Integer.parseInt(input.nextLine());
		System.out.println("Price");
		price=Integer.parseInt(input.nextLine());
		System.out.println("Copies");
		copies=Integer.parseInt(input.nextLine());
	}
	void displaydata()
	{
		System.out.println("Price="+ price);
		System.out.println("Copies="+ copies);
		System.out.println("Title="+ title);
		System.out.println("Current issue="+ current_issue);
	}
	void Salecopy()
	{
		int qty;
		System.out.println("How many copies you want to sale");
		qty=Integer.parseInt(input.nextLine());
		if(copies>=qty)
		{
			int totalprice;
			totalprice=qty*price;
			System.out.println("books is sold with total amount" + totalprice);
			copies=copies-qty;
			totalsale=totalsale+qty;
			System.out.println("Total Sale" + totalsale);
		}
		else
		{
			System.out.println("Suffecient copies are not available,total copies are " + copies);
		}
	}
	void adjustqty()
		{
			System.out.println("Enter no to update cureent qty");
			int updateqty=Integer.parseInt(input.nextLine());
			copies=copies+updateqty;
			System.out.println("Quantity updated Successfully "+ copies);
		}
	void receivenewissue()
		{
			System.out.println("Enter new issue");
			current_issue=Integer.parseInt(input.nextLine());
			System.out.println("Enter copies");
			copies=Integer.parseInt(input.nextLine());
		}
public class oopl
	{
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		book array_book[]=new book[100];
		for(int i=0;i<100;i++)
		{
			array_book[i]=new book();
		}
		System.out.println("menu");
		System.out.println("1]get data for the book");
		System.out.println("2]display data of book");
		System.out.println("3]sale of book");
		System.out.println("4]order copies of book");
		System.out.println("5]display total sale and ordered copies");
		System.out.println("6]Exit");
		System.out.println("----------Enter your choice------------");
		int ch=Integer.parseInt(input.nextLine());
		int no_of_books=0;
		do
		{
			switch(ch)
			{
				case 1:
				System.out.println("how many book do you want to add");
				no_of_books=Integer.parseInt(input.nextLine());
				for(int i=0;i<no_of_books;i++)
				{
					array_book[i].getdata();
				}
				break;
				case 2:
				for(int i=0;i<no_of_books;i++)
				{
					array_book[i].displaydata();
				}
				break;
				case 3:
				System.out.println("which book do you want to sale");
				String salename=input.nextLine();
				for(int i=0;i<no_of_books;i++)
				{
					array_book[i].salecopy();
				}
				break;
				case 4:
				System.out.println("which book do you want to order");
				String ordername=input.nextLine();
				for(int i=0;i<no_of_books;i++)
				{
					if(array_book[i].title.compareTo(ordername)==0)
					{
						array_book[i].ordercopies();
						break;
					}
				}
				break;
				case 5:
				System.out.println("enter name of book to get total order and get information");
				String bname=input.nextLine();
				for(int i=0;i<no_of_books;i++)
				{
					if(array_book[i].title.compareTo(bname)==0)
					{
						System.out.println("Total Order: " + array_book[i].totalorder);
						System.out.println("Total Sale: " + array_book[i].totalsale);
						break;
					}
				}break;

					
				}
				}while(ch!=6);
	}
	}
	}
