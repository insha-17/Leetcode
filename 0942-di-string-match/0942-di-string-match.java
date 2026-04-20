class Solution {
    public int[] diStringMatch(String s) {
      int n=s.length(); 
      int [] perm=new int[n+1];
      int i=0;
      int j=n;
      for(int k=0;k<n;k++){
        if(s.charAt(k)=='I'){
            perm[k]=i++;
          
        }
        else{
            perm[k]=j--;
          
        }
      }
      perm[n]=i;
      return perm;
    }
}