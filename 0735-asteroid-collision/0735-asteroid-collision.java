class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        int n=asteroids.length;


        for(int ass:asteroids){
            if(ass>0){
                st.push(ass);
            }
            else{
                while(!st.isEmpty() &&st.peek()>0 && st.peek()<Math.abs(ass)){
                    st.pop();
                }
                if(!st.isEmpty() && st.peek()>0 && st.peek()==Math.abs(ass)){
                    st.pop();
                }
                else if(st.isEmpty() || st.peek()<0){
                        st.push(ass);
                }
            }
        }

        int [] arr=new int[st.size()];

        for(int i=0;i<st.size();i++){
            arr[i]=st.get(i);
        }
        return arr;
    }
}