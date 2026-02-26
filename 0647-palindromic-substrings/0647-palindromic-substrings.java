class Solution {
    public int countSubstrings(String s) {
        int cnt=0;

        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String sb =s.substring(i,j);  
                StringBuilder reversed = new StringBuilder(sb).reverse();
                if(sb.equals(reversed.toString()))cnt++;
            }
        }
      return cnt;  
    }
}