class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length())return "";
        int []arr=new int [128];
        for(int i=0;i<t.length();i++){
            arr[t.charAt(i)]++;
        }

        int l=0,r=0;
        int minLen=Integer.MAX_VALUE;
        int cnt=0;
        int sIndex=-1;

        while(r<s.length()){
            if(arr[s.charAt(r)]>0)cnt++;
            arr[s.charAt(r)]--;

            while(cnt==t.length()){
                if(r-l+1<minLen){
                    minLen=r-l+1;
                    sIndex=l;
                }
         
                arr[s.charAt(l)]++;
                if(arr[s.charAt(l)]>0){
                    cnt--;
                    }
                l++;
        
            }
            r++;
        }

        return sIndex==-1?"":s.substring(sIndex,sIndex+minLen);

      }
}