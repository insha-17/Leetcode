class Solution {
    public int[] nextGreaterElements(int[] nums) {
       int []ans=new int[nums.length];
       for(int i=0;i<nums.length;i++){
        ans[i]=-1;
       } 
       for(int i=0;i<nums.length;i++){
        for(int j=1;j<nums.length;j++){
            if(nums[(i+j) % nums.length] >nums[i]){
                ans[i]=nums[(i+j)%nums.length];
                break;
            }
        }
       }
       return ans;
    }
}