 class Calcu
 {
 public static void  main(String arg[]);
 {
 String s1,s2,s3;
 s1=arg[0];
 s2=arg[1];
 
 int a,b,c,d=4;
 a=Integer.parseInt(s1);
 b=Integer.parseInt(s2);
 
 switch(d)
 {
 case 1:
 {
 System.out.prinln("addition");
 c=a+b;
 System.out.println(c);
 break;
 }
 case 2:
 {
 System.out.println("subtraction");
 c=a-b;
 System.out.println(c);
 break;

 }
 case 3:
 {
 System.out.println("division");
 c=a/b;
System.out.println(c);
break;
}
case 4:
{
	System.out.println("multiplication");
	c=a*b;
	System.out.println(c);
	break;
}
default:
{
System.out.println("invalid");
break;
 }
 }
 }}