class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      List<List<Integer>> sum=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++ ){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                List<Integer> row=new ArrayList<>();
                int total=nums[i]+nums[j]+nums[k];
                if(total==0){
                    row.add(nums[i]);
                    row.add(nums[j]);
                    row.add(nums[k]);
                    sum.add(row);
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j-1]) j++;
                    while(j < k && nums[k] == nums[k+1]) k--;
                }
                else if(total>0){
                    k--;
                }
                else j++;
            }
        }
      return sum;
    }
}