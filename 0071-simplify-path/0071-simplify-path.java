class Solution {
    public String simplifyPath(String path) {

        String[] words= path.split("/");
       Stack<String> st= new Stack<>();
       int i=words.length-1;
      
      for(String part:words){
        if(part.equals("") || part.equals(".")){
            continue;
        }else if(part.equals("..")){
            if(!st.isEmpty()){
                st.pop();
            }
        }else 
        st.push(part);
        }
       StringBuilder sb= new StringBuilder();
        for(String c:st){
         sb.append("/").append(c);
        }

       return sb.length()==0 ? "/":sb.toString();

    }
}