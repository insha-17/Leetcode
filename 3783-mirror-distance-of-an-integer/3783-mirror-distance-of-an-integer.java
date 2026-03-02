class Solution {
    public int mirrorDistance(int n) {
          int rev = 0;
        int x = n;
        while(x != 0){
            int lastdigit = x % 10;
            rev = rev * 10 + lastdigit;
            x /= 10;
        }
        int ans = Math.abs(n-rev);
        return ans;
    }
}