abstract class A
{
	
	public abstract void calc();


}
class Z extends A
{
	int a,b,c;
	public void calc()
	{
	a=1;
	b=3;
	c=a+b;
	System.out.println(c);
	}
}
class M extends A
{
	int n,i,f;
	public void calc()
	{
	n=7;
	f=1;
	for(i=1; i<=n; i++)
	{
	f=f*i;
	}
	System.out.print(f);
	}
}
class N
{
	public static void main(String arg[])
	{
	Z obj1 = new Z();
	obj1.calc();
	M obj2 = new M();
	obj2.calc();
	}
}