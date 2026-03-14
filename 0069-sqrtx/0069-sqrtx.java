class Solution {
    public int mySqrt(int x) {
      if(x<2) return x;
    
      int low=1;
      int high=x/2;
      int ans=0;
      while(low<=high){
     int mid=(low+high)/2;
       long sq = (long) mid * mid;
     if(sq==x){
        return (int) mid;
       
        }
     else if(sq<x){
        ans=mid;
        low=mid+1;
     }  else{
        high=mid-1;
     }
      }
     return (int)ans; 
    }
}