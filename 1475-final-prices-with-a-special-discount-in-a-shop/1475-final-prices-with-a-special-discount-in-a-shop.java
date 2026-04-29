class Solution {
    public int[] finalPrices(int[] prices) {

        int n=prices.length;
        int [] arr= new int [n];

        for(int i=0;i<n-1;i++){
            int j=i+1;
            arr[i]=prices[i];
           while(j<n){
            if(prices[j]<=prices[i]){
             arr[i]=prices[i]-prices[j]; 
             break;
           }else
           j++;   
            }
        }
        arr[n-1]=prices[n-1];
        return arr;
    }
}