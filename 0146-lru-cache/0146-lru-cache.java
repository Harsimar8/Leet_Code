class Node{
    Node prev, next;
    int key, value;
    Node(int key, int value){
        this.key = key;
        this.value = value;
    }
}
class LRUCache {
    private final int capacity;
    private final HashMap<Integer,Node> mpp;
    private final Node head, tail;

    public LRUCache(int capacity) {
        this.capacity =  capacity;
        this.mpp = new HashMap<>();
        head = new Node(0,0);
        tail = new Node(0,0);  
        head.next = tail;
        tail.prev = head;  
    }
    
    public int get(int key) {
        if(!mpp.containsKey(key)) return -1;
        Node node  = mpp.get(key);
        node.value = node.value;
        remove(node);
        insertAtfront(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if(mpp.containsKey(key)){
            Node nn = mpp.get(key);
            nn.value = value;
            remove(nn);
            insertAtfront(nn);

        }
        else{
            if(mpp.size() == capacity){
                 Node lru = tail.prev;
                 
                 remove(lru);
                
                mpp.remove(lru.key);
            }
        
        Node newN = new Node(key, value);
        insertAtfront(newN);
        mpp.put(key,newN);
        }

    }
    private void remove(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    private void insertAtfront(Node node){
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */