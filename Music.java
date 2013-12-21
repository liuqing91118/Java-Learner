abstract class Cycle
{
 abstract void tune();
  //{
  //  System.out.println("In the Cycle!");
  //}
}

class Unicycle extends Cycle
{
  void tune()
  {
    System.out.println("In the Unicycle");
  }
}

class Bicycle extends Cycle
{
  void tune()
  {
    System.out.println("In the Bicycle!");
  }
}

public class Music
{
  static void play(Cycle a)
  {
    a.tune();
  }

  public static void main(String[] args)
  {
   // Cycle a=new Cycle();
    Unicycle b=new Unicycle();
    Bicycle c=new Bicycle();
   // play(a);
    play(b);
    play(c);
  }
}
