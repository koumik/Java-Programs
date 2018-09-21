import java.util.Scanner;
/*class A
{
	public static void main(String[] args)
	{
	int n,p=0;
	
	n=s.nextInt();
	for(int i=2;i<=n;i++)
	{
		for(int j=2;j<=i;j++)
		{
			if(i%j==0)
			p=1;
		}
		if(p==0)
		{
			System.out.println(i);
		}
	}	
}
}*/
class A 
{
	public static void main(String[] args) 
	{
		Scanner z=new Scanner(System.in);
		System.out.print("Enter number : ");
        int num=z.nextInt();
        boolean flag=false;
        for(int i=2;i<=num/2;++i)
        {
            if(num % i == 0)
            {
                flag = true;
                break;
            }
			if(!flag)
			{	
				System.out.println("Here"+i);
			}
        }

    }
}