import java.util.*;
class largestt
{
public static void main(String args[])
{
System.out.println("enter 3 numbers");
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
if((a>b)&&(a>c))
{
System.out.println(a);
}
else if((b>a)&&(b>c))
{
System.out.println(b);
}
else if((c>a)&&(c>b))
{
System.out.println(c);
}
}}