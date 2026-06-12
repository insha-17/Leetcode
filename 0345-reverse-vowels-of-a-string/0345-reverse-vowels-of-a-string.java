class Solution {
    public String reverseVowels(String s) {
      int n=s.length();
      Set<Character> set= Set.of('a','A','e','E','i','I','o','O','u','U');

      char[] arr=s.toCharArray();
      int lp=0;
      int rp=n-1;
      while(lp<n && rp< n && lp<rp){
        if(!set.contains(arr[lp])){
            lp++;
        }else if(!set.contains(arr[rp])){
            rp--;
        }
        else {
            if(set.contains(arr[lp]) && set.contains(arr[rp])){
                char temp=arr[lp];
                arr[lp]=arr[rp];
                arr[rp]=temp;
            }
            lp++;
            rp--;
        }
      } 
      return String.valueOf(arr); 
    }
}