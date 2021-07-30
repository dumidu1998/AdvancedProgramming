class Queue {

    private int[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    // Constructor for init the queue
    Queue(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    // Enqueue method
    void enqueue(int value) {
        if (count == capacity) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = value;
        count++;
    }

    // Dequeue method
    int dequeue() {
        if (count == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int out = arr[front];
        front = (front + 1) % capacity;
        count--;
        return out;
    }

    // main method
    public static void main(String args[]) {

        System.out.println("Queue Implementation!!");

        Queue queue = new Queue(7); // create queue object

        // Enqueue
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);

        // Dequeue and Print
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }

}
