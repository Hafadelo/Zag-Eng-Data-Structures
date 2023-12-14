public class StackLinkedList <T>{
    public class Node {
        T value ;
        Node button ;
        public Node (T value){
            this.value = value ;
        }
    }
    Node top ;
    public boolean isEmpty() {
        return top == null ;
    }
    public void push (T value) {
        Node newNode = new Node(value);
        newNode.button=top;
        top = newNode ;
    }
    public T pop (){
        if (isEmpty()){
            throw new RuntimeException("no stack");
        }
        T value = top.value;
        top = top.button;
        return value ;
    }
    public T peek() {
        if (isEmpty())
            throw new RuntimeException("no stack");
        T value = top.value ;
        return value ;
    }
}
