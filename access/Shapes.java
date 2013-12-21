import access.shape.*;

public class Shapes
{
  private static generateShape st=new generateShape();

  public static void main(String[] args)
  {
    shape[] array_1=new shape[10];

    for (int i=0; i<10; i++)
    {
      array_1[i]=st.next();
    }

    for(shape s:array_1)
    s.draw();
  }
}
