public class EX_TwoConstructor
{
  EX_TwoConstructor()
  {
    this(11);
    System.out.println("This is the constuuctor without arguments!");
  }

  EX_TwoConstructor(int n)
  {
    System.out.println("The is the constructor with argument!"+n);
  }

  public static void main(String[] args)
  {
    EX_TwoConstructor st1=new EX_TwoConstructor(12);
    EX_TwoConstructor st2=new EX_TwoConstructor();
  }
}
