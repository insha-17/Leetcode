class Solution {
    public int calPoints(String[] operations) {
       Stack<Integer> st=new Stack<>();
       int n=operations.length;
     
       for(int i=0;i<n;i++){
        if(operations[i].equals("D")){
            st.push(st.peek()*2);
        }
        else if(operations[i].equals("C")){
            st.pop();
        }
        else if(operations[i].equals("+") && st.size() >= 2){
           st.push(st.peek() + st.get(st.size() - 2));
        }else
        st.push(Integer.parseInt(operations[i]));
       }

       int sum=0;
       for(int s:st){
        sum+=s;
        }
       return sum;
    }
}