class MyQueue {

    Stack<Integer> ss = new Stack<>();
    Stack<Integer> gg = new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        ss.push(x);
        
    }
    
    public int pop() {
       
    if(gg.isEmpty())
    {
        while(!ss.isEmpty())
        {
            gg.push(ss.pop());
        }
       
      
    }
    return gg.pop();
    }
    
    public int peek() {

        if(gg.isEmpty())
        {
            while(!ss.isEmpty())
            {
                gg.push(ss.pop());
            }
       }
       return gg.peek();
      
    }
    
    public boolean empty() {

        return ss.isEmpty() && gg.isEmpty();
        
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