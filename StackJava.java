import java.util.Stack;

public class StackJava {

    public static void main(String[] args) {

        Stack<String> animal  =new Stack<>();

        animal.push("Dog");
        animal.push("Tiger");
        animal.push("Leopard");
        animal.push("Giraffe");

        //it will into string array.
        System.out.println("Stack is " + animal);


        //to see which element is on top. to do do that we use top()
        System.out.println(animal.peek());

        //to remove element fron stack we use pop()
        animal.pop();

        System.out.println(animal.peek());
        
    }
}
