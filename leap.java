import java.util.*;
class A
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year");
		int y=sc.nextInt();
		if(y%4==0)
		{
			if(y%100==0)
			{
				if(y%400==0)
					System.out.println("Leap year");
				else
					System.out.println("Not leap year");
				}
			else
			System.out.println("leap year");
		}
		else
			System.out.println("Not leap year");
	}
}