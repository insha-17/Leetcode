class Solution {
    public List<Integer> majorityElement(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<>(); 
      int m= (nums.length/3);
      List<Integer> list=new ArrayList<>();
       for(int key:nums){
        map.put(key,map.getOrDefault(key,0)+1);
       }
       for(int num:map.keySet()){
        if(map.get(num)>m){
            list.add(num);
        }
       }
       return list;  
    }
}