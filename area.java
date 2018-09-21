class area
{
	public static final double pi=3.14;
	void areaofcircle()
	{
		int r=5;
		double ar=pi*r*r;
		System.out.println("Area of circle "+ar);
	}
	void areaofcylinder()
	{
		int r=5,h=7;
		double ar=((pi*2*r*h)+(pi*r*r*2));
		System.out.println("Area of cylinder "+ar);
	}
	public static void main(String[] args)
	 {
		area a=new area();
		a.areaofcircle();
		a.areaofcylinder();	
	}
}