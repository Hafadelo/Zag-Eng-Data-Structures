import java.util.NoSuchElementException;

public class LinkedList<T> {
    private class Node {
        public Node(T value) {
            this.value = value;
        }

        T value;
        Node nextNode;

    }

    private Node first;
    private Node last;
    private int count;

    private boolean isTheLinkedlistEmpty() {
        return first == null;
    }

    public void addFirst(T value) {
        Node node = new Node(value);
        if (isTheLinkedlistEmpty())
            first = last = node;
        else {
            node.nextNode = first;
            first = node;
        }
        count++;
    }

    public void addLast(T value) {
        Node node = new Node(value);
        if (isTheLinkedlistEmpty())
            first = last = node;
        else {
            last.nextNode = node;
            last = node;
        }
        count++;
    }

    public void removeFirst() {
        if (isTheLinkedlistEmpty())
            throw new NoSuchElementException("No list");
        if (first == last) {
            first = last = null;
        } else {
            Node temporary = first;
            first = first.nextNode;
            temporary.nextNode = null;
        }
        count--;
    }

    public void removeLast() {
        if (isTheLinkedlistEmpty())
            throw new NoSuchElementException("No list");
        if (first == last) {
            first = last = null;
        } else {
            Node beforeLast = getBeforeLast();
            last = beforeLast;
            last.nextNode = null;
        }
        count--;
    }

    private Node getBeforeLast() {
        Node beforeLast = first;
        Node current = first;
        while (current.nextNode != null) {
            beforeLast = current;
            current = current.nextNode;
        }
        return beforeLast;
    }

    public int indexOf(T value) {
        Node current = first;
        int index = 0;
        while (current != null) {
            if (current.value == value)
                return index;
            index++;
            current = current.nextNode;
        }
        return -1;
    }

    public boolean contains(T value) {
        int index = indexOf(value);
        return index != -1;
    }

    public int count() {
        return count;
    }

    public void printLinkedList() {
        Node current = first;
        if (isTheLinkedlistEmpty())
            throw new NoSuchElementException("No list");
        if (first == last) {
            System.out.println(first.value);
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println(current.value);
                current = current.nextNode;
            }
        }
    }

    public void reverseLinkedList() {

        if (isTheLinkedlistEmpty())
            throw new NoSuchElementException("No List");
        if (first == last)
            System.out.println(first.value);
        Node previous = first;
        Node current = previous.nextNode;

        while (current != null) {
            Node next = current.nextNode;
            current.nextNode = previous;
            previous = current;
            current = next;
        }
        Node temporary = first;
        first = last;
        last = temporary;
        last.nextNode = null;
    }
}