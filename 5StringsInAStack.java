import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        // 1. Create a Stack to store String elements
        Stack<String> stack = new Stack<>();

        // 2. Push 5 strings onto the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        stack.push("Date");
        stack.push("Elderberry");

        System.out.println("Printing strings from the Stack (LIFO order):");

        // 3. Print the strings using a while loop by popping them
        while (!stack.isEmpty()) {
            String item = stack.pop();
            System.out.println(item);
        }
    }
}
