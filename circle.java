import java.util.Scanner;
class A{
	public static void main(String[] args){
		int r,ch;
		double d,a,c;
		Scanner x=new Scanner(System.in);
		System.out.print("Enter the Radius:");
		r=x.nextInt();
		System.out.print("1. Diameter \n2. Area \n3. Circumference \n4. Exit\n");
		System.out.println("Enter Choice:");
		ch=x.nextInt();
		switch(ch){
			case 1:
				d=2*r;
				System.out.println("Diameter is:"+d);
				break;
			case 2:
				a=3.14*r*r;
				System.out.println("Area is:"+a);
				break;
			case 3:
				c=2*3.14*r;
				System.out.println("Circumference is:"+c);
				break;
			case 4:
				System.exit(0);
		}
	}
}

	


			
		
		