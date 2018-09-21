class Calculator
  {
   public void calc()
    {
    int add, sub, mul, a, b;
    double div;
    a=Integer.parseInt(System.console().readLine("enter the first no.  :"));
    b=Integer.parseInt(System.console().readLine("enter the second no. :"));
    add=a+b;
    System.out.println("addition of two no.      ="+add);
    sub=a-b;
    System.out.println("substraction of two no.  ="+sub);
    mul=a*b;
    System.out.println("multiplecation of two no.="+mul);
    div=(double)a/b;
    System.out.println("division of two no.      ="+div);
   }
  }
class ScientificCalculator extends Calculator
{
   void scincalc()
   {
    System.out.println("****************values of ScientificCalculator******************");
   int n=Integer.parseInt(System.console().readLine("enter the  no.  :"));
   int sqr=n*n;
   System.out.println("Square  of the no.      ="+sqr);
   
   int d=Integer.parseInt(System.console().readLine("enter the power no.  :"));
   int pow=n;
   for(int i=1;i<d;i++)
     {
     
       pow=pow*n;
     }
  
    System.out.println("power of n to d is ="+pow);
   
  
  }
   public static void main(String args[])
    {
      ScientificCalculator ab=new ScientificCalculator();
      ab.calc();
      ab.scincalc();
      
    }
 }