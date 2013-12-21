enum Spiciness
{Not, Mild, Medium, Hot, Flaming}

class Cake
{
  Spiciness degree;
  Cake(Spiciness n)
  {
    degree=n;
  }
  
  void describe()
  {
    System.out.print("This cake is: ");
    switch(degree)
    {
      case Not: System.out.println("not spicy at all!"); break;
      case Mild: System.out.println("Mild!");break;
      case Medium: System.out.println("Medium");break;
      case Hot: System.out.println("Hot");break;
      case Flaming: System.out.println("Flaming");break;
      default: System.out.println("probabily hot!");
    }
  }
}


public class EnumOrder
{
public static void main(String[] args)
{
  Cake cake_1=new Cake(Spiciness.Mild);
  Cake cake_2=new Cake(Spiciness.Hot);
  Cake cake_3=new Cake(Spiciness.Medium);

  cake_1.describe();
  cake_2.describe();
  cake_3.describe();
}
}
