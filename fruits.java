class fruits
{
	String f_name;
	String s_fruit;
	String b_fruit;
	double price;
	fruits(String f_name,String s_fruit,String b_fruit,double price)
	{
		/*f_name=a;
		s_fruit=b;
		b_fruit=c;
		price=d;*/
	}
	void displayfruit()
	{
		System.out.println("Fruit name"+f_name);
		System.out.println("Single fruit"+s_fruit);
		System.out.println("Bunch fruit"+b_fruit);
		System.out.println("Fruit price"+price);
	}

	public static void main(String[] args)
	{
		fruits f=new fruits("apple","single"," ",5.00);
		/*f.fruits("apple","single"," ",5.00);
		fruits ft=new fruits(String,String,String,double);
		ft.fruits("grapes"," ","bunch",10.00);*/
	}
}
		