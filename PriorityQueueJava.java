import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueJava {
  public static void main(String[] args) {

      //MIN HEAP
      Queue<Integer> pq = new PriorityQueue<>();

      System.out.println("MIN HEAP");
      //to add element we use.
      pq.offer(199);
      pq.offer(74);
      pq.offer(40);
      pq.offer(61);
      System.out.println(pq);

      //to remove and return the elemant we use poll().
      System.out.println(pq.poll());
      System.out.println(pq);

      //to peek an element we use peek().
      System.out.println(pq.peek());


      //MAX HEAP using comparator.
      System.out.println();
      System.out.println();
      System.out.println("MAX HEAP");
      Queue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

      //again we use offer to add element.
      maxHeap.offer(6);
      maxHeap.offer(678);
      maxHeap.offer(90);
      maxHeap.offer(45);
      System.out.println(maxHeap);
  }
}
