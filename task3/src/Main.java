// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        DynamicArray ziad = new DynamicArray(5);
        ziad.inertItem(39);
        ziad.inertItem(20);
        ziad.inertItem(10);
        ziad.inertItem(40);
        ziad.inertItem(50);
        ziad.inertItem(60);
        ziad.removeItemWithItem(20);
        ziad.getItemIndex(30);
        ziad.printArray();
        System.out.println(ziad.getItemIndex(20));
        System.out.println(ziad.maxItem());
        System.out.println(ziad.minItem());
    }
}
