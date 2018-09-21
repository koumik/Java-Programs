import java.util.*;
import java.lang.Math;
class series
{
	public static void main(String[] args)
	{
		double s=0.0,p=0.0;
		int ft=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			p=Math.pow(i,i);
			ft=ft*i;
			s=s+(p/ft);
		}
		System.out.println(s);
	}
}