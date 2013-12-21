class Insect
{
  int Initalization(String s)
  {
    System.out.println(s);
    return 1;
  }

  private int num=Initalization("In the Insect class!");
}

public class Beetle extends Insect
{
  private int num1=Initalization("In the Beetle class!");

  public static void main(String[] args)
  {
    System.out.println("In main function:");
    Beetle b=new Beetle(); 
  }
}
