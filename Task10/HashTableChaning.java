import javax.swing.*;
import java.util.LinkedList;

public class HashTableChaning<K, V> {
    int count = 0;

    private class Node {
        private K key;

        public Node(K key, V val) {
            this.key = key;
            this.val = val;
        }

        private V val;
    }

    private LinkedList<Node>[] ht;

    public HashTableChaning(int value) {
        ht = new LinkedList[value];
    }

    private int hash(K key) {
        return key.hashCode() % ht.length;
    }

    public void put(K key, V value) {
        Node parametar = new Node(key, value);
        int position = hash(key);
        if (ht[position] == null)
            ht[position] = new LinkedList<>();
        for (Node var : ht[position])
            if (var.key == key) {
                var.val = value;
                return;
            }
        ht[position].add(parametar);
        count++;
    }

    public V get(K key) {
        int position = hash(key);
        if (ht[position] == null) {
            throw new RuntimeException("no such elemnt");
        } else {
            for (Node element : ht[position]) {
                if (element.key == key)
                    return element.val;
            }
        }

        return null;
    }

    public void remove(K key) {
        int position = hash(key);
        if (ht[position] == null) {
            throw new RuntimeException("no such elemnt");
        } else {
            for (Node element : ht[position]) {
                if (element.key == key)
                    ht[position].remove();
                count--;
                return;
            }
        }
        throw new RuntimeException("no such elemnt");

    }

    public int size() {
        return count;
    }
}
