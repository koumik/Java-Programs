import java.lang.Math;
class simplecalculator
{
	public void addition(int a,int b)
	{
		int x=a+b;
		System.out.println("Addition "+x);
	}
	public void subtraction(int c,int d)
	{
		int y=c-d;
		System.out.println("Subtraction "+y);
	}
	public void multiplication(int e,int f)
	{
		int z=e*f;
		System.out.println("Subtraction "+z);
	}
	public void division(int g,int h)
	{
		int zx=g/h;
	}
	public void square(int i)
	{
		int s=i*i;
		System.out.println("Square "+s);
	}
	public void sqroot(int j)
	{
		double sq=Math.sqrt(j);
		System.out.println("Sqroot "+sq);
	}
}
public class scientificcalculator extends simplecalculator
{
	public void Sin(int a)
	{
		double x=Math.sin(a);
		System.out.println("The result is "+x);
	}
	public void Cos(int b)
	{
		double y=Math.cos(b);
		System.out.println("The result is "+y);
	}
	public void Tan(int c)
	{
		double z=Math.tan(c);
		System.out.println("The result is "+z);
	}
	public void Sinivn(int d)
	{
		double sininv=Math.asin(d);
		System.out.println("The result is "+sininv);
	}
	public void Cosinv(int e)
	{
		double cosinv=Math.acos(e);
		System.out.println("The result is "+cosinv);
	}
	public void Taninv(int f)
	{
		double taninv=Math.sin(f);
		System.out.println("The result is "+taninv);
	}
	public static void main(String args[])
	{
		scientificcalculator sc=new scientificcalculator();
		sc.Sin(3.14/2);
	}	
}