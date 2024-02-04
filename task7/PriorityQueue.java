public class PriorityQueue {
    int[] items;
    int size = 0;
    int count = 0;

    public PriorityQueue(int size) {
        this.size = size;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == size;
    }

    private int getIndex(int item) {
        int i = count -1 ;
        for (; i >= 0; i--) {
            if (items[i] > item)
                items[i + 1] = items[i];
            else
                break;
        }
        return  i+1 ;
    }


    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("The queue is full");
        }
        int i = getIndex(item);
        items[i]= item;
        count ++ ;
    }
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
        }
            int temp = items[0];
            for (int i =0; i <count-1;i++){
                items[i] = items[i+1] ;
                count -- ;
            }
              return temp ;
        }
        public int size(){
        return count ;
        }

    }
