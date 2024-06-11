package mypackage;
import java.io.*;
import java.util.*;

class Complex_op
{  
     //public
     private float real,imag;
       Complex_op()
       { 
         real=0; imag=0;
       }
       Complex_op (float Comp1, float Comp2)
       {
         real=Comp1;
         imag=Comp2;
       }
       void AddNumbers(Complex_op C1, Complex_op C2)
       {
           float real,imag;
           this.real=(C1.real+C2.real);
           this.imag=(C1.imag+C2.imag);
           System.out.print("Answer is:("+this.real+") +("+this.imag+")i");
           
       }
       void SubNumber(Complex_op C1, Complex_op C2) 
       {     
           float real,imag;
           this.real=(C1.real-C2.real);
           this.imag=(C1.imag-C2.imag);
           System.out.print("Answer is:("+this.real+") + ("+this.imag+")i");  
       }
       void MultiNumber(Complex_op C1, Complex_op C2)
       {
           float real,imag;
           this.real=(C1.real*C2.real-C1.imag*C2.imag);
           this.imag=(C1.imag+C2.imag);
           System.out.print("Answer is:("+this.real+") + ("+this.imag+")i");
            
       }     
       void Divnumber(Complex_op C1, Complex_op C2)   
       {
               
          float real,imag,deno;
          deno=(C2.real*C2.real-C2.imag*C2.imag)/deno;
          this.real=(C1.real*C2.real+C1.imag*C2.imag)/deno;
          this.imag=(C1.real*C2.imag-C1.real*C2.imag)/deno;
          System.out.print("Answer is:"+this.real+") + ("+this.imag+")i");
       }   


	public static void main(String[] args)
       int ch=0
       float no1,no2,ans;
       Complex_op co1=new Complex_op();
       Scanner input=newscanner(System.in);
       System.out.println("Enter the first number\n:");
       
       System.out.println("Real part:");             
       no1=input.nextInt();
       System.out.println("imaginary part:"); 
       no2=input nextInt();
       
       Complex_op obj1=new.complex_op(no1,no2);
       System.out.println("Enter the Second number\n:");
       System.out.println("Real part:");  
       no1=input.nextInt(); 
       System.out.println("imaginary part:"); 
       no2=input.nextInt();
       Complex_op obj2=new complex_op(no1,no2);
       do
       {
       System.out.println("1:Add");
       System.out.println("2:Sub");
       System.out.println("3:Multi");
       System.out.println("4:Div");
       System.out.println("5:Exit");
       System.out.print("Choose your choice:");
       }
       switch(ch)
       {    
              case 1:
                       cal.AddNumber(Obj1,Obj2);
                       break;
              case 2:
                       cal.SubNumber(Obj1,Obj2);
                       break; 
              case 3:
                       cal.MultiNumber(Obj1,Obj2);
                       break;
              case 4:
                       cal.DivNumber(Obj1,Obj2);
                       break;
              case 5:
                       break;
      }
      while(ch=5);
                                      
}                       
                       
                       
                       
                       
                       
                       
                       
                       
                                          
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
          
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
                
