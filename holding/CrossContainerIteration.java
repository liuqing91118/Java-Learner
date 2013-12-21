import java.util.*;
import typeinfo.pets.*;

public class CrossContainerIteration
{
  public static void display(Iterator<Pet> it)
  {
    while( it.hasNext() )
    {
      Pet p= it.next();
      System.out.print(p.id()+":"+p+" ");
    }

    System.out.println();
  }

  public static void main(String[] args)
  {
    ArrayList<Pet> pets=Pets.arrayList(8);
    LinkedList<Pet> petsll=new LinkedList<Pet>(pets);
    HashSet<Pet> petshs=new HashSet<Pet>(pets);
    TreeSet<Pet> petsts=new TreeSet<Pet>(pets);

    display(pets.iterator());
    display(petsll.iterator());
    display(petshs.iterator());
    display(petsts.iterator());
  }
}
