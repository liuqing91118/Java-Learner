import java.util.*;

public class ArrayClassObject
{
  public static void main(String[] args)
  {
    Random rand=new Random(47);
    int[] a=new int[rand.nextInt(10)];

    for(int i=0; i<a.length; i++)
    {
      a[i]=rand.nextInt(500);
    }

    int[] b=a;
    
    Integer[] c=new Integer[] {1, new Integer(2), new Integer(3)};
    Integer[] d={1,new Integer(3), new Integer(2)};

    System.out.println("The length of the array is: "+a.length);
    System.out.println(Arrays.toString(a));
    System.out.println(Arrays.toString(b));

    for (int i=0; i<a.length; i++)
    {
      a[i]=a[i]+1;
    }

    System.out.println(Arrays.toString(c));
    System.out.println(Arrays.toString(d));
  }
}
