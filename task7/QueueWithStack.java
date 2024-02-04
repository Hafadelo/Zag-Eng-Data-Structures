import java.util.Stack;

public class QueueWithStack {
    public Stack<Integer> stack1 = new Stack<>();
    public Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int value) {
        stack1.push(value);
    }

    public int dequeue() {
        if (isEmpty())
            System.out.println("its empty");
        if (stack2.isEmpty())
            moveOneToTwo();
        return stack2.pop();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public void moveOneToTwo() {
        while (!stack1.isEmpty())
            stack2.push(stack1.pop());

    }

    public int peek() {
        if (isEmpty())
            System.out.println("its empty");
        if (stack2.isEmpty())
            moveOneToTwo();
        return stack2.peek();
    }

    public static void reversedQueue(QueueWithStack queue) {
        Stack<Integer> reverse = new Stack<>();
        while (!queue.isEmpty()) {
            reverse.push(queue.dequeue());
        }
        while (!reverse.isEmpty())
            queue.enqueue(reverse.pop());
    }

}
