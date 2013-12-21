import java.util.*;

public class E08_StaticField
{
  static int temp=8;
  public static void main(String[] args)
  {
    E08_StaticField st1=new E08_StaticField();
    E08_StaticField st2=new E08_StaticField();
    System.out.println(st1.temp+"=="+st2.temp);
    st1.temp++;
    System.out.println(st1.temp+"=="+st2.temp);
  }
}
