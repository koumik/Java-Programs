import java.util.Scanner;
class A
{
	public static void main(String...args)
	{
		Scanner z=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String s=z.nextLine();
		int l=s.length();
		char[] a=new char[l];
		System.out.print("Reverse String is : ");
		for(int i=l-1;i>=0;i--)
		{
			a[i]=s.charAt(i);
			System.out.print(a[i]);
		}		
	}
}
