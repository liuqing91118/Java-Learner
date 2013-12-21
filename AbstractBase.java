abstract class NoMethod{}
abstract class WithMethod
{
  abstract public void print();
}

class Derived_1 extends NoMethod
{
  void print()
  {
    System.out.println("This is in derived_1 class!");
  }
}

class Derived_2 extends WithMethod
{
  public void print()
  {
    System.out.println("This is in derived_2 class!");
  }
}

public class AbstractBase
{
  static void f1(NoMethod a)
   {
    ((Derived_1)a).print();
   }

  static void f2(WithMethod b)
  {
    b.print();
  }
  public static void main(String[] args)
  {
    Derived_2 st2=new Derived_2();
    f2(st2);
    Derived_1 st1=new Derived_1();
    f1(st1);
  }
}
