class student
{
	private int sid;
	private String name;
	public void setsid(int sid)
	{
		this.sid=sid;
	}
	public int getsid()
	{
		return sid;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return name;
	}
}
class Main
{
	public static void main(String[] args) 
	{
		student s=new student();
		s.setsid(113);
		s.setname("Debanjan Ghosh");
		System.out.println(s.getsid()+" "+s.getname());	
	}
}