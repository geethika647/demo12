interface Printtable
{
void print();
}
class A6 implements Printtable
{
public void print()
{
System.out.println("Hello");
}
}
class Test8
{
public static void main(String args[])
{
A6 a=new A6();
a.print();
}
}