class Solution {
    public boolean isHappy(int n) {
    int slow=n;
    int fast=n;
    do{
        slow=getSquares(slow);
        fast=getSquares(getSquares(fast));
    }while(slow!=fast);
    return slow==1;
    }
     public int getSquares(int n){
        int sum=0;
        int x=n;
        while(x>0){
            int rem=x%10;
            sum+=rem*rem;
            x/=10;
        }
         return sum;
        }
}