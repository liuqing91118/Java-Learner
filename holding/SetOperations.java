import java.util.*;

public class SetOperations
{
  public static void main(String[] args)
  {
    Set<String> set1=new HashSet<String>();
    Collections.addAll(set1, "A B C D E F G H I J K L".split(" "));
    System.out.println(set1);
    set1.add("M");
    System.out.println(set1);
    System.out.println("Contains M:"+set1.contains("M"));
    System.out.println("Contains N:"+set1.contains("N"));
    Set<String> set2=new HashSet<String>();
    Collections.addAll(set2, "H I J K L".split(" "));
    System.out.println(set2);
    System.out.println("set2 in set1:"+set1.containsAll(set2));
    set1.remove("H");
    System.out.println("set1 after remove:"+set1);
    System.out.println("set2 in set1:"+set1.containsAll(set2));
    set1.removeAll(set2);
    System.out.println("set2 removed from set1:"+set1);
  }
}
