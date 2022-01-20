package CS221Course.src.DS_assignment7;

public class TellerQueue<E>{
    /**
     * Simulate the operation of a bank. Customers enter the bank, and there is one teller.
     * If the teller is free, that teller serves the customer.
     * Otherwise, the customer enters the queue and waits until the teller is free.
     * Make your program take in a queue of customers and determine the average processing time for the teller.
     * Optional:
     * You make the teller finish with a customer by setting a timer that will count for 15 seconds (Assuming that he took 15 minutes).
     * When the time is up, it should ask for the next customer and serve him/her.
     * You can make the customers just names or create a Customer class
     */
    //fields
    private int front;
    private int rear;
    private int size;
    private int capacity;
    private static final int INITIAL_CAPACITY = 10;
    private E[] lineToServe;

    //Constructor with default size
    public TellerQueue(){
        capacity = INITIAL_CAPACITY;
        this.lineToServe = (E[]) new Object[capacity];
    }
    //Constructor with given size
    public TellerQueue(int capacity){
        this.capacity = capacity;
        this.lineToServe =(E[]) new Object[capacity];
        this.size = 0;
        this.front = 0;
        this.rear = size -1;
    }
    //add to the line
    public boolean offer(E item){
        if(size == capacity){
            //relocate();
        }
        size++;
        rear = size-1 % capacity;
        lineToServe[rear] = item;

        return true;
    }
    //returning the element at the front without removing
    public E peek(){
        if(size == 0){
            return null;
        } else {
          return lineToServe[front];
        }
    }
    //remove from the front
    public E poll(){
        if(size == 0){
            return null;
        } else {
            E result = lineToServe[front];
            front = (front + 1) % capacity;
            size--;
            //start();
            return result;
        }
    }
    //timer
   /* public void start(){
      task.run(); //todo ---Make sure
           timer.scheduleAtFixedRate(task, size, 150000);
    }*/

    //size
    public int size(){
        return size;
    }
    //doubling the size of the array
    public void reallocate() {
        int newSize = capacity * 2;
        E[] newArray =(E[])  new Object[newSize];

        if (size == capacity)
            capacity = newSize;

        int k = front;
        for(int i = 0; i < size; i++){
            newArray[i] = lineToServe[k];
            k = (k + 1) % capacity;
        }
        front = 0;
        rear = size - 1;
        capacity = newSize;
        lineToServe = newArray;
    }

   /* Timer timer = new Timer();
    int secondPassed = 0;
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            secondPassed = 150000;
        }
    };*/

    //toString
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size - 1; ++i) {
            sb.append(lineToServe[i] + ", ");
        }
        sb.append(lineToServe[size - 1] + "]");

        return sb.toString();
    }

}
