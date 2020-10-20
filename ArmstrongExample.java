class ArmstrongExample
{
public static void main(String[]args)
{
int a,temp,c=0;
int n=153;
temp=n;
while(n>0)
{
a=n%10;
n=n/10;
c=c+(a*a*a);
}
if(temp==c)
{
System.out.println("n is armstrong");
}
}
}
out put is : n is armstrong number
code is successfully executed
