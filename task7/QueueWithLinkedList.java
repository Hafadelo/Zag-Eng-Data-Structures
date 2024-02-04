public class QueueWithLinkedList<T> {
    private Node first;
    private Node last;
    int count = 0;

    public class Node {
        T value;
        Node nextnode;

        public Node(T value) {
            this.value = value;
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public void enqueue(T item) {
        Node newNode = new Node(item);
        if (isEmpty()) {
            first = last = newNode;
        } else {
            last.nextnode = newNode;
            last = newNode;
            count++;

        }
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("the queue is empty");
        }
        T temp = first.value;
        first = first.nextnode;
        count--;
        return temp;


    }

    public T peek() {
        if (isEmpty())
            System.out.println("its empty");
        return first.value;
    }

    public int size() {
        return count;
    }

    public void printQueue() {
        Node current = first;
        while (current != null) {
            System.out.println(current.value + " ");
            current = current.nextnode;
        }
    }
}