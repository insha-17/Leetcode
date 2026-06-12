class Solution {
    public String reverseVowels(String s) {
      int n=s.length();
      char[] arr=s.toCharArray();

      int lp=0;
      int rp=n-1;
      while(lp<rp){
        if(isVowel(arr[lp])){
            while(lp<rp && !(isVowel(arr[rp]))){
                rp--;
            }
            char temp=arr[lp];
                arr[lp]=arr[rp];
                arr[rp]=temp;
                lp++;
                rp--;
        }else{
            lp++;
        }
      } 
      return String.valueOf(arr); 
    }

    public boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'
        || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            return true;
        }
        return false;
    }
}