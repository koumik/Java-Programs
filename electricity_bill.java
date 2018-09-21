import java.util.*;
class electricity_bill
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of units");
		int u=sc.nextInt();
		double bill=0.0;
		if(u<=100)
		{
			 bill=100;
			 System.out.println("electricity_bill "+bill);
		}
		else if(u>100 && u<=200)
		{
			bill=100+((u-100)*2);
			System.out.println("electricity_bill "+bill);
		}
		else if(u>200 && u<=250)
		{
			bill=100+(100*2)+((u-200)*2.50);
			System.out.println("electricity_bill "+bill);
		}
		else
		{
			bill=100+(100*2)+(50*2.50)+((u-250)*4);
			System.out.println("electricity_bill "+bill);
		}	
	}
}