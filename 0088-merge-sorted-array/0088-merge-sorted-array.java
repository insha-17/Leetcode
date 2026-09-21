class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i = m+n-1;
        int mm=m-1;
        int nn =n-1;
        while(mm >=0 && nn>=0){
            if(nums1[mm]>nums2[nn]){
                nums1[i] = nums1[mm];
                mm--;
            }else{
                nums1[i] = nums2[nn];
                nn--;
            }
        i--;
        }
            // while(mm>=0){
            //     nums1[i]= nums1[mm];
            //     mm--;
            // }
        while(nn>=0){
            nums1[i]= nums2[nn];
            nn--;
            i--;
        }
        
    }
}