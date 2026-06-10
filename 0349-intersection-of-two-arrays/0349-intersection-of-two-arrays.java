class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      int n=nums1.length;
      int m=nums2.length;
      HashSet <Integer> set=new HashSet<>();
      HashSet <Integer> result=new HashSet<>();

      for(int num:nums1){
        set.add(num);
      }
      for(int e:nums2){
        if(set.contains(e)){
            result.add(e);
        }
      }
      int id=0;
      int[] res=new int[result.size()];
      for(int i:result){
        res[id++]=i;
      }
      return res;
    }
}