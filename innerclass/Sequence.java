import java.util.*;

interface Selector
{
  boolean end();

  Object current();

  void next();
}

public class Sequence
{
  private Object[] item;

  public Sequence(int size) { item=new Object[size]; }

  private int next=0;

  public void add(Object i)
  {
    if (next<item.length)
    {
      item[next++]=i;
    }
  }

  public class SequenceSelector implements Selector
  {
    private int i=0;

    public boolean end()
    {
      return i==item.length;
    }

    public Object current()
    {
      return item[i];
    }

    public void next()
    {
      i++;
    }
   }

  public SequenceSelector selector()
   {
     return new SequenceSelector();
   }

   public static void main(String[] args)
   {
     Sequence sequence=new Sequence(10);
     for (int i=0; i<10; i++)
     {
       sequence.add(Integer.toString(i));
     }

   SequenceSelector selector=sequence.selector();
     while(!selector.end())
     {
       System.out.print(selector.current()+" ");
       selector.next();
     }

   }
}
