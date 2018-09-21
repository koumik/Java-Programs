class parent
{
	public void getcar()
	{
		System.out.println("Maruti 800");
	}
}
class child extends parent
{
	public void getcar()
	{
		super.getcar();
		System.out.println("Audi A8");
	}
	
}
class car
{
	public static void main(String args[])
	{
		parent p=new child();
		p.getcar();
	}
} 