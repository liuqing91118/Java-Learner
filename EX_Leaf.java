public class EX_Leaf
{
  int i=0;
  EX_Leaf increment()
  {
    i++;
    print();
    this.print();
    return this;
  }

  void print()
  {
    System.out.println("i= "+i);
  }
public static void main(String[] args)
{
 EX_Leaf st=new EX_Leaf();
  st.increment();
}
}
