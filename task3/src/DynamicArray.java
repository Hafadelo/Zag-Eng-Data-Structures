public class DynamicArray {
    int[] arr;
    int size = 0;
    int count = 0;

    public DynamicArray(int n) {
        arr = new int[n];
        size = n;
    }

    public DynamicArray() {
        arr = new int[2];
        size = 2;
    }

    public void inertItem(int item) {
        if (count == size) {
            makingNewArray();
        }
        arr[count] = item;
        count++;
    }

    private void makingNewArray() {
        int[] arr2 = new int[size * 2];
        for (int i = 0; i < arr.length; i++)
            arr2[i] = arr[i];
        arr = arr2;
    }

    public void removeItemWithIndex(int index) {
        if (notAvailableIndex(index))
            throw new IllegalStateException();
        for (int i = index; i < count; i++)
            arr[i] = arr[i + 1];
        count--;
    }

    public boolean notAvailableIndex(int index) {

        return index < 0 || index > count;
    }

    public int getItemIndex(int item) {

        for (int i = 0; i < count; i++)
            if (arr[i] == item)
                return i;
        return -1;
    }

    public void removeItemWithItem(int item) {
        removeItemWithIndex(getItemIndex(item));
    }

    public void printArray() {
        for (int i = 0; i < count; i++)
            System.out.println(arr[i] + " ");
        System.out.println();
    }

    public int maxItem() {
        int max = 0;
        for (int i = 0; i < count; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public int minItem() {
        int min = arr[0];
        for (int i = 0; i < count; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    public int getItem(int index) {
        if (notAvailableIndex(index))
            throw new IllegalStateException();
        return arr[index];
    }
}
