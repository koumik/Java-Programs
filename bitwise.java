class A
{
	
		//int a=2,b=4;
		public void OR(int c,int d)
		{
			int r1=a | b;
			System.out.println("Bitwise OR "+r1);
		}
		public void AND(int e,int f)
		{
			int r2=a & b;
			System.out.println("Bitwise OR "+r2);
		}
		public void XOR(int g,int h)
		{
			int r3=g ^ h;
			System.out.println("Bitwise XOR "+r3);
		}
		public void NOT(int i)
		{
			int r4=~i;
			System.out.println("Bitwise NOT "+r4);
		}
		public void Rshift(int k)
		{
			int r5;//=>>k;
			System.out.println("Bitwise Rshift "+r5>>k);
		}
		public void Lshift(int l)
		{
			int r6;//=<<l;
			System.out.println("Bitwise Lshift "+r6<<l);
		}
		public static void main(String args[])
		{
			A b=new A();
			b.OR(2,3);
			b.AND(2,3);
			b.XOR(2,3);
			b.NOT(5);
			b.Rshift(6);
			b.Lshift(7);
		}
	}
		
		
		
		
		