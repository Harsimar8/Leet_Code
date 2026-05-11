import java.util.Queue;
import java.util.LinkedList;

class MyStack {

    Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }
    
    public void push(int x) {

        q.offer(x);

        int size = q.size();

        for(int i = 0; i < size - 1; i++){
            q.offer(q.poll());
        }
    }
    
    public int pop() {

        if(empty()){
            return -1;
        }

        return q.poll();
    }
    
    public int top() {

        if(empty()){
            return -1;
        }

        return q.peek();
    }
    
    public boolean empty() {

        return q.isEmpty();
    }
}