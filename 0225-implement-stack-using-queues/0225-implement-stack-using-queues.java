class MyStack {
    Queue<Integer> ss = new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        ss.offer(x);

        for(int i = 0; i < ss.size()-1;i++)
        {
            ss.offer(ss.poll());
        }
    }
    
    public int pop() {
        return ss.poll();
        
    }
    
    public int top() {
        return ss.peek();
    }
    
    public boolean empty() {
        return ss.isEmpty();
        
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