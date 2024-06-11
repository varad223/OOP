import java.util.*;
import java.lang.*;
import java.io.*;
class class7
{
static int count=0;
static void check_palindrome(String x)
{
StringBuilder s1=new StringBuilder(x);
if(x.equals(s1.reverse().toString()))
{
System.out.println("\n" + x+ " is a palindrome");
count +=1;
}
else
{
System.out.println("\n" + x+ " is not a palindrome");
}
}
static void even_odd(int x)
{
if(x%2==0)
{
System.out.println("\n" + x+ " is Even");
count +=1;
}
else
{
System.out.println("\n" + x+ " is Odd");
}
}
static void prime(int x)
{
boolean flag=false;
for(int i=2;i<=x/2;i++)
{
if(x%i==0)
{
flag=true;
break;
}
else if(flag==false)
{
System.out.println("\n" + x+ " is Prime");
count +=1;
}
else
{
System.out.println("\n" + x+ " is not prime");
}
}
}
static void number_op()
{
int element,n,choice;
char op;
Scanner sc=new Scanner(System.in);
ArrayList<Integer>nums=new ArrayList<Integer>();
do
{
System.out.println("Enter the elements");
element=sc.nextInt();
nums.add(element);
System.out.println("Do you Want to add new Element?(y/n)");
System.out.println("\nEnter Your Choice");
op=sc.next().charAt(0);
}
while(op=='y');
System.out.println("Enter the operations to be performed");
System.out.println("1)Even or Odd");
System.out.println("2)prime or not");
System.out.println("\nEnter Your Choice");
choice=sc.nextInt();
Iterator itr=nums.iterator();
count=0;
if(choice==1)
{
while(itr.hasNext())
{
even_odd((int)itr.next());
}System.out.println("The number of Even numbers is: " + count);
System.out.println("The number of odd numbers is: " + (nums.size()-count));
}
if(choice==2)
{
while(itr.hasNext())
{
prime((int)itr.next());
}
System.out.println("The number of Prime numbers is: " + count);
System.out.println("The number of composite numbers is: " + (nums.size()-count));
}
}
static void string_op()
{
int n;String word;char op;
ArrayList<String>words=new ArrayList<String>();
do{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Elements: ");
word=sc.next();
words.add(word);
System.out.println("Do you Want to add new string(y/n) " );
System.out.println("\nEnter Your Choice");
op=sc.next().charAt(0);
}
while(op=='y');
count=0;
Iterator itr=words.iterator();
while(itr.hasNext())
{
check_palindrome((String)itr.next());
}
System.out.println("\nThe no of not palindromes is:" + (words.size()-count));
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Choose Type:");
System.out.println("\n1.String related operations");
System.out.println("2.Integer related operations");
System.out.println("\nEnter Your Choice");
int ch=sc.nextInt();
if(ch==2)
{
number_op();
}
else
{
string_op();
}
}
}
