// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LinkedList ziad = new LinkedList();
        ziad.addFirst(5);
        ziad.addFirst(6);
        ziad.addFirst(8);
        ziad.addFirst(10);
        ziad.printLinkedList(ziad);
        System.out.println(ziad.indexOf(6));
        System.out.println(ziad.contains(6));
    }
}
