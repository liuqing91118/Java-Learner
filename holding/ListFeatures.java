import java.util.*;
import typeinfo.pets.*;

public class ListFeatures
{
  public static void main(String[] args)
  {
    Random rand=new Random(47);
    List<Pet> pets=Pets.arrayList(7);
    System.out.println("1 "+ pets);
    Hamster h=new Hamster();
    pets.add(h);
    System.out.println("2 "+pets);
    System.out.println("3 "+pets.contains(h));
    pets.remove(h);
    System.out.println("4 "+pets);
    Pet p=pets.get(2);
    System.out.println("5 "+p+" "+pets.indexOf(p));
    Pet cymric=new Cymric();
    System.out.println("6 "+pets.remove(cymric));
    System.out.println("7 "+pets);
    System.out.println("8 "+pets.remove(p));
    System.out.println("9 "+pets);
    pets.add(3, new Mouse());

    List<Pet> sub=pets.subList(1,4);
    System.out.println("sublist: "+sub);
    System.out.println("10 "+pets.containsAll(sub));
    Collections.sort(sub);
    System.out.println("11 "+sub);
    Collections.shuffle(sub, rand);
    System.out.println("12 "+sub);

    List<Pet> copy=new ArrayList<Pet>(pets);
    sub=Arrays.asList(pets.get(1), pets.get(4));
    System.out.println("sub "+sub);
    copy.retainAll(sub);
    System.out.println("13 "+copy);
  }
}
