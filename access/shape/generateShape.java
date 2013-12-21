package access.shape;
import java.util.*;

public class generateShape
{
  private Random rand=new Random(47);
  public shape next()
  {
    switch(rand.nextInt(3))
    {
      default:
      case 0: return new shape(); 
      case 1: return new circle(); 
      case 2: return new square();
    }
  }

}
