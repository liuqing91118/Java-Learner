class Cup
{
  Cup(int n)
  {
    System.out.println("Constructor of Cup: "+n);
  }

  void f(int n)
  {
    System.out.println("f("+n+")");
  }
}

class Cups
{
  static Cup Cup_1;
  static Cup Cup_2;
  static
  {
    Cup_1=new Cup(1);
    Cup_2=new Cup(2);
  }

  Cups(int n)
  {
    System.out.println("Constructor of Cups: "+n);
  }

  void f(int n)
  {
    System.out.println("The f function of Cups: "+n);
  }
}

public class ExplicitStatic
{
  public static void main(String[] args)
  {
    System.out.println("In main function:");
   // Cups.Cup_1.f(1);
  }
}
