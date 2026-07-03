class Solution {
    public int[] findDegrees(int[][] matrix) {
       int n=matrix.length;
       int [] ans=new int[n];


       for(int i=0;i<n;i++) {
        int[] current=matrix[i];
        int sum=0;
         for(int j=0;j<n;j++){
            sum+=current[j];
         }
        ans[i]=sum;
        }
       return ans;
    }
}