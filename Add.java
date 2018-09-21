class Add
{
	void add(int a, int b)
	{
		int x=a+b;
		System.out.println("Sum of 2 no.s "+x);
	}
	void add(int c, int d, int e)
	{
		int y=c+d+e;
		System.out.println("Sum of 3 no.s "+y);
	}
	void add(int f, int g, int h, int i)
	{
		int z=f=g+h+i;
		System.out.println("Sum of 4 no.s "+z);
	}
	public static void main(String args[])
	{
		Add ad=new Add();
		ad.add(2,3);
		ad.add(4,5,6);
		ad.add(7,8,9,10);
	}
}