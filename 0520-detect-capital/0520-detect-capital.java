class Solution {
    public boolean detectCapitalUse(String word) {
     int n=word.length();
     int uppercase=0;
    //  word=word.toCharArray();

     for(int i=0;i<n;i++){
        char c=word.charAt(i);
        if(Character.isUpperCase(c)){
            uppercase++;
        }

     }  
     return uppercase==n ||uppercase==0 || (uppercase==1 && Character.isUpperCase(word.charAt(0)));  
    }
}