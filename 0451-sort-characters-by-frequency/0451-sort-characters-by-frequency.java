class Solution {
    public String frequencySort(String s) {
        
        if(s==null||s.length()==0) return "";
        
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        List<Character>[] bucket = new ArrayList[s.length() + 1];

        for (char c : map.keySet()) {
            int freq = map.get(c);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(c);
        }

          StringBuilder sb = new StringBuilder();

        for (int freq = bucket.length - 1; freq >= 1; freq--) {

            if (bucket[freq] != null) {

                for (char c : bucket[freq]) {

                    for (int i = 0; i < freq; i++) {
                        sb.append(c);
                    }

                }
            }
        }

        return sb.toString();
        
    //     List<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());
        
    //     list.sort((a,b) -> b.getValue()-a.getValue());
        
    //     StringBuilder sb=new StringBuilder();
        
    //     for(Map.Entry<Character,Integer> entry:list){
    //         for(int i=0;i<entry.getValue();i++){
    //          sb.append(entry.getKey());
    //         }
    //     }
    //   return sb.toString();
    }
}