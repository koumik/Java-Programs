class A{

    public static void main(String[] args) {
        int x=1;
		for(int i=0;i<4;i++)
		{
            for(int j=0;j<=i;j++)
			{
                if (j==0 || i==0)
                    x=1;
                else
                    x=x*(i-j+1)/j;

                System.out.print(x);
            }

            System.out.println();
        }
    }
}