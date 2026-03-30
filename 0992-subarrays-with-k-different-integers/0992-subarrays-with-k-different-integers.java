class Solution {
    public int atmost(int []nums,int K){
        HashMap<Integer,Integer> map =new HashMap<>();
        int i=0;
        int count=0;
        for(int j=0;j<nums.length;j++){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            if(map.get(nums[j])==1){
                K--;
            }
            while(K<0){
                map.put(nums[i],map.get(nums[i])-1);
                if(map.get(nums[i])==0){
                    K++;
                }
                i++;
            }
            count+=(j -i +1);
        }
        return count; 
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmost(nums,k)- atmost(nums,k-1);
    }
}