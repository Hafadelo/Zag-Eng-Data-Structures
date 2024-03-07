public class The_tree {
    public class Node {
        private int value ;
        private Node rightChild ;

        public Node(int value) {
            this.value = value;
        }

        private Node leftChild ;

    }
    private Node root ;
    public void insert (int value) {
        Node ziad = new Node(value);
        if (root == null) {
            root = ziad ;
        }
        else {
            Node parent = getParent(value);
            if (value>parent.value)
                parent.rightChild = ziad ;
            else
                parent.leftChild  = ziad ;
        }

    }

    private Node getParent(int value) {
        Node current = root ;
        Node parent = root ;
        while (current!=null){
            parent = current ;
            if (value>current.value)
                current = current.rightChild;
            else
                current = current.leftChild;
        }
        return parent;
    }
    public boolean find (int value){
        Node current = root ;
        while (current!= null){
            if (value==current.value)
                return true;
            if (value>current.value)
                current=current.rightChild;
            else
                current=current.leftChild;
        }
        return false;
    }
    public int max() {
        int max = root.value;
        Node current = root;
        while (current != null) {
            max = current.value;
            current = current.rightChild;
        }
        return max ;
    }
    public int min() {
        int min = root.value;
        Node current = root;
        while (current != null) {
            min = current.value;
            current = current.leftChild;
        }
        return min ;
    }
    private void pre0rder(Node root){
        if (root==null)
            return;
        System.out.println(root.value);
        pre0rder(root.leftChild);
        pre0rder(root.rightChild);
    }
    public void pre0rder() {
        pre0rder(root);
    }
    private void in0rder(Node root){
        if (root==null)
            return;
        pre0rder(root.leftChild);
        System.out.println(root.value);
        pre0rder(root.rightChild);
    }
    public void in0rder(){
        in0rder(root);
    }
    private void in0rderDesendng(Node root){
        if (root==null)
            return;
        pre0rder(root.rightChild);
        System.out.println(root.value);
        pre0rder(root.leftChild);
    }
    public void in0rderDesendng(){
        in0rder(root);
    }
    private void postOrder(Node root){
        if (root==null)
            return;
        pre0rder(root.leftChild);
        pre0rder(root.rightChild);
        System.out.println(root.value);
    }
    public void postOrder(){
        in0rder(root);
    }
}
