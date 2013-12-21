interface CanFly
{
  void fly();
}

interface CanSwim
{
  void swim();
}

interface CanRun
{
  void run(int a);
}

class ActionCharacter
{
  public void run()
  {
    System.out.println("Run In ActionCharacter!");
  }
}

class ActionCharacter_2 extends ActionCharacter
{
  public void run(int a)
  {
    System.out.println("Run In ActionCharacter_2 "+a);
  }
}

class Hero extends ActionCharacter_2
           implements CanFly, CanSwim, CanRun
{
  public void swim()
  {
    System.out.println("Hero swim!");
  }
  public void fly()
  {
    System.out.println("Hero fly!");
  }
  public void run()
  {
    System.out.println("Hero run!");
  }
}
public class Adventure
{
  static void f(CanFly x) {x.fly();}
  static void s(CanSwim x) {x.swim();}
  static void r(CanRun x) {x.run(3);}
  static void a(ActionCharacter x) {x.run();}
  static void a_2(ActionCharacter_2 x) {x.run();}
  public static void main(String[] args)
  {
    Hero hero=new Hero();
    f(hero);
    s(hero);
    r(hero);
    a(hero);
    a_2(hero);
  }
}
