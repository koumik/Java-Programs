class A
{        public static void main(String ar[])

		{
			int i,sum=1;                  

            System.out.print("Perfect nos from 1 to 1000 are 1,");

            for(int j=2;j<=1000;j++)

            {

				sum=1;

                for(i=2;i<j;i++)

                {     
					if(j%i==0)

                    sum=sum+i;

                }

                if(j==sum)

                    System.out.print(j+",");

            }

        }
}