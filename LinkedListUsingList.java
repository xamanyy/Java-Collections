import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListUsingList {
  
  public static void main(String args[])
  {
      List<String> ipl = new LinkedList<>();
      
      //to add element we use add.
      ipl.add("RCB");
      ipl.add("CSK");
      ipl.add("KKR");
      ipl.add("MI");
      ipl.add("DC");
      System.out.println(ipl);

      //to get an element from a particular location.
      System.out.println(ipl.get(3));

      //if you want to set an element at particular index.
      ipl.set(4,"RR");
      System.out.println(ipl);

      //If you want to remove an elemnt from an particular index.
      ipl.remove(4);
      System.out.println(ipl);


      //for loop.
      System.out.println("FOR LOOP");
      for(int i =0;i<ipl.size();i++)
      {
        System.out.println(ipl.get(i));
      }

      //for each loop.
      System.out.println("FOR EACH LOOP");
      for(String ele : ipl)
      {
          System.out.println(ele);
      }


      //Looping through using Iterator.
      System.out.println("ITERATOR LOOP");
      Iterator<String> it = ipl.iterator();

      while(it.hasNext())
      {
          System.out.println(it.next());
      }

  }
}
