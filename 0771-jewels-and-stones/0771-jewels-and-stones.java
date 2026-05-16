class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int n=stones.length();
        int m=jewels.length();

        int cnt=0;
        for(char c:stones.toCharArray()){
          for(int i=0;i<m;i++){
            if(c==jewels.charAt(i)){
                cnt++;
                break;
            }
          }
        }
        return cnt;
    }
}