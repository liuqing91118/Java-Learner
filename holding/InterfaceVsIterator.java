import java.util.*;
import typeinfo.pets.*;

public class InterfaceVsIterator
{
  public static void display(Iterator<Pet> it)
  {
    while (it.hasNext())
    {
      Pet p=it.next();
      System.out.print(p.id()+":"+p+" ");
    }
    System.out.println();
  }

  public static void display(Collection<Pet> pets)
  {
    for(Pet p:pets)
    System.out.print(p.id()+":"+p+" ");
    System.out.println();
  }

  public static void main(String[] args)
  {
    List<Pet> pets=Pets.arrayList(5);
    Set<Pet> petSet=new HashSet<Pet>(pets);
    Map<String, Pet> petMap=new HashMap<String, Pet>();

    String[] strings=("Lucy, Lily, LiLei, "+"Ted, Bob").split(", ");

    for(int i=0; i<5; i++)
    {
      petMap.put(strings[i], pets.get(i));
    }

    display(pets.iterator());
    display(pets);
    display(petSet.iterator());
    display(petSet);
    display(petMap.values());
    display(petMap.values().iterator());
  }
}
