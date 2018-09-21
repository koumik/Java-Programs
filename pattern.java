class pattern
{
	public static void main(String[] args)
	{	int x=1,y=1;
		for(int i=1;i<=6;i++)
		{
			for(int j=0;j<i;j++)
			{
				y=(j==0) ?x:y;
				System.out.print(y+" ");
				y=(y==1) ? 0:1;
			}
			System.out.println();
			x=(x==1) ? 0:1;	
		}
	}
}