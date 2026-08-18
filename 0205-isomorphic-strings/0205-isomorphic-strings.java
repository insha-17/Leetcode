class Solution {
      public static boolean isIsomorphic(String s, String t) {
        HashMap <Character,Integer> m1 = new HashMap<>();
        HashMap <Character,Integer> m2 = new HashMap<>();

        char[] s1= s.toCharArray();
        char[] t1= t.toCharArray();

        for(int i=0;i<s.length();i++){
            m1.putIfAbsent(s1[i],i);
            m2.putIfAbsent(t1[i],i);
            if(!m1.get(s1[i]).equals(m2.get(t1[i]))){
            return false;
        }
        }
        
        
        return true;
    }
}