import java.util.Scanner;
class A
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter "+n+" integers");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<(n-1);j++)
		{
			for(int k=0;k<(n-j-1);k++)
			{
				if(arr[k]<arr[k+1])
				{
					int swap=arr[k];
					arr[k]=arr[k+1];
					arr[k+1]=swap;
				}
			}
		}
		for(int c=0;c<n;c++)
		{
			System.out.println(arr[c]);
		}
	}
}
		
		