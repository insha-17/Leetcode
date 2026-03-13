class Solution {
    public boolean isSubsequence(String s, String t) {
        int cnt=0;
        int i=0;
        int j=0;
        while(i<s.length() && cnt<s.length() &&j<t.length()){
    //    for(int i=0;i<s.length();i++){
    //     for(int j=0;j<t.length();j++){
            if(s.charAt(i)==t.charAt(j)){
                cnt++;
                i++;
                j++;
            }else{
                j++;
            }
        }
       
       if(cnt==s.length()) return true;
     return false;
    }
}