import java.util.*;

public class Stack {
    static ArrayList<Integer> stack = new ArrayList<Integer>();
    public static void main(String[] args){
        push(1);
        push(5);
        push(3);
        push(11);
        push(8);
        System.out.println("size " + size());
        System.out.println("pop " + pop());
        System.out.println("peek " + peek());
        System.out.println("size " + size());

    }

    public static void push(int element){
        stack.addFirst(element);
    }

    /**
     * @return the first element in stack then removes it
     */
    public static int pop(){
        if (!isEmpty())
            return stack.removeFirst();
        else
            throw new EmptyStackException();
    }

    /**
     * @return the first element in stack
     */
    public static int peek(){
        return stack.getFirst();
    }

    /**
     * @return the length of stack
     */
    public static int size(){
        return stack.size();
    }

    /**
     * @return true if stack is empty, false otherwise
     */
    public static boolean isEmpty(){
        return stack.isEmpty();
    }
}
