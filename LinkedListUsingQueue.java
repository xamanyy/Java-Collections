import java.util.Queue;
import java.util.LinkedList;

public class LinkedListUsingQueue {

  public static void main(String[] args) {
    
    Queue<Integer> natural = new LinkedList<>();

    //to insert element we use offer().
    natural.offer(11);
    natural.offer(222);
    natural.offer(3333);
    System.out.println(natural);

    //to check the size of an LinkedList.
    System.out.println(natural.size());


    //to remove and return the element we use poll().
    System.out.println(natural.poll());

    //to peek an element which is at the front we use peek().
    System.out.println(natural.peek());



    //We also have 3 function adjacent to thuis which are add,element and remove.

    /*
     * -> Add function just insert the element if it is successfully added then it will return true.
     * otherwise it will throw an exception.
     * 
     * -> Element function is just used to peek the element which next to front in queue.It also throw an
     * exception when the queue is empty.
     * 
     * ->Remove function is also throws an exception , it is just return ad remove the element from LinkedList.
     */

  }
}
