class Tree
{
  Tree(String s)
  { 
   System.out.println(s);
  }
}

public class DynamicArray
{
  public static void main(String[] args)
  {
    Tree[] tree=new Tree[3];
    
    for(int i=0; i<3; i++)
    tree[i]=new Tree("i");
  }
}
