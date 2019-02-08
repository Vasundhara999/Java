import java.io.*;

class A
{
	public static void main(String arg[])throws IOException
	{
		InputStreamReader obj=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(obj);
	
	System.out.println("enter two numbers");
	
	int a,b,c;
	a=Integer.parseInt(br.readLine());
	b=Integer.parseInt(br.readLine());
	c=a+b;
	System.out.print(c);
	}
}
