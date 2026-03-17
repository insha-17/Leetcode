class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int []arr=new int [n];
        k=k%n;
        int i=0;
        for(int j = n - k; j < n; j++) {
            arr[i++] = nums[j];
        }

       for(int j = 0; j < n - k; j++) {
            arr[i++] = nums[j];
        }
     for(int j = 0; j < n; j++) {
            nums[j] = arr[j];
        }
        
    }
}