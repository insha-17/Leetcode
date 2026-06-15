class Solution {
    public int numIdenticalPairs(int[] nums) {
      int n=nums.length;
      int cnt=0;

      int i=0;
      while(i<n){
        int j=i+1;
        while(j<n){
            if(nums[i]==nums[j]){
                cnt++;
            }
            j++;
        }
        i++;

      }  
    return cnt;
    }
}