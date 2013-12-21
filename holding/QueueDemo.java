import java.util.*;

public class QueueDemo
{
  public static void printQ(Queue queue)
  {
    while (queue.peek()!=null)
    {
      System.out.print(queue.remove()+" ");
    }

    System.out.println();
  }

  public static void main(String[] args)
  {
    Queue<Integer> queue1=new LinkedList<Integer>();
    Random rand=new Random();
    
    for(int i=0; i<10; i++)
    {
      int p=rand.nextInt(10);
      queue1.offer(i+p);
    }

    printQ(queue1);

    Queue<Character> queue2=new LinkedList<Character>();

    for (char c: "ABCDEFG".toCharArray())
    {
      queue2.offer(c);
    }

    printQ(queue2);
  }
}
