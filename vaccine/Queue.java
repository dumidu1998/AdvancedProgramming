public class Queue {

    private Person[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    // Constructor for init the queue
    Queue(int size) {
        arr = new Person[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    void enqueue(Person person) throws Exception {
        if (count == capacity) {
            System.out.println("Queue is full");
            throw new Exception("Queue is Full!!");
        }
        rear = (rear + 1) % capacity;
        arr[rear] = person;
        count++;
    }

    // Dequeue method
    Person dequeue() throws Exception {
        if (count == 0) {
            System.out.println("Queue is empty");
            throw new Exception("Queue is empty");
        }
        Person out = arr[front];
        front = (front + 1) % capacity;
        count--;
        return out;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    // Enqueue method

}
