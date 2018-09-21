class Square
{
	void square(int a)
	{
		int ar=a*a;
		System.out.println("Area of square"+ar);
	}
	void square(double a)
	{
		double v=a*a*a;
		System.out.println("Volume of square"+v);
	}
	public static void main(String args[])
	{
		Square sq=new Square();
		sq.square(5);
		sq.square(6.5);
	}
}
		