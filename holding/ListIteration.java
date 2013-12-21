import java.util.*;
import typeinfo.pets.*;

public class ListIteration
{
  public static void main(String[] args)
  {
    ArrayList<Pet> pets=Pets.arrayList(8);
    ListIterator<Pet> it=pets.listIterator();

    while( it.hasNext() )
    {
      System.out.print(it.next()+" "+it.nextIndex()+" "+it.previousIndex()+"; ");
    }

    System.out.println();

    while ( it.hasPrevious() )
    {
      System.out.print(it.previous()+" ");
    }

    System.out.println();

    it=pets.listIterator(3);
    while( it.hasNext() )
    {
      it.next();
      it.set(Pets.randomPet());
    }

    System.out.print(pets);
   }
}


