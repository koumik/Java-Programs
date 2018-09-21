import java.util.Scanner;
class A{
	public static void main(String[] args){
	int sum=0,num,n;
	Scanner a=new Scanner(System.in);
	System.out.print("Enter the Number: ");
	num=a.nextInt();
	while(num>0)
	{
		n=num%10;
		sum=sum+n;
		num=num/10;
	}
	System.out.println("Sum of Digits= "+sum);
	}
}
	