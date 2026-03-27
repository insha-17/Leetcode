class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
    //    int l=0; 
    //    int r=0;
    //    int sum=0;
    //    int result=0;
    //    while(r<nums.length){
    //     sum+=nums[r];
    //     if(sum==goal){
    //         result++;
    //         }
    //     if(sum>=goal){
    //         l++;}
    //     r++;
    //    } 
    //    return result;
    int count=0;
    for(int i=0;i<nums.length;i++){
        int sum=0;
        for(int j=i;j<nums.length;j++){
            sum+=nums[j];
            if(sum==goal)count++;

        }
    }
    return count;
    }
}