class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        //hashamp to store magazine as that is the parent string
      HashMap<Character,Integer> map=new HashMap<>();
    
      for(char ch:magazine.toCharArray()){
        map.put(ch,map.getOrDefault(ch,0)+1);
      }
    //traverse the ransomNote
      for(char c:ransomNote.toCharArray()){
        //if the char in ransomnote doesnt exist in maagazine
        if(map.get(c)==null) {return false;
        }
       int value=map.get(c);
       //if the key ,value pair doesnt satisfy the equality
       if(value==0) return false;
       //decrement the counter of the key,valuee 
       else map.put(c,value-1);
       
      }
     return true;
    }
}