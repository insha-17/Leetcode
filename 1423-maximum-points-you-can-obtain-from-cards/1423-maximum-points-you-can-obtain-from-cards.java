class Solution {
    public int maxScore(int[] cardPoints, int k) {
      int total=0;
      int n=cardPoints.length;

      for(int i=0;i<k;i++){
        total+=cardPoints[i];
      }
      int maxSum=total;
      for(int i=0;i<k;i++){
        total-=cardPoints[k-1-i];

        total+=cardPoints[n-1-i];
        maxSum=Math.max(total,maxSum);
      }
      return maxSum;
    }
}