import java.util.Scanner;
class A
{
	public static void main(String...args)
	{
		Scanner z=new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s=z.nextLine();
		String l=s.toLowerCase();
		int v=0,c=0;
		char ch;
		for(int i=0;i<l.length();i++)
		{
			ch=l.charAt(i);
			if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				v++;
			}
			else
				c++;
		}
		System.out.println("Vowels : "+v);
		System.out.println("Consonants : "+c);
	}
}



		

