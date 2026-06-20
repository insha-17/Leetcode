class Solution {
    public long subArrayRanges(int[] nums) {
    return sumSubarrayMax(nums)-sumSubarrayMin(nums);
    }
    //nearest smallest element
    public int[] NSE(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()] >=arr[i]){
                st.pop();
            }
            ans[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
        return ans;
    }
    //nearest greatest elemet
    public int[] NGE(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()] <=arr[i]){
                st.pop();
            }
            ans[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
        return ans;
    }
    // prev smallest equal element
    public int[] PSEE(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }
            ans[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        return ans;
    }

    public int[] PGEE(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()] < arr[i]){
                st.pop();
            }
            ans[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        return ans;
    }

    //sumSubarrayMinimum

    public long sumSubarrayMin(int[] arr){
        int n=arr.length;
        int []nse=NSE(arr);
        int [] psee=PSEE(arr);
        long sum=0;
        
        for(int i=0;i<n;i++){
            int left=i - psee[i];
            int right=nse[i] - i;
            long freq= 1L * left *right;
            sum+=arr[i] *freq;
        }
        return sum;
    }
     public long sumSubarrayMax(int[] arr){
        int n=arr.length;
        int []nge=NGE(arr);
        int [] pgee=PGEE(arr);
        long sum=0;
        
        for(int i=0;i<n;i++){
            int left=i - pgee[i];
            int right=nge[i] - i;
            long freq = 1L * left *right;
            sum+=arr[i] *freq;
        }
        return sum;
    }
}