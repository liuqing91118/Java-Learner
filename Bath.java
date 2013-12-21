class Soap
{
  private String s="This is s, and this is Java style!";
  Soap()
  {
   // s="This is s!";
  }

  public String toString()
  {
    return s;
  }

  public static void main(String[] args)
  {
    System.out.println("This is Soap!");
  }
}
 class Bath
{
  public static void main(String[] args)
  {
   Soap st=new Soap();
   System.out.println(st);
  }
}
