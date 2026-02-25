class Solution {
    public String removeOuterParentheses(String s) {
        int cnt=0;
         StringBuilder p= new StringBuilder();
        for(int i=0;i<s.length();i++){   
           if(s.charAt(i)=='(') {
              if(cnt>0){
              p.append(s.charAt(i));
             }
            cnt++;
            }
        else {
             cnt--;
            if(cnt>0){
            p.append(s.charAt(i));
                }
              }
        }
        
    return p.toString();

    }
}