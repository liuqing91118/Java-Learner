class Soup1
{
  private Soup1()
  {System.out.println("Constructor of Soup1!");}

  public static Soup1 makeSoup()
  {
   // Soup1 st=new Soup1();
    return new Soup1();
  }

  public void f()
  {
    System.out.println("f() of Soup1!");
  }
}

class Soup2
{
  private Soup2()
  {System.out.println("Constructor of Soup2!");}

  private static Soup2 st=new Soup2();

  public static Soup2 access()
  {
    return st;
  }

  public void f()
  {
    System.out.println("f() of Soup2!");
  }
}

public class Lunch
{
 static void TestPrivate()
  {
    Soup1.makeSoup();
    Soup1.makeSoup().f();
  }

 static  void TestStatic()
  {
    Soup2.access();
    Soup2.access().f();
  }

  public static void main(String[] args)
  {
    TestPrivate();
    TestStatic();
  }
}
