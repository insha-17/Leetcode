class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
    Queue<int[]> q=new LinkedList<>();
 
    int n=tickets.length;
    for(int i=0;i<n;i++){
        q.offer(new int[]{tickets[i],i});
    }
    int res=0;
    while(!q.isEmpty()){
        int []curr=q.poll();
        if(curr[0]>0){
            res++;
            curr[0]--;
        }
        if(curr[1]==k && curr[0]==0){
            return res;
        }
        q.offer(curr);
       } 
    return -1;
    
    }
    
}