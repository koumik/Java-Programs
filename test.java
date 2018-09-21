class Test
{
	int num;
	Test(int n)
	{
		num=n;
		System.out.println("value of num="+num);
	}
	void getReverse()
	{
		int a=0;
		while(num > 0)
        {
            a = num % 10;
            num = num * 10 + a;
            num = num / 10;
        }
		
		System.out.println("Reverse number ="+a);
	}
	public static void main(String args[])
	{
		Test z=new Test(1234);
		z.getReverse();
	}
}