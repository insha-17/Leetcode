class Solution {
    public int maxFreqSum(String s) {
     HashMap<Character,Integer> map=new HashMap<>();
     for(char c:s.toCharArray()){
        map.put(c,map.getOrDefault(c,0)+1);
     }
    int vow=0;
    int cons=0;
    for(char ch:map.keySet()){
        if(isVowel(ch)){
            vow=Math.max(vow,map.get(ch));
        }else{
            cons=Math.max(cons,map.get(ch));
        }
    }
    return vow+cons;
    }
    public boolean isVowel(char ch){
        return "aeiou".indexOf(ch)!=-1;
    }
}