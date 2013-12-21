import java.util.*;

class GrannySmith extends Apple
{
  public String toString() { return "GrannySmith"; }
}

class Gala extends Apple
{
  public String toString() { return "Gala"; }
}

public class upcast
{
 public static void main(String[] args)
 {
  ArrayList<Apple> apples=new ArrayList<Apple>();
  apples.add(new GrannySmith());
  apples.add(new Gala());

  for(Apple c:apples)
  System.out.println(c);
 }
}
