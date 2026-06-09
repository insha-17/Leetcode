class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        int n=nums.length;
        List<Integer> list=new ArrayList<>();
        int [] hash=new int [n];

        for(int i=0;i<n;i++){
            hash[nums[i]-1]++;
        }

        for(int i=0;i<n;i++){
            if(hash[i]==2){
                list.add(i + 1);
            }
        }
        return list;
    }
}