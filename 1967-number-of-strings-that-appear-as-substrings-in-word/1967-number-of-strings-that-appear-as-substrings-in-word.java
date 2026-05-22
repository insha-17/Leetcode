class Solution {
    public int numOfStrings(String[] patterns, String word) {
       int n=patterns.length;
       int cnt=0;

       for(String st:patterns){
        if(word.contains(st)){
            cnt++;
        }
       }
       return cnt;
    }
}