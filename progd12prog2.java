//ABSTRACT CLASS
abstract class Animal
{
public abstract void sound();
}
class Dog extends Animal
{
public void sound()
{
System.out.println("woof");
}
}
class Lion extends Animal
{
public void sound()
{
System.out.println("Roar");
}
}
class Cat extends Animal
{
public void sound()
{
System.out.println("Meow");
}
}
class Test
{
public static void main(String args[])
{
Animal a;
a=new Dog();
a.sound();
a=new Lion();
a.sound();
a=new Cat();
a.sound();
}
}
