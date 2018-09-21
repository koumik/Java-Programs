import java.util.Scanner;
class A
{
  public static void main(String args[])
  {
    Scanner z=new Scanner(System.in);
    String str=z.nextLine();
    System.out.println("Enter Character to be replaced : ");
    String oldchar=z.next();
    System.out.println("Enter Character to be replaced with: ");
    String newchar=z.next();
    int len=str.length();
    char[] a=new char[len];
    System.out.println("String before replace   :"+str);
    int i=0;
    while(i<len)
    {
      if(a[i]==oldchar)
      {
        a[i]=newchar;
      }
      i++;
    }
    System.out.print("String after replace    :");
    String newstr=new String(a);
    System.out.println(newstr);
  }
}