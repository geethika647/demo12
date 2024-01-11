interface Bank
{
float rateOfIntrest();
}
class SBI implements Bank
{
public float rateOfIntrest()
{
return 9.15f;
}
}
class PNB implements Bank
{
public float rateOfIntrest()
{
return 9.7f;
}
}
class TestInterface
{
public static void main(String args[])
{
Bank b=new SBI();
Bank c=new PNB();
System.out.println("ROI: "+b.rateOfIntrest());
System.out.println("ROI: "+c.rateOfIntrest());
}
}
