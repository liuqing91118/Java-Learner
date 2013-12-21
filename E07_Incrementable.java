import java.util.*;

class Data
{
  static int temp=1;
}

public class E07_Incrementable
{
  static void Increment()
   {
     Data.temp++;
   }

   public static void main(String[] args)
   {
     Data data=new Data();
     E07_Incrementable stl=new E07_Incrementable();
     stl.Increment();
     Increment();
     E07_Incrementable.Increment();
     System.out.println(data.temp);
   }
}
