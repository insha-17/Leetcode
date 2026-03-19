class Solution {
    public boolean isHappy(int n) {
    HashSet<Integer> set=new HashSet<>();
    while(n!=1 && !set.contains(n)){
        set.add(n);
        int sum=0;
        int x=n;
        while(x>0){
            int rem=x%10;
            sum+=rem*rem;
            x/=10;
        }
         n=sum;
    }
     return n==1;
    }
}