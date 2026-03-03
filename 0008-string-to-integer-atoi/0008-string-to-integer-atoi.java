class Solution {
    public int myAtoi(String s) {
      s=s.trim();  
      int sign=1;
      int n=s.length();
      long result=0; 
      
      if (n==0) return 0;

      for(int i=0;i<n;i++){
       char ch=s.charAt(i);
        if(i==0 &&(ch=='+' || ch=='-')){
            if(ch=='-')sign=-1;
            continue;
        }
        if(Character.isDigit(ch)){
            result= result*10 +ch-'0';
        }else break;
        
        if(sign*result>Integer.MAX_VALUE)
        return Integer.MAX_VALUE;
        if(sign*result<Integer.MIN_VALUE)
        return Integer.MIN_VALUE;

      }  
      return (int)(sign*result);
    }
}






//  s = s.replace(" ", "").replace(".",""); 
//   StringBuilder sb=new StringBuilder(s); 
//       for(int i=0;i<sb.length();i++){
//         char ch=sb.charAt(i);
//         if(ch=='+' || ch=='-') sb.append(ch);
//         if(Character.isLetter(ch)) return 0;
//         else if( ch>0 && sb.isEmpty()) sb.append(ch);
//       } 
//       return Integer.parseInt(sb.toString());   