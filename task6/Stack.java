import java.lang.Exception;

public class Stack <T>{
    int size;
    Object[] items;
    int numOfItems;

    public Stack() {
        this.size = 20;
         items = new Object[size] ;
    }

    public Stack(int size) {
        this.size = size;
        items = new Object[size];
    }

    public boolean isEmpty() {
        return numOfItems == 0;
    }

    public void createNewArray() {
        Object[] array = new Object[size * 2];
        for (int i = 0; i < items.length; i++)
            array[i] = items[i];
        items = array;
    }

    public void push(Object value) {
        if (numOfItems == size) {
            createNewArray();
        }
        items[numOfItems] = value;
        numOfItems++;
    }

    public Object pop() {
        if (isEmpty()) {
            throw new RuntimeException("no stack");
        }
        Object last = items[numOfItems - 1];
        numOfItems--;
        return last;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new RuntimeException("no stack");
        }
        return items[numOfItems - 1];
    }
}
