class constchain
{
	constchain()
	{
		this(5);
		System.out.println("default constructor");
	}
	constchain(int x)
	{
		this(5,15);
		System.out.println(x);
	}
	constchain(int x,int y)
	{
		System.out.println(x*y);
	}
	public static void main(String args[])
	{
		new constchain();
	}
}
	