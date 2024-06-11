import java.util.*;
public class main
{
  public static void main(String[] args)
  {
    long n;
    int pv=0,nv=0;
    Scanner s=new Scanner(System.in);
    n=s.nextLong();
    long[] ar=new long[(int)n];
    for(int i=0;i<n;++i)
    {
      ar[i]=s.nextLong();
      if(ar[i]>0)
      {
        pv++;
      }
      else if(ar[i]<0)
      {
        nv++;
      }
    }
    System.out.println(pv*nv+pv+nv);
    }
}
