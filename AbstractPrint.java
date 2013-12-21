 abstract class BaseClass
{
  public BaseClass()
  {
    print();
  }
  public void print();
}

class DerivedClass extends BaseClass
{
  private int num=13;
  public void print()
  {
    System.out.println("It is:"+num);
  }
}

public class AbstractPrint
{
  public static void main(String[] args)
  {
    DerivedClass st=new DerivedClass();
    st.print();
  }
}
