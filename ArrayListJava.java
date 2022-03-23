import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListJava{
  public static void main(String[] args) {
    
    ArrayList<String> studentName  = new ArrayList<>();


    // Internal working

    /*
        If size of an ArrayList is n and suppose if we want to add the n+1 th element into arrayList then,
        Internally it will create an another array of size n + n/2 + 1.
        And it will copy all the elements into this newly created array and dump the old array.
        So, it little bit less effeicient.  

    */

    //Adding elements into arraylist
    /*
        It will always add elemts from the backside.
    */
    studentName.add("Alexander");
    studentName.add("Harmonie");
    studentName.add("Dumbledore");
    System.out.println(studentName);

    studentName.add("Draco");
    System.out.println(studentName);


    //Suppose we want to insert an element at speciifc location
    //then also we will use add function with two argument. index and value.
    studentName.add(2,"Sylwia");
    System.out.println(studentName);


    //to fetch an value from an ArrayList we use get() function.
    System.out.println(studentName.get(1));


    //if we want to update the element in the arrayList.
    studentName.set(3,"Snape");
    System.out.println(studentName);


    //if we want to remove a particular index element.
    studentName.remove(1);
    System.out.println(studentName);


    //if we want to check whther a particular elemnt is present in the list or not.
    //it will return true or false;
    System.out.println(studentName.contains("Snape"));


    //if we want to remove an element by its value.
    studentName.remove(String.valueOf("Alexander"));
    System.out.println(studentName);


    //if we want to empty all the elements from an ArrayList.
    studentName.clear();
    System.out.println(studentName);


    //Making Another ArrayList For Iteration.
    ArrayList<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(100);
    list.add(100);
    list.add(1000);
    list.add(0);

    //Using simple for loop
    System.out.println("USING FOR LOOP");
    for(int i = 0 ;i<list.size();i++)
    {
      System.out.println(list.get(i));
    }

    //Using foreach loop.
    System.out.println("USING FOREACH LOOP");
    for(Integer element:list)
    {
      System.out.println(element);
    }

    //using Iterator Interface.
    System.out.println("USING Iterator Interface");
    Iterator<Integer> it = list.iterator();

    while(it.hasNext()) {
      System.out.println(it.next());
    }

  }
}