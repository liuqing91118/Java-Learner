import java.util.*;
import typeinfo.pets.*;

public class PetMap
{
  public static void main(String[] args)
  {
    Map<String,Pet> petMap=new HashMap<String,Pet>();
    petMap.put("my cat", new Cat("Molly"));
    petMap.put("my dog", new Dog("Ginger"));
    petMap.put("my hamster", new Hamster("Bosco"));
    System.out.println(petMap);
    Pet dog=petMap.get("my dog");
    System.out.println(dog);
  }
}
