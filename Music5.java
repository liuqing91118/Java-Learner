interface Instrument
{
  void play(int n);
  void adjust();
}

class Wind implements Instrument
{
    public void play(int n)
    {     
      System.out.println(this+".play()"+n);
    }
    
  public String toString()
  {return "Wind";}

  public void adjust()
  {
    System.out.println(this+".adjust()");
  }
}

class Percussion implements Instrument
{
    public void play(int n)
    {
      System.out.println(this+".play()  "+n);
    }
    
  public String toString()
  {return "Percussion";}

  public void adjust()
  {
    System.out.println(this+".adjust()");
  }
}

class Stringed implements Instrument
{
    public void play(int n)
    {
      System.out.println(this+".play()"+n);
    }
    
  public String toString()
  {return "Stringed";}

  public void adjust()
  {
    System.out.println(this+".adjust()");
  }
}

class Brass extends Wind
{
  public String toString()
  {
    return "Brass";
  }
}

class Woodwind extends Wind
{
  
}
public class Music5
{
  static void tune(Instrument i)
  {
    i.play(23);
  }

  static void tuneAll(Instrument[] e)
  {
    for(Instrument i:e)
    tune(i);
  }

  public static void main(String[] args)
  {
    Instrument[] st={new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind()};
    tuneAll(st);
  }
}
