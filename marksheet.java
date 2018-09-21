import java.util.*;
class marksheet
{
	public static void main(String[] args) 
	{
		double s=0.0;
		double per=0.0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Student name :");
		String name=sc.nextLine();
		System.out.println("Enter the roll no. :");
		int roll=sc.nextInt();
		System.out.println("Enter college name :");
		sc.next();
		String coll=sc.nextLine();
		System.out.println("Enter the marks of 5 subjects");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		int m4=sc.nextInt();
		int m5=sc.nextInt();
		s=m1+m2+m3+m4+m5;	
		per=s/5;
		System.out.println();
		System.out.println("Marksheet");
		System.out.println("-------------------------");
		System.out.println();
		System.out.println("Name :"+name);
		System.out.println("Roll no. :"+roll);
		System.out.println("College :"+coll);
		System.out.println("------------------");
		System.out.println();
		System.out.println("Subject : Marks");
		System.out.println("Sub1 :"+m1);
		System.out.println("Sub2 :"+m2);
		System.out.println("Sub3 :"+m3);
		System.out.println("Sub4 :"+m4);
		System.out.println("Sub5 :"+m5);
		System.out.println();
		System.out.println("------------------");	
		System.out.println("Total :"+s);
		System.out.println("Percentage :"+per+"%");
	}
}