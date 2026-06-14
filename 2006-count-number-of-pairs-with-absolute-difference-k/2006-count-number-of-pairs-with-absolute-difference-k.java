class Solution {
    public int countKDifference(int[] nums, int k) {
    int n=nums.length;
    int cnt=0;
    int i=0;
    while(i<n){

      int j=i+1;
      while(j<n){
        if(Math.abs(nums[i]-nums[j])==k){
            cnt++;
        }
        j++;
     }
     i++;
    }
    return cnt;
    }
}