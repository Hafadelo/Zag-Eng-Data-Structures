import java.util.LinkedList;

public class HashTableLinear<K, V> {
    int count = 0;

    private class Node {
        private K key;

        public Node(K key, V val) {
            this.key = key;
            this.val = val;
        }

        private V val;
    }

    private Node[] ht;

    public HashTableLinear(int value) {
        ht =(Node[]) new Object[value];
    }

    private int hash(K key) {
        return key.hashCode() % ht.length;
    }

    public void put(K key, V value) {
        Node parametar = new Node(key, value);
        int position = hash(key);
        if (ht[position] == null) {
            ht[position] = parametar;
            return;
        } else {
            position = hash(key) + 1;
        }
        count++;
        throw new RuntimeException("there is no space");
    }

    public V get(K key) {
        int position = hash(key);
        if (ht[position] == null) {
            throw new RuntimeException("no such elemnt");
        } else {
            return ht[position].val;
        }
    }

    public void remove(K key) {
        int position = hash(key);
        if (ht[position] == null) {
            throw new RuntimeException("no such elemnt");
        } else {
            ht[position] = null;
        }
        count--;
    }

    public int size() {
        return count;
    }
}
