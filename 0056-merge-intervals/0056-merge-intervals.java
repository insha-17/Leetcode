class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        //sort the intervals
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result=new ArrayList<>();
        int [] current=intervals[0];  

        for(int i=0;i<n;i++){
            if(current[1]>= intervals[i][0]){
                current[1]=Math.max(current[1],intervals[i][1]);
            }else{
                result.add(current);
                current=intervals[i];
            }
        }    
        result.add(current); 
        return result.toArray(new int[result.size()][]);
    }
}