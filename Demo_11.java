class Calculator
{
int z;

int add (int x,int y)
{
z=x+y;
return z;
}
}

class Demo_11
{
public static void main(String args[])
{
Calculator c=new Calculator();

int a=140;
int b=10;
c.add(a,b);

int res;
res=c.add(a,b); 
System.out.println(res);
}
}