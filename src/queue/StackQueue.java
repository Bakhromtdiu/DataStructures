package queue;


import java.util.Arrays;
import java.util.Stack;

public class StackQueue {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void enqueue(int item) {
        stack1.push(item);
    }
    public void print(){
        System.out.println(Arrays.toString(stack1.toArray()));
    }
}
