class x
{
	x()
	{
		this(5);
		System.out.println("Default Constructor");
	}
	x(int a)
	{
		this(1,2);
		System.out.println(a);
	}
	x(int a,int b)
	{
		System.out.println(a*b);
	}
	public static void main(String...args)
	{
		new x();
	}
}
