import java.util.*;

class Level
{
  float a=1;
}

public class E03_AliaseFloat
{
  static void change(Level x)
  {
    x.a=2;
  }

  public static void main(String[] args)
  {
    Level st=new Level();
    System.out.println("The origin value is: "+st.a);
    change(st);
    System.out.println("The current value is: "+st.a);
  }
}
