class MinStack {
    Stack<Integer> st;
    public MinStack() {
       st=new Stack<>(); 
    }
    
    ArrayList<Integer> list=new ArrayList<>();

    public void push(int val) {
        if(list.isEmpty()){
            list.add(val);
        }else{
            int min=Math.min( list.get(list.size()- 1),val);
            list.add(min);

        }
       st.push(val); 
    }
    
    public void pop() {
        list.remove(list.size()-1);
        st.pop(); 
      
    }
    
    public int top() {
       return st.peek(); 
    }
    
    public int getMin() {
      return list.get(list.size()-1);  
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */