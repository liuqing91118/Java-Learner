import static access.local.Range.*;
import java.util.*;
import static  access.local.Print.*;

public class RangeTest
{
  public static void main(String[] args)
  {
    int[] array_1=Range(5);
    int[] array_2=Range(1,5);
    int[] array_3=Range(1,9,2);
    print(Arrays.toString(array_1));
    print(Arrays.toString(array_2));
    print(Arrays.toString(array_3));
   // print("hello");
  }
}
