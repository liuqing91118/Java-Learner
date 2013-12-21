class Tree{}

public class Varargs
{
  static void f(Object[] args)
  {
    for(Object s:args)
    System.out.println(s);
  }

  public static void main(String[] args)
      {
        f(new Object[]{new Integer(1), new Double(1.25)});
	f(new Object[]{new String("how")});
	f(new Object[]{new Tree(), new Tree(), new Tree()});
      }
}
