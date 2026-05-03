class Solution {
    public String clearDigits(String s) {
       Stack<Character> st=new Stack<>();
       int n=s.length();
       for(char c:s.toCharArray()){
        if( Character.isDigit(c)){
            if(!st.isEmpty()){
            st.pop();
            }
        }else 
        st.push(c);
       } 
       StringBuilder sb=new StringBuilder();
       for(char ch: st){
        sb.append(ch);
       }
       return sb.toString();
    }
}