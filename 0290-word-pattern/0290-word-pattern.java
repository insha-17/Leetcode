class Solution {
    public boolean wordPattern(String pattern, String s) {
   
    String[] words =s.split(" "); 

       if(words.length!=pattern.length())return false;

       HashMap<Character,String> map=new HashMap<>();
       for(int i=0;i<words.length;i++){
        char key=pattern.charAt(i);
        String val=words[i];
        if(map.containsKey(key) ){
            if(!map.get(key).equals(val))return false;
        }
       map.put(key,val);

       }
       
        
       ArrayList <String> values = new ArrayList<>(map.values());
        Set<String> uniqueValues = new HashSet<>(values);
       if( values.size() != uniqueValues.size()) return false;
       return true;
    }
}