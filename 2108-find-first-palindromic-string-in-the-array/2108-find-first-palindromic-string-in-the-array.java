class Solution {
    public String firstPalindrome(String[] words) {
      int n=words.length;

      for(String word:words){
        int i=0;
        int j=word.length()-1;
        boolean palindrome=true;
        while(i<j){
            if(word.charAt(i)!=word.charAt(j)){
                palindrome=false;
                break;
            }
           
                i++;
                j--;
            }           
            if(palindrome){
                return word;
            }
           
        }  

        
      return "";
    }
}