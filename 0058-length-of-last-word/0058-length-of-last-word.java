class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        if(s.length()==1)return 1;
      int i=s.length()-1;
      int cnt=0;
      while(i>=0){
        if(s.charAt(i)!=' ') cnt++;
        else break;
        i--;
        
      } 
      return cnt;  
    }
}