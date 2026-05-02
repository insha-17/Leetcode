class Solution {
    public boolean lemonadeChange(int[] bills) {
     int n=bills.length;
     ArrayList<Integer> list=new ArrayList<>();
     for(int i =0;i<n;i++){
        if(bills[i]==5){
            list.add(5);
        }
        else if(bills[i]==10 ){
            if(list.contains(5)){
            list.remove(Integer.valueOf(5));
            list.add(10);}
            else return false;
        }
        else{
            if(list.contains(5) && list.contains(10)){
                list.remove(Integer.valueOf(5));
                list.remove(Integer.valueOf(10));
                list.add(20);
            }
            else if(Collections.frequency(list, 5) >= 3){
                list.remove(Integer.valueOf(5));
                list.remove(Integer.valueOf(5));
                list.remove(Integer.valueOf(5));
            }
            else return false;
        }
     }       
     return true;
    }
} 