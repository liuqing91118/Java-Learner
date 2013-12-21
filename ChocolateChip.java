import access.local.*;

public class ChocolateChip extends Cookie
{
  ChocolateChip()
  {
    System.out.println("The ChocolateChip Constructor!");
  }

  public void Chomp()
  {
    bite();
  }

  public static void main(String[] args)
  {
    ChocolateChip st=new ChocolateChip();
    st.Chomp();
  }
}
