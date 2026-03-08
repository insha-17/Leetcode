class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list=new ArrayList<>();
       for(int i=0;i<n;i++){
         if((i+1)%3==0 &&(i+1)%5==0){
            
           list.add(i,"FizzBuzz") ;
            }
            else if((i+1)%3==0){
                 list.add(i,"Fizz");
            }
            else if((i+1)%5==0){
            list.add(i,"Buzz") ;
         }
         else{
            list.add(String.valueOf(i+1));
         }
       } 
       return list;
    }
}