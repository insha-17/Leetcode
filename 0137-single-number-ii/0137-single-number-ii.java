class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> num=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int key=nums[i];
            num.put(key,num.getOrDefault(key,0)+1);
            }
        for(int key:num.keySet()){
            if(num.get(key)==1)
                return key;
        }
      return -1; 
    }
}