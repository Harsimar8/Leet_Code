class MyQueue {

    int[] arr;
    int front;
    int rear;
    int size;

    public MyQueue() {
        size = 1000;
        arr = new int[size];
        front = 0;
        rear = -1;
    }
    
    public void push(int x) {

        if(rear == size - 1){
            return;
        }

        arr[++rear] = x;
    }
    
    public int pop() {

        if(empty()){
            return -1;
        }

        return arr[front++];
    }
    
    public int peek() {

        if(empty()){
            return -1;
        }

        return arr[front];
    }
    
    public boolean empty() {

        return front > rear;
    }
}