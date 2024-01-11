interface Printable
{
void print();
}
interface Showable
{
void show();
}
class A implements Printable,Showable
{
public void print()
{
System.out.println("hello");
}
public void show()
{
System.out.println("Welcome");
}
}
class Testinterface
{
public static void main(String args[])
{
A obj=new A();
obj.print();
obj.show();
}
}

