package mypackage;
import java.io.*;
import java.util.*;
class complex_op
{
        float real,imag;
        complex_op()
        {
          real=0; imag=0;
        }
        complex_op(float comp1,float comp2)
        {
          real=comp1 ;imag=comp2;
        }
        void AddNumbers(complex_op C1,complex_op C2)
        {
          float real,imag;
          this.real=(C1.real+C2.real);
          this.real=(C1.imag+C2.imag);
          System.out println("Answer is:" + (this.real) + (this.imag) + "i");
        }
        void SubNumbers(complex_op C1,complex_op C2)
        {
          float real,imag;
          this.real=(C1.real-C2.real);
          this.real=(C1.imag-C2.imag);
          System.out println("Answer is:" + (this.real) + (this.imag) + "i");
        }
        void MultiplayNumbers(complex_op C1,complex_op C2)
        {
          float real,imag;
          this.real=(C1.real*C2.real-C1.imag*C2.imag);
          this.real=(C1.real*C2.imag+C2.real*C1.imag);
          System.out println("Answer is:" + (this.real) + (this.imag) + "i");
        }
        void DivideNumbers(complex_op C1,complex_op C2)
        {
          float real,imag,deno;
          deno=(C2.real*C2.real+C2.imag*C2.imag);
          this.real=(C1.real*C2.real+C1.imag*C2.imag)/deno;
          this.real=(C1.real*C2.imag-C2.real*C1.imag)/deno;
          System.out.println("Answer is:" + (this.real) + (this.imag) + "i");
        }
  public static void main(string args[])
  {
    int ch=0;
    float no1,no2,answer;
    complex_op_co1=new complex_op();
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the First Number");
    System.out.println("Real Part");
    no1=input.nextInt();
    System.out.println("Imaginary Part");
    no2=input.nextInt();
    complex_op_co2=new complex_op();
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the Second Number");
    System.out.println("Real Part");
    no1=input.nextInt();
    System.out.println("Imaginary Part");
    no2=input.nextInt();

    complex_op_obj1=new.complex_op(no1,no2);
    System.out.println("Enter the first no\n");
    System.out.println("Real Part");
    no1=input.nextInt();
    System.out.println("Imaginary Part");
    no2=input.nextInt();


    complex_op_obj2
    System.out.println("Enter the Second no\n");
    System.out.println("Real Part");
    no1=input.nextInt();
    System.out.println("Imaginary Part");
    no2=input.nextInt();
  }
  do
  {

  }
  while (ch=5);
}
