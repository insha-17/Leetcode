class Solution {
    public int majorityElement(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<>(); 
      int m= (nums.length/2);
       for(int key:nums){
        map.put(key,map.getOrDefault(key,0)+1);
       }
       for(int num:map.keySet()){
        if(map.get(num)>m){
            return num;
        }
       }
       return -1;
    }
}