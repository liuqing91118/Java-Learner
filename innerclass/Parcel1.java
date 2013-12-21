public class Parcel1
{
  class Contents
  {
    private int i=11;
    public int value() {return i;}
  }

  class Destination
  {
    private String Label;

    Destination(String whereTo)
    {
      Label=whereTo;
    }

    String readLabel() {return Label;}
  }

  public void ship(String dest)
  {
    Contents content=new Contents();
    Destination destination=new Destination(dest);
    System.out.println(destination.readLabel());
  }

  public Destination to()
  {
    return new Destination("From the to method!");
  }

  public static void main(String[] args)
  {
   Parcel1 p=new Parcel1();
   p.ship("Hello World!");
   Destination d=p.to();
   System.out.println(d.readLabel());
  }
}
