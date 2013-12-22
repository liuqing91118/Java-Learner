import java.util.*;

public class PriorityQueueDemo
{
  public static void main(String[] args)
  {
    Random rand=new Random();
    PriorityQueue<Integer> priorityQueue1=new PriorityQueue<Integer>();

    for (int i=0; i<10; i++)
    {
      int p=rand.nextInt(10);
      priorityQueue1.offer(i+p);
    }

    QueueDemo.printQ(priorityQueue1);
    
    List<Integer> ints=Arrays.asList(25,22,20,18,14,9,3,1,1,2,3,9,14,18,21,23,25);
    priorityQueue1=new PriorityQueue<Integer>(ints);
    QueueDemo.printQ(priorityQueue1);
    priorityQueue1=new PriorityQueue<Integer>( ints.size(), Collections.reverseOrder() );
    priorityQueue1.addAll(ints);
    QueueDemo.printQ(priorityQueue1);

    String fact="Education Should ESCHEW OBFUSCATION";
    List<String> strings=Arrays.asList(fact.split(""));
    PriorityQueue<String> priorityQueue2=new PriorityQueue<String>(strings);
    QueueDemo.printQ(priorityQueue2);
    priorityQueue2=new PriorityQueue<String>(strings.size(), Collections.reverseOrder());
    priorityQueue2.addAll(strings);
    QueueDemo.printQ(priorityQueue2);
   }
}
