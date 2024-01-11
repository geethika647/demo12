abstract class Bank
{
abstract int getRateOfIntrest();
}
class SBI extends Bank
{
int getRateOfIntrest()
{
return 7;
}
}
class PNB extends Bank
{
int getRateOfIntrest()
{
return 8;
}
}
class ICICIBank extends Bank
{
int getRateOfIntrest()
{
return 9;
}
}
class AxisBank extends Bank
{
int getRateOfIntrest()
{
return 10;
}
}
class StateBank extends Bank
{
int getRateOfIntrest()
{
return 11;
}
}
class GraminaBank extends Bank
{
int getRateOfIntrest()
{
return 12;
}
}
class HDFCBank extends Bank
{
int getRateOfIntrest()
{
return 13;
}
}
class SBHBank extends Bank
{
int getRateOfIntrest()
{
return 14;
}
}
class TestBank
{
public static void main(String args[])
{
Bank b;
b=new SBI();
System.out.println("rate of intrest is:"+b.getRateOfIntrest()+"%");
b=new PNB();
System.out.println("rate of intrest is:"+b.getRateOfIntrest()+"%");
b=new ICICIBank();
System.out.println("rate of intrest is:"+b.getRateOfIntrest()+"%");
b=new AxisBank();
System.out.println("rate of intrest is:"+b.getRateOfIntrest()+"%");
b=new StateBank();
System.out.println("rate of intrest is:"+b.getRateOfIntrest()+"%");
b=new GraminaBank();
System.out.println("rate of intrest is:"+b.getRateOfIntrest()+"%");
b=new HDFCBank();
System.out.println("rate of intrest is:"+b.getRateOfIntrest()+"%");
b=new SBHBank();
System.out.println("rate of intrest is:"+b.getRateOfIntrest()+"%");
}
}