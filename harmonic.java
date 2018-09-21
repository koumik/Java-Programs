import java.util.Scanner;
class A
{
	public static void main(String[] args)
	{
		int n;
		double r=0.0;
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the value of n :");
		n=x.nextInt();
		System.out.println("Harmonic Series total :");
		while(n>0)
		{
			r=r+(1.0/n);
			n--;
		}
		System.out.print(r);
	}
}

