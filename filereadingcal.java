import java.io.*;
class Main{
	public static void main(String...args){
		StreamTokenizer st=new StreamTokenizer(new FileInputStream("abc.txt"));
		int w=0,n=0,s=0;
		while(st.nextToken()!=st.TT_EOF){
			if(st.ttype==st.TT_NUMBER)
				n++;
			if(st.ttype==st.TT_WORD)
				w++;
			if(st.ttype==st.'#')
				s++;
		}
		System.out.println("S= "+s);
		System.out.println("W= "+w);
		System.out.println("N= "+n);
	}
}