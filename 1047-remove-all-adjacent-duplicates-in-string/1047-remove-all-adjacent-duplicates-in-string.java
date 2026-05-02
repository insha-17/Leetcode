class Solution {
    public String removeDuplicates(String s) {
       int n=s.length();
       Stack<Character> st=new Stack<>();
       for(char c:s.toCharArray()){
        if(!st.isEmpty() && c==st.peek()){
            st.pop();
        }
        else st.push(c);
       }

       StringBuilder sb=new StringBuilder();
       for(char ch: st){
        sb.append(ch);
       }
       return sb.toString();
    }
}