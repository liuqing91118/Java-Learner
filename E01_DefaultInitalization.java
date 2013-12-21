import java.util.*;

class Data
{
 int a;
}

public class E01_DefaultInitalization
{
  int i;
  char j;

  public E01_DefaultInitalization()
  {
    System.out.println(i);
    System.out.println(j);
  }

  public static void main(String[] args)
  {
    new E01_DefaultInitalization();
    Data st=new Data();
    System.out.println(st.a);
  }
}

