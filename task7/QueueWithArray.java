import java.util.NoSuchElementException;

public class QueueWithArray<T> {
    T[] items;
    int size = 0;
    int count = 0;
    int first = 0;
    int last = 0;

    public QueueWithArray(int size) {
        this.size = size;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == size;
    }

    public void enqueue(T item) {
        if (isFull()) {
            System.out.println("The queue is full");
        }
        items[last] = item;
        last = last % size;
        count++;

    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
        }
        T value = items[first];
        items[first] = value;
        last = first % size;
        count--;
        return value;
    }

    public int queueSize() {
        return count;
    }

    public T peek() {
        T value = items[first];
        return value;
    }

    public void printQueue() {
        System.out.println("[");
        if (isEmpty()) {
            System.out.println(items[first]);
            int current = (first + 1) % size;
            while (current != last)
                System.out.println("," + items[current]);
            current = (current + 1) % size;
        }
    }
}