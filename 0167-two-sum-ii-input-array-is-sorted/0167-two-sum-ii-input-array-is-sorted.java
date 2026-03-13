class Solution {
    public int[] twoSum(int[] numbers, int target) {
 
    //    for(int i=0;i<numbers.length-1;i++){
    // //      for(int j=i+1;j<numbers.length;j++){
    //     int i=0;
    //     int j=i+1;
    //     while(i<numbers.length-1  && i<j){
    //     if(numbers[i]+numbers[j]==target ){
    //         arr[0]=i+1;
    //         arr[1]=j+1;
    //         i++;
    //         j++;
        
    //     }
         
    //    }
    int low=0;
    int high=numbers.length-1;
    while(low<high){
        int sum=numbers[high]+numbers[low];
       if(sum==target){
        return new int[]{low+1,high+1};
       }
       else if(sum>target){
        high--;
       }else{
        low++;
       }
    }
       return new int[]{-1,-1};

    }
}