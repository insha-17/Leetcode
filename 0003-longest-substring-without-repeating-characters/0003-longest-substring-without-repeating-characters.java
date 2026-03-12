class Solution {
   public int lengthOfLongestSubstring(String s) {
    int max=0;
    if(s.length()==1)return 1;
   
   for(int i=0;i<s.length()-1;i++){
     int cnt=0;
    HashSet<Character> set=new HashSet<>();

    for(int j=i;j<s.length();j++){
       
        if(set.contains(s.charAt(j))){
            break;
        }else{
            set.add(s.charAt(j));
            cnt++;
        }
          max=Math.max(max,cnt);
    }
   }
    return max;
    }
}