class Solution {
    public double[] getCollisionTimes(int[][] cars) {
        int n = cars.length;
        double[] ans = new double[n];
        Stack<Integer> stack = new Stack<>();

        for(int i = n - 1; i >= 0; i--) {

            int p = cars[i][0];
            int s = cars[i][1];

            ans[i] = -1;

            while(!stack.isEmpty()) {

                int j = stack.peek();
                int p2 = cars[j][0];
                int s2 = cars[j][1];

                if(s <= s2) {
                    stack.pop();
                }
                else {
                    double time = (double)(p2 - p) / (s - s2);

                    if(ans[j] == -1 || time <= ans[j]) {
                        ans[i] = time;
                        break;
                    }
                    else {
                        stack.pop();
                    }
                }
            }

            stack.push(i);
        }

        return ans;  
    }
}