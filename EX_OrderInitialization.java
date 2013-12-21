class Window
{
  Window(int n)
  {
    System.out.println("Window:"+n);
  }
}

class House
{
  Window window_1=new Window(1);

  House()
  {
    System.out.println("In the constructor of House");
    Window window_3=new Window(33);
  }

  Window window_2=new Window(2);
  Window window_3=new Window(3);
}
public class EX_OrderInitialization
{
  public static void main(String[] args)
  {
    House house=new House();
  }
}
