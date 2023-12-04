import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        public Node(int value) {
            this.value = value;
        }

        int value;
        Node nextNode;

    }

    private Node first;
    private Node last;
    private int count;

    private boolean isTheLinkedlistEmpty() {
        return first == null;
    }

    public void addFirst(int value) {
        Node ziad = new Node(value);
        if (isTheLinkedlistEmpty())
            first = last = ziad;
        else {
            ziad.nextNode = first;
            first = ziad;
        }
        count++;
    }

    public void addLast(int value) {
        Node ziad = new Node(value);
        if (isTheLinkedlistEmpty())
            first = last = ziad;
        else {
            ziad.nextNode = null;
            last = ziad;
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

    public int indexOf(int value) {
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

    public boolean contains(int value) {
        int index = indexOf(value);
        return index != -1;
    }

    public int count() {
        return count;
    }

    public void printLinkedList(LinkedList ziad) {
        if (isTheLinkedlistEmpty())
            throw new NoSuchElementException("No list");
        if (ziad.first == ziad.last) {
            System.out.println(ziad.first.value);
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println(ziad.first.value);
                first = first.nextNode;
            }
        }
    }

    public void max(LinkedList ziad) {
        int max = ziad.first.value;
        if (isTheLinkedlistEmpty())
            throw new NoSuchElementException("No list");
        if (ziad.first == ziad.last) {
            System.out.println(ziad.first.value);
            for (int i = 0; i < count; i++) {
                if (ziad.first.value > max)
                    max = ziad.first.value;
            }
        }

    }

    public void min(LinkedList ziad) {
        int min = ziad.first.value;
        if (isTheLinkedlistEmpty())
            throw new NoSuchElementException("No list");
        if (ziad.first == ziad.last) {
            System.out.println(ziad.first.value);
            for (int i = 0; i < count; i++) {
                if (ziad.first.value < min)
                    min = ziad.first.value;
            }
        }

    }
}