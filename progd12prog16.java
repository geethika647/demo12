import java.util.Scanner;
class Charatexample
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
System.out.println("Enter a string:");
String str=scob.nextLine();
for(int i=0;i<=str.length()-1;i++)
{
if(i%2!=0)
{
System.out.println("char at"+i+" place "+str.charAt(i));
}
}
}
}
