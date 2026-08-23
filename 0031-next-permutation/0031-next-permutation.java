class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int ind=-1;

        for(int i =n-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                ind=i;
                break;
            }
        }

        if(ind == -1){
            reverse(nums, 0, n-1);
            return;
        }

        for(int i =n-1;i>ind;i--){
            if(nums[i] > nums[ind]){
                int temp = nums[ind];
                nums[ind]=nums[i];
                nums[i]=temp;
                break;
            }
        }
        reverse (nums , ind +1, n-1);
    }

    static void reverse(int [] nums,int low ,int high){
        
        while(low<high){
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
        }
    }
}
//       int n=nums.length;
//         int ind=-1;

//       for(int i=n-2;i>=0;i--){
//           if(nums[i]<nums[i+1]){
//               ind=i;
//               break;
//           }
//       }
//       if(ind==-1){
//           reverse(nums,0,n-1);
//           return;
//       }
//       for(int i=n-1;i>ind;i--){
//           if(nums[i]>nums[ind]){
//               int temp=nums[i];
//               nums[i]=nums[ind];
//               nums[ind]=temp;
//               break;
//           }
//       }
//       reverse(nums,ind+1,n-1);
//     }
//   static  void  reverse(int[] nums,int low,int high){
// //        int n=nums.length;
// //        low=0;
// //        high=n-1;
//       while (low < high) {
//           int temp = nums[low];
//           nums[low] = nums[high];
//           nums[high] = temp;
//           low++;
//           high--;
//       }
    
