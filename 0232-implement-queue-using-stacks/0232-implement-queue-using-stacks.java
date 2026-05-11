class MyQueue {
    private int[] arr;
    private int size = 1000;
    private int front;
    private int rear;
    public MyQueue() {
        arr = new int[size];
        front = 0;
        rear = -1;
    }
    
    public void push(int x) {
        if(rear == size -1){
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
        return (front > rear);
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */