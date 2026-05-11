
class MyStack {
    private int[] arr;
    private int size = 1000;
    private int top;

    public MyStack() {
        arr = new int[size];
        top = -1;    
    }
    
    public void push(int x) {
        if(top >= size - 1){
            return;
        }
        arr[++top] = x;
    }
    
    public int pop() {
        if(top == -1){
            return -1;
        }
        return arr[top--];
    }

    
    public int top() {
        if(top == -1){
            return -1;
        }
        return arr[top];
    }
    
    public boolean empty() {
        return(top == -1);
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */