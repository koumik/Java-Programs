import java.util.Scanner;
class A
{
	int t=1;
	public static void main(String[] args)
	{
		int n,f;
		Scanner z=new Scanner(System.in);
		System.out.println("Enter the number whose factorial you want :");
		n=z.nextInt();
		A obj=new A();
        f=obj.fact(n);
        System.out.println("Factorial is : "+f);
    }
    int fact(int n)
    {	
		while(n>1)
		{
			t=(n*fact(n-1));
		}
		return t;
    } 
