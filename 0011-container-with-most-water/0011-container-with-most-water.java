class Solution {
    public int maxArea(int[] height) {
    int max=0;
    int area=0;
    int i=0;
    int j=height.length-1;
     while(i<j){

        area=(j-i)*Math.min(height[i],height[j]);
        // max=Math.max(max,area);
        if(area>max) max=area;
        if(height[i]<height[j]){
            i++;
        }else{
            j--;
        }

     }
         
    return max;
    }
}