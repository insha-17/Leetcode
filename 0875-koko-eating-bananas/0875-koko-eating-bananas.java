class Solution {

    public int totalHours(int[] piles,int mid){
        int totalH=0;
        for(int e:piles){
            totalH += Math.ceil((double)e/mid);
        }
        return totalH;
    }


    public int minEatingSpeed(int[] piles, int h) {
      
      int max=Integer.MIN_VALUE;
      
      for(int e:piles){
        if(e>max)
        max=e;
      }  

      int low=1;
      int high=max;
      int k=max;
      while(low<=high){
       int mid=(low + high)/2;
       int hours=totalHours(piles,mid);
       if(hours<=h){
        k=mid;
        high=mid-1;
        }
       else if(hours>h){
        low=mid+1;
       }
       }
     return k;  
    }
    
}