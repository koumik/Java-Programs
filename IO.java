import java.io.*;
class Main{
	public static void main(String...args) throws Exception{
		OutputStream os=new FileOutputStream("abc.txt");
		String line="My name is Something Surname.";
		os.write(line.getBytes());
	}
}