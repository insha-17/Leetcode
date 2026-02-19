class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] ans={-1,-1};
       //for first occcurence
        int low=0;
        int high=nums.length-1;
        int first = -1;
        int last=-1;
       //BS for first occurence
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                first=mid;
                high=mid-1;
            }
            else if(target>nums[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        }
        //last occurence
           low=0;
          high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                last=mid;
                low =mid+1;
            }
            else if(target>nums[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        }
        ans[0]=first;
        ans[1]=last;
       return ans;
       
    }
}