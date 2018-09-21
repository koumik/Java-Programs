package mypack;

class Balance
{
	String name;
	double bal;
	Balance()
	{
		name=" ";
		bal=0.0;
	}
	Balance(String a,double b)
	{
		name="a";
		bal=b;
	}
	void show()
	{
		System.out.println("Name "+name);
		System.out.println("Balance "+bal);
	}
}
class AcctBalance
{
	public static void main(String[] args) 
	{
		Balance b=new Balance("Debanjan",2700.00);
		b.show();	
	}
}