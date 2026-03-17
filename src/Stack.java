import java.util.*;

public class Stack {
    static int[] stack = new int[0];
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
        int length = stack.length;
        int[] newStack = new int[length+1];

        System.arraycopy(stack, 0, newStack, 0, length);
        newStack[length] = element;
        stack = newStack;
    }

    /**
     * @return the first element in stack then removes it
     */
    public static int pop(){
        if (!isEmpty()){
            int length = stack.length;
            int[] newStack = new int[length-1];

            int removed = stack[0];
            System.arraycopy(stack, 1, newStack, 0, length-1);
            stack = newStack;
            return removed;
        }
        else
            throw new EmptyStackException();
    }

    /**
     * @return the first element in stack
     */
    public static int peek(){
        return stack[0];
    }

    /**
     * @return the length of stack
     */
    public static int size(){
        return stack.length;
    }

    /**
     * @return true if stack is empty, false otherwise
     */
    public static boolean isEmpty(){
        return stack.length == 0;
    }
}
