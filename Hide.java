class Homer
{
  char f(char c)
  {
    System.out.println("Char input!");
    return 'd';
  }

}

class NewHomer extends Homer
{
  @Override int f(int a)
  {
    System.out.println("int input!");
    return 1;
  }
}

public class Hide
{
  public static void main(String[] args)
  {
    NewHomer st=new NewHomer();
    st.f('a');
//    st.f('a');
  }
}
