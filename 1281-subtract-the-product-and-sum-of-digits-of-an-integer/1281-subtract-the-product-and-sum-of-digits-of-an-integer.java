class Solution {
    public int subtractProductAndSum(int n) {
       int x=n;
       int sum=0;
       int product=1;

       while(x>0){
        int rem=x%10;
        sum+=rem;
        product*=rem;
        x/=10;
       } 
       return product-sum;
       
    }
}